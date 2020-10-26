package com.zbb.myLibrary.restApi;

import javax.persistence.MappedSuperclass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	@GetMapping(path="/login")
 public String getLoginController(Model model) {
	 return "login";
 }
}
