package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String savePage(Model model) {
		model.addAttribute("player",new Player());
		return "addPlayer" ; 
	}
	
	
	//localhost8080:player/fifa/players/savePlayer
	@PostMapping("/savePlayer")
	public String addUser(@ModelAttribute("player") Player player,Model model) {
		playerSerivce.savePlayer(player);
	/*	List<Player> players;

		players = playerSerivce.allPlayers();
		
		model.addAttribute("players",players);*/
		return "redirect:/fifa/players";
		
	}
	
	@GetMapping("/showplayer")
	public String showPlayer(@RequestParam("playerId")int id,Model model) {
		Player p = playerSerivce.showPlayer(id);
		model.addAttribute("player",p);
	//	m.addAttribute("EditPlayer",p);
		return "addPlayer";
		
	}
	
	@GetMapping("/deleteplayer")
	public String deletePlayer(@RequestParam("playerId")int id,Model model) {
		Player p = playerSerivce.showPlayer(id);
		playerSerivce.deletePlayer(p);
	//	m.addAttribute("EditPlayer",p);
		return "redirect:/fifa/players";
		
	}
	
	
}
