package com.hsx.easyui.service;

import java.util.Map;

import com.hsx.easyui.domain.Person;
import com.hsx.easyui.domain.vo.PersonQueryVo;

/**
 * @author HEXIONLY
 * @Date 2021年7月6日下午9:52:43
 */
public interface PersonService {

	Person getPersonInfoById(Integer id);

	Map<String, Object> addPerson(Person person);

	Map<String, Object> selectPersonList(PersonQueryVo personQueryVo);

	Map<String, Object> removeBeatch(Integer[] ids);
}
