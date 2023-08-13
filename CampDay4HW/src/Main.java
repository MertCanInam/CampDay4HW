import java.lang.System.Logger;

import business.abstracts.CampaignService;
import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.abstracts.GamesSalesService;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.GamerManager;
import business.concretes.GamesSalesManager;
import dataAccess.abstracts.GamesSalesDao;
import dataAccess.concretes.GamesSales;
import dataAccess.concretes.HibernateCampaignDao;
import dataAccess.concretes.HibernateGameDao;
import dataAccess.concretes.HibernateGamerDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("621","Mert","İnam","01.01.01");
		GamerService gamerManager = new GamerManager(new HibernateGamerDao());
		gamerManager.register(gamer1);
		
		CampaignService campaignService = new CampaignManager(new HibernateCampaignDao());
		Campaign campaign = new Campaign(1,"Company Campaign",15.5,"25.10.2026");
		campaignService.add(campaign);
		
		GameService gameService = new GameManager(new HibernateGameDao());
		Game game = new Game(1,"Stronghold Crusader","War",12.5);
		gameService.add(game);
		
		GamesSalesService gamesSalesService = new GamesSalesManager(new GamesSales(gamer1, game, campaign));
		gamesSalesService.buy(gamer1, game, campaign);
			
	
		
		

	

}
}
