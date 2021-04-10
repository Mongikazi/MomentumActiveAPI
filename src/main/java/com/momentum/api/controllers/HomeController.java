package com.momentum.api.controllers;

import com.momentum.api.Infrastructure.utils.Connection;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping(value = "/")
    public String welcome() {
        return new Connection().toString();
    }
}
