/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

 
import com.cibt.web.entity.Student;
import com.cibt.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ideapad-520S
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        
        model.addAttribute("students", 
                studentService.feachAll());
        return "index";
    }
    
    @GetMapping(value = "/about")
    @ResponseBody
     public Student about(){
         return new Student(1,"Sagar","Upreti",
                 "sagarup@gmail.com","24354656", true);
     }
}
