package in.sanjay.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	//@RequestMapping("/export")
	@GetMapping("/export")
	public String showdata( ) {
		System.out.println("from export data");
		return "redirect:show";
	}
	
	//@RequestMapping("/data")
	@GetMapping("/show")
	public String findMsg() {
		System.out.println("find message");
		return "Data";
	}
}
