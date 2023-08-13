package entities.concretes;

public class Campaign {
	private int id;
	private String campaignName;
	private double discount;
	private String campaignDate;
	public Campaign(int id, String campaignName, double discount, String campaignDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.campaignDate = campaignDate;
	}
	public Campaign() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getCampaignDate() {
		return campaignDate;
	}
	public void setCampaignDate(String campaignDate) {
		this.campaignDate = campaignDate;
	}
	
	
	
	
}
