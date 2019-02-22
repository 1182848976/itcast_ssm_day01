package com.itheima.controller;

import com.itheima.service.ProductService;
import com.itheima.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    private String findAll(Model model){
        List<Product> list = productService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
