package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import com.sist.web.service.*;
import com.sist.web.vo.*;
@Controller
public class MainController {
	@GetMapping("/main")
	public String main(Model model) {
		model.addAttribute("main_html","main/home");
		return "main";
	}
}
