package com.spring.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Player;

@Repository
public class PlayerDaoImpl implements PlayerDAO {

	@Autowired
	private SessionFactory sessionFactory ; 
	
	
	@Autowired
	public PlayerDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

 

	@Override
	public List<Player> getPlayers() {
		Session session = sessionFactory.getCurrentSession();
		
		Query<Player> query = session.createQuery("from Player order by name asc",Player.class);
		return query.getResultList();
	}


	
	@Override
	public void addPlayers(Player player) {

		Session session = sessionFactory.getCurrentSession();

		
		session.saveOrUpdate(player);
		
	}

}
