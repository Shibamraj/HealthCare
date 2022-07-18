package com.example.demo.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Service.DoctorService;

import com.example.demo.entity.Doctor;


@RequestMapping("/Doctor")
@Controller
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	

	@GetMapping("/registration")
	public String register(@RequestParam(value = "message", required=false)String message,Model model)
	{
		model.addAttribute("message",message);
		
		return "register";
		
	}
	@PostMapping("/save")
	public String Save(@ModelAttribute Doctor doc,RedirectAttributes attribute)
	{
		Long id=service.SaveDoctro(doc);
		
		String message=("Employe"+id+"Saved");
		attribute.addAttribute("message",message);
		return "redirect:registration";
		
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Long id,Model model,RedirectAttributes attributes)
	
	{
	              service.DeleteDoctor(id);
	              
	              attributes.addAttribute("message","Doctor("+id+")deleted");
	              return "redirect:all";
	
	}
	
	@PostMapping("/update")
	public String Update(@ModelAttribute Doctor doc,RedirectAttributes attributes)
	{
		service.UpdateDoctor(doc);
		attributes.addAttribute("message","doctor("+doc.getId()+")Updated");
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String Viwe( Model model,@RequestParam(value="message", required=false)String message)
	{
		
   List<Doctor> list=service.ShowAll();
		
		model.addAttribute("list", list);
		
		model.addAttribute("message",message);
		return "ShowPage";
	}
	
	
	public String Edit(@RequestParam long id, Model model)
	{
		
		
		Doctor doc=service.EditDoctor(id);
		
		model.addAttribute("doc",doc);
		
		return "Editpage";
		
	}
	
	
	
	
	
}
