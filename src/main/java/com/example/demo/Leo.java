package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Leo {
	@GetMapping("/indhee")
	public String jsp()
	{
		return "NewFile.jsp";
	}

}
