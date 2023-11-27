package com.spring.smart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Admin")
public class AdminController {

	
	@RequestMapping("/loginadmin")
	public String LoginAdmin()
	{
		return "admin/adminLogin";
	}
	
	
	
	
}
