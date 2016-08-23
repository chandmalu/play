package com.chand.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private final AtomicLong counter=new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		
		return new Greeting(counter.incrementAndGet(),name);
		
	}
			
}
