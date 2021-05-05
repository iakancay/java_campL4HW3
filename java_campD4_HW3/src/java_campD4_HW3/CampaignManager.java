package java_campD4_HW3;

import java.util.Date;

public class CampaignManager implements DatabaseService {

	@Override
	public void update(Entity entity) {
		System.out.println("Campaign updated");
		
	}

	@Override
	public void delete(Entity entity) {
		System.out.println("Campaign deleted.");
		
	}
	
	public void addCampaign(Campaign campaign) {
		
		System.out.println("'"+campaign.getCampaignName()+"' campaign added db successfully. ");
	}
		

}
