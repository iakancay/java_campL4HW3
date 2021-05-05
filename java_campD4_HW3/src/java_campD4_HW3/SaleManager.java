package java_campD4_HW3;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" bought "+game.getGameName()+" game.");
		
	}

	@Override
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" bought "+game.getGameName()+" game "+game.getPrice()*(100-campaign.getRateOfSale())/100+" TL with '"+campaign.getCampaignName()+"' campaign.");
		
	}

}
