package exchange_office_interface;

import java.util.Date;

import domain.ExchangeRate;

public interface EchangeOfficeInterface 
{
	 void addNewExchangeRate(Date date, double buyingEchangeRate, double sellingExchangeRate);
	
	public void removeGivenExchangeRate(Date date);
	
	public ExchangeRate getExchangeRate(Date date);	
}
