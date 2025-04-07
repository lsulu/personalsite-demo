/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edifact.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author rgarcia
 */
@Controller
public class HomeController {
    
    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
    @GetMapping({"/", "/projects"})
    public String projects() {
        return "projects";
    }
    @GetMapping({"/", "/resume"})
    public String resume() {
        return "resume";
    }
    @GetMapping({"/", "/contact"})
    public String contact() {
        return "resume";
    }
}
