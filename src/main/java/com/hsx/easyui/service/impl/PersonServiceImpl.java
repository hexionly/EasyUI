package com.hsx.easyui.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hsx.easyui.domain.Person;
import com.hsx.easyui.domain.vo.PersonQueryVo;
import com.hsx.easyui.mapper.PersonMapper;
import com.hsx.easyui.service.PersonService;

/**
 * @author HEXIONLY
 * @Date 2021年7月6日下午9:53:05
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper personMapper;

	@Override
	public Person getPersonInfoById(Integer id) {
		if (id == null) {
			return null;
		}
		return personMapper.getPersonInfoById(id);
	}

	@Override
	public Map<String, Object> selectPersonList(PersonQueryVo personQueryVo) {
		PageHelper.startPage(personQueryVo.getPage(), personQueryVo.getRows());
		List<Person> persons = personMapper.selectPersonList(personQueryVo);
		PageInfo<Person> pageInfo = new PageInfo<>(persons);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;
	}

	@Override
	public Map<String, Object> addPerson(Person person) {
		Map<String, Object> map = new HashMap<>();
		if (personMapper.addPerson(person) > 0) {
			map.put("code", 200);
			map.put("msg", "添加成功。");
			return map;
		} else {
			map.put("code", 400);
			map.put("msg", "添加失败！");
			return map;
		}
	}

	@Override
	public Map<String, Object> removeBeatch(Integer[] ids) {
		Map<String, Object> map = new HashMap<>();
		if (personMapper.removeBeatch(ids) > 0) {
			map.put("code", 200);
			map.put("msg", "删除成功。");
			return map;
		} else {
			map.put("code", 400);
			map.put("msg", "删除失败！");
			return map;
		}
	}
}
