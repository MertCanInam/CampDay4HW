package dataAccess.concretes;

import dataAccess.abstracts.GamesSalesDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class GamesSales implements GamesSalesDao {
	private Gamer gamer;
	private Game game;
	private Campaign campaign;

	public GamesSales(Gamer gamer, Game game, Campaign campaign) {
		this.gamer = gamer;
		this.game = game;
		this.campaign = campaign;
	}

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" bought the "+game.getGameName()+" with this " + campaign.getCampaignName());
	}
	
	
}
