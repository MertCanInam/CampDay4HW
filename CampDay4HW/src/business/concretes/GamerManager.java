package business.concretes;

import business.abstracts.GamerService;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {
	private GamerDao gamerdao;
	
	public GamerManager(GamerDao gamerDao)
	{
		this.gamerdao = gamerDao;
	}

	@Override
	public void register(Gamer gamer) {
		this.gamerdao.register(gamer);
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	
	
}
