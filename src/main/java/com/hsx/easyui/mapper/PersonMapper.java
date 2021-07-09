package com.hsx.easyui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hsx.easyui.domain.Person;
import com.hsx.easyui.domain.vo.PersonQueryVo;

/**
 * @author HEXIONLY
 * @Date 2021年7月6日下午9:52:20
 */
@Mapper
public interface PersonMapper {

	@Select("select id,name,age,sex,phone,address from person where id=#{id}")
	Person getPersonInfoById(@Param("id") Integer id);

	@Insert("insert into person values(null,#{name},#{age},#{sex},#{phone},#{address})")
	int addPerson(Person person);

	List<Person> selectPersonList(PersonQueryVo personQueryVo);

	int removeBeatch(@Param("ids") Integer[] ids);
}
