package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User on 04.08.2016.
 */
@Controller
public class errorsController {
    @RequestMapping(value = "/errorpage", method = RequestMethod.GET)
    public ModelAndView returnErrorPage(){
        return new ModelAndView("errorPages/errorpage");
    }
}
