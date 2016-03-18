package exchange_office_interface;

import java.util.Date;

import domain.Currency;
import domain.ExchangeRate;

public interface EchangeOfficeInterface 
{
	 void addNewExchangeRate(Currency currency, Date date, double buyingEchangeRate, double sellingExchangeRate);
	
	public void removeGivenExchangeRate(Currency currency, Date date);
	
	public ExchangeRate getExchangeRate(Currency currency, Date date);	
}
