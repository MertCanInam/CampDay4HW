package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" is added!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" is updated!");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" is deleted!");
		
	}
	
	
}
