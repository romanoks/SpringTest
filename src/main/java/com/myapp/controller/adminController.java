package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.servlet.ModelAndView;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 05.08.2016.
 */
@Controller
@RequestMapping(value="/admin")
public class adminController {
    @RequestMapping(value="/")
    public ModelAndView admin(ModelMap map){
        ModelAndView model = new ModelAndView();
        model.addAllObjects(map.addAttribute("Username", "maybeAdmin"));
        model.setViewName("admin/adminStartPage");
        return model;
    }

    @RequestMapping(value="/news", method= RequestMethod.GET)
    public ModelAndView newsListGet(@RequestParam HashMap <String, String> request){
        request.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.println(request.toString());

        List<String>  list = new ArrayList<>();
        list.add("News are article");
        list.add("Article");
        ModelAndView model = new ModelAndView();
        model.addAllObjects(new ModelMap().addAttribute("news", list).addAttribute("Username", "Admin"));
        model.setViewName("admin/newslist");
        return model;
    }

    @RequestMapping(value="/news", method= RequestMethod.POST)
    public ModelAndView newsListPost(@RequestParam HashMap <String, String> request, ModelMap modelMap){
        modelMap.get("color");
        request.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.println(request.toString());
        List<String>  list = new ArrayList<>();
        list.add("News are article");
        list.add("Article");
        ModelAndView model = new ModelAndView();
        model.addAllObjects(new ModelMap().addAttribute("news", list).addAttribute("Username", "Admin").addAttribute("fields",request));
        model.setViewName("admin/newslist");
        return model;
    }
}
