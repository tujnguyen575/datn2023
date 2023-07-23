package com.handsmade.datn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.handsmade.datn.Model.UserModel;
import com.handsmade.datn.ServiceImpl.UserServiceImpl;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomepageController {

    @Autowired
    UserServiceImpl userSrv;

    /**
     * @param user
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/")
    public String submitHomepage(@RequestBody UserModel user,
                                 Model model,
                                 HttpSession session){
        boolean status = false;        
        status = userSrv.isValidCredential(user.getEmail(), user.getPassword());

        if (status){
            String fullname = userSrv.getFName(user.getEmail());
            session.setAttribute("fullname", fullname);
            return "index";
        }  
        String msg = "Thông tin đăng nhập sai, vui lòng nhập lại!";
        model.addAttribute("msg", msg);     
        return "login";
    }

    @GetMapping("/")
    public String goHomepage(){        
        return "index";

    }
}
