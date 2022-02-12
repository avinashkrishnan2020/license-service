package com.eaglesoft.licensesrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/license-srv")
public class LicenseController {

    @GetMapping(value = "/get-license")
    public String getLicense() {
        return "Hello";
    }

}
