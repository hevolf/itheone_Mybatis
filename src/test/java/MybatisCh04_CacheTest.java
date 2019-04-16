
import com.itheone.mybatis.entity.TUser;
import com.itheone.mybatis.mapper.TJobHistoryMapper;
import com.itheone.mybatis.mapper.TUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class MybatisCh04_CacheTest {
	
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void init() throws IOException {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 1.读取mybatis配置文件创SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		inputStream.close();
	}

	/**
	 * 一级缓存存在于 SqlSession 的生命周期中  线程独享
	 */
	@Test
	public void Test1LevelCache(){
		SqlSession session1 = sqlSessionFactory.openSession();
		TUserMapper userMapper1 = session1.getMapper(TUserMapper.class);
		String email = "qq.com";
		Byte sex = 1;
		//第一次从数据库查，会打印sql语句
		//list1 和 list2 取的同一个对象
		List<TUser> list1 = userMapper1.selectByEmailAndSex2(email, sex);
		System.out.println(list1.size());
		
		
		////增删改操作会清空一级缓存和二级缓存
		//TUser userInsert = new TUser();
		//userInsert.setUserName("test1");
		//userInsert.setRealName("realname1");
		//userInsert.setEmail("myemail1");
		//userMapper1.insert1(userInsert);
		
		//直接从缓存中获取，不走数据库
		List<TUser> list2 = userMapper1.selectByEmailAndSex2(email, sex);
		System.out.println(list2.toString());
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("email", email);
		map.put("sex", sex);

		//参数不同，重新走数据库查 一级缓存不生效
		List<TUser> list3 = userMapper1.selectByEmailAndSex1(map);
		System.out.println(list3.toString());
		session1.close();
		//更新sqlsession 重新从数据库查 一级缓存不生效
		SqlSession session2 = sqlSessionFactory.openSession();
		TUserMapper userMapper2 = session2.getMapper(TUserMapper.class);
		List<TUser> list4 = userMapper2.selectByEmailAndSex2(email, sex);
		System.out.println(list2.toString());
		session1.close();
	}

	/**
	 * 二级缓存以namesapce为单位，存在于sqlsesionfactory生命周期中，可用于sqlsession间共享  线程共享
	 */
	@Test
	public void Test2LevelCache(){
		SqlSession session1 = sqlSessionFactory.openSession();
		TUserMapper userMapper1 = session1.getMapper(TUserMapper.class);
		String email = "qq.com";
		Byte sex = 1;
		List<TUser> list1 = userMapper1.selectByEmailAndSex2(email, sex);
		System.out.println(list1.size());
		
		
//		TUser userInsert = new TUser();
//		userInsert.setUserName("test1");
//		userInsert.setRealName("realname1");
//		userInsert.setEmail("myemail1");
//		userMapper1.insert1(userInsert);

		//先开启二级缓存<cache></cache>
		//  Cache Hit Ratio 命中二级缓存 会打印命中率  list2 和list1 是同一个对象（命中一级缓存）
		//先查二级缓存 查到返回；没查到查一级缓存；一级缓存没查到查DB
		List<TUser> list2 = userMapper1.selectByEmailAndSex2(email, sex);
		System.out.println(list2.toString());
		session1.close();
		
		//命中二级缓存  但list3 和list2 list1 不是同一个对象
		SqlSession session2 = sqlSessionFactory.openSession();
		TUserMapper userMapper2 = session2.getMapper(TUserMapper.class);
		List<TUser> list3 = userMapper2.selectByEmailAndSex2(email, sex);
		System.out.println(list3.toString());
		session2.close();

		//TJobHistoryMapper  新的namespace 二级缓存不生效
		SqlSession session3 = sqlSessionFactory.openSession();
		TJobHistoryMapper userMapper3 = session3.getMapper(TJobHistoryMapper.class);
		//List<TUser> list4 = userMapper3.selectByEmailAndSex2(email, sex);
		//System.out.println(list4.toString());
		session3.close();

		
	}

}
