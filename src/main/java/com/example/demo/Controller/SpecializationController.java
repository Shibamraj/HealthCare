package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.SpecializationService;
import com.example.demo.entity.Specialization;
@Controller
@RequestMapping("/spac")
public class SpecializationController {
	
	@Autowired
	private SpecializationService serv;
	
	@GetMapping("/all")
	public String ViewAll(Model model)
	{
		List<Specialization> list=serv.getAllSpecialization();
		model.addAttribute("list",list);
		return "SpecializationData";
	}
	
	
	
}
