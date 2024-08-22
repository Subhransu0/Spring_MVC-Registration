package in.sonu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sonu.main.entity.User;
import in.sonu.main.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return "register";
	}

	@RequestMapping(path = "/createuser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("image") String img, Model m) {
		user.setImage(img);
		userService.registerUser(user);
		m.addAttribute("msg", "Register Successfully");

		return "redirect:/register";

	}

}
