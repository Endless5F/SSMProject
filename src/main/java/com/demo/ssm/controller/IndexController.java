package com.demo.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/a")
    @ResponseBody
    public String indexTest() {
        return "this is index";
    }

    @GetMapping("/view")
    public ModelAndView indexHtml() {
        return new ModelAndView("./index.html");
    }
}
