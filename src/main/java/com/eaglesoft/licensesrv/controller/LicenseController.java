package com.eaglesoft.licensesrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/license-srv")
public class LicenseController {

    @GetMapping(value = "/getLicense")
    public String getLicense() {
        return "Hello";
    }

}
