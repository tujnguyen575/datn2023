package com.handsmade.datn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.handsmade.datn.Model.LoginModel;

@Controller
public class HomepageController {

    /**
     * @param user
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/")
    public String submitHomepage(@ModelAttribute("user") LoginModel user,
                                 Model model){
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/")
    public String goHomepage(Model model){ 
        return "index";

    }
}
