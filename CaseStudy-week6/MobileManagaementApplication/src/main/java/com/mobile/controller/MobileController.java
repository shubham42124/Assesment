package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	MobileService service;
	@PostMapping("/addMobile")
	public Mobile addmobile(@RequestBody Mobile mb) {
		return service.addmobile(mb);
	
	}
	@PutMapping("/updateMobile")
	public Mobile updatemobile( @RequestBody Mobile mb) {
	return 	service.updatemobile(mb);
		
	}
	
	@GetMapping("/getMobile/{mid}")
	public Mobile getmobile(@PathVariable("mid") int mobileId) {
	return	service.getmobile(mobileId);
	
	}
	@GetMapping("/getAllMobiles")
	public List< Mobile >getAllmobiles() {
		
	return 	service.getAllmobiles();
		
	}
	@DeleteMapping("/deleteMobile/{mid}")
	public String deletemobile( @PathVariable("mid") int mobileId) {
	return 	service.deletemobile(mobileId);
		
	}
}
