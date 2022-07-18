package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Service.ISpecializationService;
import com.example.demo.entity.Specialization;

public class SpecializationController {

	@Autowired
	private ISpecializationService service;
	
	
	@GetMapping("/SpecPage")
	public String SpecPage(Model model,@RequestParam (value="message", required=false)String message)
	{
		model.addAttribute("message",message);
		return "SpecPage";
	}
	
	@PostMapping("/save")
public String Save(@ModelAttribute Specialization spec,Model model)
{
	
	Long id=service.SaveSpecialization(spec);
	String message="Spec"+id+"Created";
	model.addAttribute("message",message);
	
	return "SpecPage";
}
	
	@GetMapping("/all")
	public String Show(Model model,@RequestParam(value = "message", required=false)String message)
	
	{
		
		List<Specialization> list=service.ShowAll();
		model.addAttribute("list",list);
		model.addAttribute("message",message);
		return "showPage";
	}
	
	@GetMapping("/delete")
	public String Delete(@RequestParam long id,Model model,RedirectAttributes attribute)
	{
		service.DeleteSpecialization(id);
		
	//	String message="spec"+id+"Deleted";
	// model.addAttribute("message",message);
	 // Or
	 attribute.addAttribute("message","spec"+id+"deleted");
		return"redirect:all";
	}
	
	@GetMapping("/edit")
	public String Edit(@RequestParam Long id, Model model,RedirectAttributes attribute)
	{
Specialization spec=		service.EditSpecialization(id);

model.addAttribute("spec",spec);

		
		return"redirect:all";
	}
	
	@PostMapping("/update")
	public String Update(@ModelAttribute Specialization spec,RedirectAttributes attribute)
	{
		
		service.UpdateSpecialization(spec);
		attribute.addAttribute("message","spec("+spec.getSpecId()+") Updated");
	return "redirect:all";
	}
	
	
	public String specCodeCheck(@RequestParam String SpecCode)
	{
		String message="";
		if(service.isSpecCodeExist(SpecCode))
		{
			message=SpecCode+"Already Present";
		}
		
		return "message";
	}


	

	
	
	
	
	
}