package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Player;
import com.spring.service.PlayerServiceImpl;

//localhost8080:player/Fifa

@Controller
@RequestMapping("/Fifa")
public class PlayerController {
	
	
	PlayerServiceImpl playerSerivce ;
	
	
	 
	@GetMapping("/players")
	public List<Player> getplayers(){
		return playerSerivce.allPlayers();	
	}
	@Autowired
	public PlayerServiceImpl getPlayerSerivce() {
		return playerSerivce;
	}

	public void setPlayerSerivce(PlayerServiceImpl playerSerivce) {
		this.playerSerivce = playerSerivce;
	}
	
	
}
