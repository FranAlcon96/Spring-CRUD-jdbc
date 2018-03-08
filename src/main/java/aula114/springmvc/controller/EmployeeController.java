package aula114.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import aula114.springmvc.service.EmployeeService;
import aula114.springmvc.service.EmployeeServiceImpl;
import aula114.springmvc.domain.Empleado;

import java.util.List;
import java.util.ArrayList;

@Controller
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;
  
  @RequestMapping("/emp")
  public String emp(Model model) {
     List<Empleado> list = new ArrayList<Empleado>();
     list = employeeService.getAll();
     model.addAttribute("list", list);
     System.out.println(list.get(0).getDepartamento());
     return "emp";
  }
  
  @RequestMapping("/save")
  public String insertar(Model model) {
	return "save";
  }

  @RequestMapping(value="empform", method=RequestMethod.POST)
  public String formsave(@ModelAttribute Empleado e) {
  	employeeService.save(e);
  	return "redirect:emp";
  }

  @RequestMapping("/set")
  public String set(Model model) {
	return "set";
  }

  @RequestMapping(value="empformset", method=RequestMethod.POST)
  public String formset(@RequestParam("id") int id,@RequestParam("nombre") String nombre,@RequestParam("profesion") String profesion,@RequestParam("departamento") String departamento ) {
  	employeeService.set(id,nombre,profesion,departamento);
  	return "redirect:/emp";
  }
  
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable int id) {
   employeeService.delete(id);
   return "redirect:/emp";
  }
  
  
  
}
