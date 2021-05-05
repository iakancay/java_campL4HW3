package java_campD4_HW3;

import java.util.Date;

public class Campaign extends Entity {
	private int id;
	private String campaignName;
	private int rateOfSale;
	private Date campaignStartDate;
	private Date campaignFinishDate;
	
	public Campaign(int id, String campaignName, int rateOfSale, Date campaignStartDate, Date campaignFinishDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.rateOfSale = rateOfSale;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
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
	public int getRateOfSale() {
		return rateOfSale;
	}
	public void setRateOfSale(int rateOfSale) {
		this.rateOfSale = rateOfSale;
	}
	public Date getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public Date getCampaignFinishDate() {
		return campaignFinishDate;
	}
	public void setCampaignFinishDate(Date campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}

}
