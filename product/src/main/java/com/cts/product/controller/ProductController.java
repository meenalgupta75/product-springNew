package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("AddProduct.html")
	public String getLoginPage(){
		return "AddProduct";
	}
}
