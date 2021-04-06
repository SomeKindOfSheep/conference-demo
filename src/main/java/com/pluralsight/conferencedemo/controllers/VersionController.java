package com.pluralsight.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("version")
public class VersionController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping
    public Map getStatus() {
        Map versionMap = new HashMap<String, String>();
        versionMap.put("app-version", appVersion);
        return versionMap;
    }
}


