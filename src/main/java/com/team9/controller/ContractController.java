package com.team9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 18/2/28.
 */
@Controller
public class ContractController {


    @RequestMapping(value = {"/declare"})
    public String declare() {

        return "module04/declare";
    }

    @RequestMapping(value = {"/pendingtask"})
    public String PendingTask() {

        return "module04/pendingtask";
    }

    @RequestMapping(value = {"/examination"})
    public String Examination() {

        return "module04/examination";
    }

    @RequestMapping(value = {"/dotask"})
    public String DoTask() {

        return "module04/dotask";
    }

}
