package org.huikao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2018/3/28.
 */
@Controller
@RequestMapping
public class ClockController {

    @RequestMapping(value = "/clock", method = RequestMethod.GET)
    public String getClock() {
        return "test/js/clock";
    }
}
