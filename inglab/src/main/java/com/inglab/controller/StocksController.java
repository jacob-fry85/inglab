package com.inglab.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inglab.entity.Stocks;
import com.inglab.service.StocksService;

@Controller
public class StocksController {
	private Logger logger = LoggerFactory.getLogger(StocksController.class);
	
	@Autowired
	private StocksService stockService;
	
//	@GetMapping("/store")
//	public String index(Model model){ 
//		return "store_data";
//	}
	
	@GetMapping("/index")
	public String index(Model model) { 
		Stocks stocks = new Stocks();
			
		model.addAttribute("pageTitle", "Stock Gainer/Loser");	
		model.addAttribute("stocks", stocks);		
		return "index";
	}
	
	@GetMapping("/store/new")
	public String newUser(Model model) { 
		Stocks stocks = new Stocks();
			
		model.addAttribute("pageTitle", "Stock Gainer/Loser");	
		model.addAttribute("stocks", stocks);		
		return "store_data";
	}

	
	@PostMapping("/store/save")
	public String saveUser(Stocks stocks, RedirectAttributes redirectAttributes) {
		stockService.saveGainerLoser(stocks);
		
		redirectAttributes.addFlashAttribute("message", "Data successfully saved!");
		
		return "redirect:/store/new";
	}
} 

