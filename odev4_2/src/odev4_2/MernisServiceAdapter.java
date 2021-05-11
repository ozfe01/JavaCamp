package odev4_2;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkPerson(Customer customer) {
		KPSPublicSoap soap = new KPSPublicSoapProxy();
		boolean result=true;

        try {
            result= soap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()) ,
                    customer.getFirstName().toUpperCase() ,
                    customer.getLastName().toUpperCase() ,
                    customer.getBirthYear());


        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (result) {
            return true;
        }
        else {
            return false;
        }

    }
}
