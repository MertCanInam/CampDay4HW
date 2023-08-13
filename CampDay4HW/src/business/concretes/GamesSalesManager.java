package business.concretes;

import business.abstracts.GamesSalesService;
import dataAccess.abstracts.GamesSalesDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class GamesSalesManager implements GamesSalesService {
	private GamesSalesDao gamesSalesDao;
	
	public GamesSalesManager(GamesSalesDao gamesSalesDao)
	{
		this.gamesSalesDao = gamesSalesDao;
	}
	
	
	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		this.gamesSalesDao.buy(gamer, game, campaign);
	}
	
}
