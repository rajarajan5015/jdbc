package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@Autowired
	Playerinformation pi;

	@GetMapping("/getplayer")
	public List<Player> findall() {
		return pi.findAll();
	}

	@PostMapping("/player")
	public String savedetails(@RequestBody Player a) {
		pi.savedetails(a);
		return "data has been saved sucessfully";
	}

	@DeleteMapping("delete/{id}")
	public String deletevalues(@PathVariable int id) {
		pi.deletevalues(id);
		return "delete";
	}
}
