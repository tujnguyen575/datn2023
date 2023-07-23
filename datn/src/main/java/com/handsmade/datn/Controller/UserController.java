package com.handsmade.datn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.handsmade.datn.Entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
    @GetMapping("/login")
    public String goLogin(){
        return "login";
    }

    @GetMapping("/register")
    public String goRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String createUser(@RequestBody User user,Model model,HttpServletRequest request){
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


