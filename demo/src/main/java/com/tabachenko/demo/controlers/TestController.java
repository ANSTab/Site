package com.tabachenko.demo.controlers;

import com.tabachenko.demo.model.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @GetMapping("/np")
    public String test(Model model) {
        Test test = new Test();
        model.addAttribute("test", test);
        return "NovaPoshta";
    }

    @PostMapping("/np")
    public String create(@ModelAttribute("test") Test test) {
               System.out.println(test);
        return "NovaPoshtaTest";
    }


}
