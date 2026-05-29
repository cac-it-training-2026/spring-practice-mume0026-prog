package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q01.form.BmiForm;

@Controller
public class Practice0401Controller {

	@RequestMapping(path = "/bmi/input", method = RequestMethod.GET)
	public String Input() {
		return "practice04/01/bmi_input";
	}

	@RequestMapping(path = "/bmi/result", method = RequestMethod.POST)
	public String Result(BmiForm form, Model model) {
		double heightM = form.getHeight() / 100.0;
		Double bmi = form.getWeight() / (heightM * heightM);
		form.setBmi(bmi);
		model.addAttribute("name", form.getName());
		model.addAttribute("height", form.getHeight());
		model.addAttribute("weight", form.getWeight());
		model.addAttribute("bmi", form.getBmi());

		return "practice04/01/bmi_result";
	}
}
