package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	private CampaignDao campaignDao;
	
	public CampaignManager(CampaignDao campaignDao)
	{
		this.campaignDao = campaignDao;
	}
	
	@Override
	public void add(Campaign campaign) {
		this.campaignDao.add(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDao.update(campaign);
	}

}
