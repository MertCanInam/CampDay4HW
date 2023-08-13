package dataAccess.abstracts;

import entities.concretes.Gamer;

public interface GamerDao {
	public void register(Gamer gamer);
	public void update(Gamer gamer);
	public void delete(Gamer gamer);
}
