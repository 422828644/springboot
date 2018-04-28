package org.huikao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2018/3/1.
 */
@Controller
@RequestMapping
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.org/");
        return "index";
    }
}
