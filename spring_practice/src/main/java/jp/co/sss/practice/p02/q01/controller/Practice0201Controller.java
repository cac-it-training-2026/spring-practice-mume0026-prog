package jp.co.sss.practice.p02.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0201Controller {

	@RequestMapping(path = "/first")
	public String First() {
		return "practice02/01/before_redirect";
	}

	@RequestMapping(path = "/second")
	public String Second() {
		return "redirect:/third";
	}

	@RequestMapping(path = "/third")
	public String Third() {
		return "practice02/01/after_redirect";
	}
}
