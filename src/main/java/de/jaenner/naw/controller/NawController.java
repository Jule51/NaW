package de.jaenner.naw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import de.jaenner.bo.User;
import de.jaenner.naw.dao.NawDao;

@Controller
public class NawController {
	@Autowired
	NawDao dao;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest httpRequest, HttpServletResponse httpResponse,
		@RequestParam(required = false) String account) {
		System.out.println("RequestMapping / ");
		
		return "welcome";
	}
	
	@GetMapping(value="/data")
	public @ResponseBody String data() {
		return "DATA";
	}
	
	@GetMapping(value="/map")
	public @ResponseBody Map<String, Object> map() {
		Map<String, Object> rueckgabeMap = new HashMap<String, Object>();
		rueckgabeMap.put("Name", "Jule");
		return rueckgabeMap;
	}
	
	@GetMapping(value="/team", params="team")
	public @ResponseBody List<User> list(@RequestParam String team_id) {
		return dao.team(team_id);
	}
	
	@GetMapping(value="/admin")
	public @ResponseBody List<User> getAdmin() {
		return dao.admin();
	}
}
