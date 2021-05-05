package java_campD4_HW3;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckServise{

	@Override
	public boolean checkUser(User user) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result = true;
		
				
		try {
			
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationaltyNumber()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getBirthDate().getYear());
	
		
		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		
	}

}
