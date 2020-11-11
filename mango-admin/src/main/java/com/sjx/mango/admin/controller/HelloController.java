package com.sjx.mango.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sjx
 */
@RestController
public class HelloController{
        @GetMapping(value="/Hello")
        public String hello() {
            return "Hello from HelloController";
        }
}
