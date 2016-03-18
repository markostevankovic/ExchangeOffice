package exchange_office_interface;

import java.util.Date;

import domain.Currency;
import domain.ExchangeRate;

/**
 * 
 * @author Marko Stevankovic
 *
 */

public interface EchangeOfficeInterface 
{
	/**
	 * 
	 * @param currency, we add exchange rate for specific currency,
	 * 					because our Exchange office contains a great number of currencies...
	 * @param date
	 * @param buyingEchangeRate
	 * @param sellingExchangeRate
	 */
	 void addNewExchangeRate(Currency currency, Date date, double buyingEchangeRate, double sellingExchangeRate);
	
	public void removeGivenExchangeRate(Currency currency, Date date);
	
	public ExchangeRate getExchangeRate(Currency currency, Date date);	
}
