package business.abstracts;

import entities.concretes.Gamer;

public interface GamerService {
	public void register(Gamer gamer);
	public void update(Gamer gamer);
	public void delete(Gamer gamer);
}
