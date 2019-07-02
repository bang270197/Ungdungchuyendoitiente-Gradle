package com.codegym.Controller;

import com.codegym.Persistence.ConvertPersistenceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class ProductController {

    @GetMapping(value = "/list")
    public ModelAndView showProducts( Model model) {

        ModelAndView modelAndView= new ModelAndView("/product/list");
        return modelAndView;
    }

    @GetMapping(value = "/showList")
    public ModelAndView showProducts(@RequestParam("usd") float usd, Model model) {
        ConvertPersistenceImpl persistence=new ConvertPersistenceImpl();
        float vnd=persistence.convert(usd);
        model.addAttribute("vnd",vnd);
        ModelAndView modelAndView= new ModelAndView("/product/showList");
        return modelAndView;
    }


}
