package com.scan.web.controller;

import org.apache.ibatis.javassist.bytecode.analysis.Analyzer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scan.domain.Picture;
import com.scan.domain.ReturnData;

@RestController
@RequestMapping("/picture")
public class PictureController {

	@RequestMapping("/post")
	@ResponseBody
	public ReturnData ret(@RequestBody Picture picture) {
		
	}
}
