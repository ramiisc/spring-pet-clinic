package com.rpotluru.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rpotluru.springpetclinic.services.OwnerService;

@Controller
@RequestMapping("owners")
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "index", "index.html" })
	public String listOwner(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";

	}

	@RequestMapping({"find","/find"})
	public String find() {
		return "notImplemented";
		
	}
}
