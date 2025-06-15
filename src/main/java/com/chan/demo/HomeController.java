package com.chan.demo;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.eclipse.jdt.internal.compiler.lookup.InferenceContext18.getParameter;

@Controller
public class HomeController  {

    @RequestMapping("/")
    public String home (){
        System.out.println("Hello chandrkanth");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add (@RequestParam("num1") int num,@RequestParam("num2")  int nu, ModelAndView mv) {
        // public String add (HttpServletRequest req, HttpSession session) {
//       int num1= Integer.parseInt(req.getParameter("num1"));// label of the input number
//       int num2 = Integer.parseInt(req.getParameter("num2"));
       int result=num+nu;

        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

}
