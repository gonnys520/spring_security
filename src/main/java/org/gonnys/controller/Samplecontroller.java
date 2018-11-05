package org.gonnys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/sample/*")
public class Samplecontroller {
	
	
	@GetMapping("/all")
	public void doAll() {
		log.info("do all........................");
	}

	@GetMapping("/member")
	public void doMember() {
		log.info("do member.................");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("do admin.........................");
	}
}
