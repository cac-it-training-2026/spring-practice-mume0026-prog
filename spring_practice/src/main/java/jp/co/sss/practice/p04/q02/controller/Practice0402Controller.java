package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0402Controller {

	@RequestMapping(path = "/numguess/start", method = RequestMethod.GET)
	public String Start(HttpSession session) {
		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("hitNumber", hitNumber);
		return "practice04/02/numguess_start";
	}

	@RequestMapping(path = "/numguess/input", method = RequestMethod.GET)
	public String Input() {
		return "practice04/02/numguess_input";
	}

	@RequestMapping(path = "/numguess/judge", method = RequestMethod.GET)
	public String Judge(HttpSession session, Integer inputNum) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		if (hitNumber == inputNum) {
			return "redirect:/numguess/hit";
		} else {

			return "practice04/02/numguess_judge";
		}
	}

	@RequestMapping(path = "/numguess/hit", method = RequestMethod.GET)
	public String Hit(Model model, HttpSession session) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		model.addAttribute("message", "当たりです！ 正解は" + hitNumber + "でした。");
		session.invalidate();
		return "practice04/02/numguess_end";
	}
}
