package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" is added");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" is deleted");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" is updated");
		
	}
	
}
