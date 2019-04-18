package com.itheone.mybatis.factory.real;

import com.itheone.mybatis.factory.product.JiaSmallMovie;
import com.itheone.mybatis.factory.product.SmallMovie;

public class JiaSmallMovieFactory implements SmallMovieFactory {

	@Override
	public SmallMovie createMovie() {
		SmallMovie smallMovie = new JiaSmallMovie("jia");
		//拍摄电影的过程及其复杂，非专业人士请勿模仿
		//…………
		//此处省略一万字
		return smallMovie;
	}
}
