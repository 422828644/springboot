package org.huikao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2018/4/12.
 */
@Controller("/")
public class SorryLetterController {

    @RequestMapping("sorry")
    public String getSorryLetter() {
        return "SorryLetter";
    }
}
