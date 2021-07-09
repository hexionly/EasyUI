package com.hsx.easyui.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HEXIONLY
 * @Date 2021年7月8日下午9:05:46
 */
@RequestMapping("/test")
@RestController
public class ValidatedController {

	@RequestMapping("demo")
	public String testDemo(@RequestHeader(value = "id", required = true, defaultValue = "12") Integer id,
			@RequestParam(value = "name", required = true, defaultValue = "hello") @Validated String name) {
		return "id=" + id + ", name=" + name;
	}
}
