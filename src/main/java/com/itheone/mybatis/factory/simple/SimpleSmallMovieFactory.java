package com.itheone.mybatis.factory.simple;

import com.itheone.mybatis.factory.product.CangSmallMovie;
import com.itheone.mybatis.factory.product.JiaSmallMovie;
import com.itheone.mybatis.factory.product.SmallMovie;

public class SimpleSmallMovieFactory implements SmallMovieFactory {

	@Override
	public SmallMovie createMovie(String actorName) {
		SmallMovie smallMovie = null;
		if(actorName.equals("cang")){
			smallMovie = new CangSmallMovie("苍老师");
		}else if(actorName.equals("jia")){
			smallMovie = new JiaSmallMovie("加老师");
		}else if(actorName.equals("chen")){
			smallMovie = new JiaSmallMovie("chen老师");
		}
		//拍摄电影的过程及其复杂，非专业人士请勿模仿
		//…………
		//此处省略一万字
		return smallMovie;
	}

}
