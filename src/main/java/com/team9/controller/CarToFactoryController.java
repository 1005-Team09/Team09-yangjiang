package com.team9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 18/3/1.
 */
@Controller
public class CarToFactoryController {
    @RequestMapping(value = "/CarToFactory")
    public String CarToFactory(){
        return "module10/CarToFactory";
    }
    @RequestMapping(value = "/monitor")
    public String Monitor(){
        return "module10/monitor";
    }
    @RequestMapping(value = "/ysp")
    public String Ysp(){
        return "module10/ysp";
    }
}
