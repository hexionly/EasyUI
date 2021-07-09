package com.hsx.easyui.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsx.easyui.domain.Person;
import com.hsx.easyui.domain.vo.PersonQueryVo;
import com.hsx.easyui.service.PersonService;

/**
 * @author HEXIONLY
 * @Date 2021年7月6日下午9:53:23
 */
@RequestMapping("/person")
@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	/**
	 * 根据id查询数据回调
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "update.do", method = RequestMethod.GET)
	public Person getPersonInfo(Integer id) {
		System.out.println(id);
		return personService.getPersonInfoById(id);
	}

	/**
	 * 添加成功，将成功的信息传递给前台
	 * @param person person
	 * @return
	 */
	@RequestMapping("add.do")
	public Map<String, Object> add(Person person) {
		System.out.println(person);
		return personService.addPerson(person);
	}

	/**
	 * 查询全部person信息，用列表显示
	 * @return
	 */
	@RequestMapping("show.do")
	public Map<String, Object> showAllPerson(PersonQueryVo personQueryVo) {
		System.out.println(personQueryVo.getKeyword());
		return personService.selectPersonList(personQueryVo);
	}

	/**
	 * 批量删除选中的数据
	 * @param ids
	 * @return
	 */
	@RequestMapping("removeBeatch.do")
	public Map<String, Object> removeBeatch(Integer[] ids) {
		return personService.removeBeatch(ids);
	}
}
