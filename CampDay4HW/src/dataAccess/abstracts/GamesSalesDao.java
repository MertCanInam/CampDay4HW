package dataAccess.abstracts;

import dataAccess.concretes.GamesSales;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface GamesSalesDao {
	public void buy(Gamer gamer, Game game, Campaign campaign);
}
