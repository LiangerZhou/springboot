package com.demo.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.demo.springboot.entity.User;


@Mapper
public interface UserMapper {

	@Select("SELECT * FROM user")
	@Results({
		@Result(property = "username", column = "username")
	})
	public List<User> getAll();
	
	@Select("SELECT * FROM user where id = #{id}")
	@Results({
		@Result(property = "username", column = "username"),
		@Result(property = "password", column = "password")
	})
	public User getOne(long id);

}
