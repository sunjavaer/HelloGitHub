package com.lvliang.learn.github.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGitHub {

	@GetMapping(path="/echo")
	public String echo() {
		return "hello, github";
	}
}
