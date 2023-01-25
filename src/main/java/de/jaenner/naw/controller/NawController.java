package de.jaenner.naw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.jaenner.naw.dao.NawDao;

@Controller
public class NawController {
	@Autowired
	NawDao dao;
	
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
	
	@GetMapping(value="/list")
	public @ResponseBody List<Map<String, Object>> list() {
		return dao.team();
	}
}
