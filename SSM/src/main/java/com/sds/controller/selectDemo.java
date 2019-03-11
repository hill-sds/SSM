package com.sds.controller;

import com.sds.service.selectIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class selectDemo {

    @Autowired
    public selectIdService sq;

    @ResponseBody
    @RequestMapping("select.action")
    public String selectId(String id) {
        String userId =id;
        System.out.println(id);
        int i  = sq.selectId();
        System.out.println(i);
        String p = "\"{id:\\\"23\\\",key2:\\\"value2\\\"}\"";
        System.out.println(p);
        return p;
    }
}
