package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Player;
import com.spring.service.PlayerService;
import com.spring.service.PlayerServiceImpl;

//localhost8080:player/fifa

@Controller
@RequestMapping("/fifa")
public class PlayerController {
	
	@Autowired
	PlayerService playerSerivce ;
	

	
	public PlayerController() {
	}
	 
	//localhost8080:player/fifa/players
	@GetMapping("/players")
	public String getplayers(Model model){
		
		List<Player> players;
		
		players = playerSerivce.allPlayers();
		
		model.addAttribute("players",players);
		
		return "fifa-players";	
	}
	
	//localhost8080:player/fifa/add
	@GetMapping("/add")
	public String savePage() {
		
		return "addPlayer" ; 
	}
	
	
	
}
