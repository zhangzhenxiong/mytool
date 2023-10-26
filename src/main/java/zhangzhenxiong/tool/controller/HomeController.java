package zhangzhenxiong.tool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //a
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
