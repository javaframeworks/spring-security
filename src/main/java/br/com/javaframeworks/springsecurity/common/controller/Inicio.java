package br.com.javaframeworks.springsecurity.common.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
/**
 * Controller Spring MVC de exemplo para utilização do Spring Security
 * @author "Wagner Rondon"
 *
 */
@Controller
@RequestMapping("/inicio")
public class Inicio {
 
	@RequestMapping(method = RequestMethod.GET)
	public String inicio(ModelMap model) {
		model.addAttribute("mensagem", "Olá mundo do Spring Security!");
		return "ola";
	}
 
}