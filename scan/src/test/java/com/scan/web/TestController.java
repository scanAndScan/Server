package com.scan.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scan.domain.TestEntity;

@RestController
@RequestMapping("/test")
public class TestController {

	
	@RequestMapping("/")
	public TestEntity test() {
		TestEntity testEntity = new TestEntity();
		testEntity.setMessage("wooo! wonderful!");
		testEntity.setIfYouWantToPost("Please give me a json like {\"message\":\"yes,I'm wonderful\";\"ifYouWantToPost\":\"I post\"}");
		return testEntity;
	}
	
	@RequestMapping("/post")
	@ResponseBody
	public String post(@RequestBody TestEntity testEntity) {
		return "successful";
	}
	
}
