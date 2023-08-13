package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface GamesSalesService {
	void buy(Gamer gamer, Game game, Campaign campaign);
	
}
