package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Annotation;

/**
 * Created by User on 03.08.2016.
 */
@Controller
public class welcomeController {
    @RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
    public ModelAndView welcome(){
        ModelAndView ret = new ModelAndView();
        ret.addAllObjects(new ModelMap().addAttribute("message", "I'll be back").addAttribute("userName","Vasia"));
        ret.setViewName("welcome");
        return ret;
    }

}
