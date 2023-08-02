package com.handsmade.datn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.handsmade.datn.Model.LoginModel;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
    @GetMapping("/login")
    public String goLogin(Model model){
        LoginModel user = new LoginModel();
        user.setEmail("Login@gmail");
        model.addAttribute("user", user);
        return "login";
    }

    @GetMapping("/register")
    public String goRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String createUser(Model model,HttpServletRequest request){
        Object nameString = request.getSession().getAttribute("username");
        model.addAttribute("username", nameString);           

        return "index";
    }

    @GetMapping("/logout")
    public String goLogout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "login";
    }
}


