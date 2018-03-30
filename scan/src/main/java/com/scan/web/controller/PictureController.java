package com.scan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scan.domain.Picture;
import com.scan.domain.ReturnData;
import com.scan.service.SpiderAnalyze;

@RestController
@RequestMapping("/picture")
public class PictureController {

	@Autowired
	SpiderAnalyze spiderAnalyze;
	
	@RequestMapping("/post")
	@ResponseBody
	public ReturnData ret(@RequestBody Picture picture) {
		return spiderAnalyze.analyze(picture);
	}
}
