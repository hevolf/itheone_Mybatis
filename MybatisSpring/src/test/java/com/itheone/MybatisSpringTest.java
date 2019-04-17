package com.itheone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itheone.mybatis.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ResourceUtils;

import com.itheone.mybatis.entity.TUser;
import com.itheone.mybatis.entity.TUserExample;
import com.itheone.mybatis.entity.TUserExample.Criteria;
import com.itheone.mybatis.mapper.TUserMapper;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisSpringTest {
	
	private SqlSessionFactory sqlSessionFactory;

	@Autowired
    private UserService us;
	
	

	@Before
	public void init() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 1.读取mybatis配置文件创SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		inputStream.close();
	}

	//spring 方式
	@Test
    public void testSpringMybatis(){
        System.out.println(us.getUserById(1).toString());
    }


	@Test
	public void testQueryExample(){
		// 2.获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 3.获取对应mapper
		TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
		// 4.执行查询语句并返回结果
		TUserExample example = new TUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailLike("%163.com");
		criteria.andSexEqualTo((byte) 2);
		
		List<TUser> selectByExample = mapper.selectByExample(example);
		System.out.println(selectByExample);

	}
	
	@Test
	public void mybatisGeneratorTest() throws FileNotFoundException{
		List<String> warnings = new ArrayList<String>();  
        boolean overwrite = true;
        String genCfg = "generatorConfig.xml";  
        File configFile = new File(getClass().getClassLoader().getResource(genCfg).getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);  
        Configuration config = null;  
        try {  
            config = cp.parseConfiguration(configFile);  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (XMLParserException e) {  
            e.printStackTrace();  
        }  
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
        MyBatisGenerator myBatisGenerator = null;  
        try {  
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);  
        } catch (InvalidConfigurationException e) {  
            e.printStackTrace();  
        }  
        try {  
            myBatisGenerator.generate(null);  
        } catch (SQLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }
	

}
