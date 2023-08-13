package dataAccess.concretes;


import dataAccess.abstracts.GamerDao;

import entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao {



	
	
	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" is registered to system with Hibernate");
		
		
	}


	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" is updated with Hibernate");
		
	}




	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" is deleted from system with Hibernate");
		
	}




	

}
