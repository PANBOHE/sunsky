package com.example.sunsky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这可真蠢
 * @author hepb
 *
 */
@RequestMapping("/demo")
@RestController
public class DemoController {
	@GetMapping("/testDemo")
	public String testDemo() {
		System.out.println("调用到了吗");
		return "这下可以了吧";
	}

}
