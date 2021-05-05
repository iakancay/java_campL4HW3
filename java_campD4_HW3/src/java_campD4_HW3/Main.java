package java_campD4_HW3;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		User user1= new User(1,"ibrahim","Akançay","25519194972", new Date(1987,12,07));
		UserManager userManager= new UserManager();
		Campaign campaign1=new Campaign(1, "Spring Campaign", 25, new Date(2020,05,04), new Date(2020,05,25));
		Game game1=new Game(3,"Roblox",100);
		CampaignManager campaignManager=new CampaignManager();
		SaleManager saleManager=new SaleManager();
		userManager.add(user1);
		userManager.delete(user1);
		userManager.update(user1);
		campaignManager.delete(campaign1);
		campaignManager.addCampaign(campaign1);
		saleManager.sale(user1, game1);
		saleManager.saleWithCampaign(user1, game1, campaign1); 

	}

}
