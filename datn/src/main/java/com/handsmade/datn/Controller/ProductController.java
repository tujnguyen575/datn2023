package com.handsmade.datn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    
    @GetMapping(path = "/item")
    public String goProduct(){
        return "item";
    }
}
