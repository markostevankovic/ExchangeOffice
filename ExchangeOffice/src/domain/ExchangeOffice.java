package domain;

import java.util.ArrayList;
import java.util.Date;

import exchange_office_interface.EchangeOfficeInterface;


/**
 * 
 * @author Marko Stevankovic, Advanced Java Programming Tools and Techniques, FON, 03.18.2016.
 *
 */
public class ExchangeOffice implements EchangeOfficeInterface
{
	/**
	 * ExchangeOffice consists of more different currencies...
	 * We upload these currencies from a database, from text file etc...
	 * There is no specific method for that upload...
	 */
	ArrayList<Currency> currencies = new ArrayList<Currency>();

	@Override
	public void addNewExchangeRate(Currency currency, Date date, double buyingEchangeRate, double sellingExchangeRate) 
	{		
		for(Currency temporaryCurrency : currencies)
			if(temporaryCurrency.equals(currency))
			{
				temporaryCurrency.getExchangeRate().add(new ExchangeRate(date, buyingEchangeRate, sellingExchangeRate));
				return;
			}
			throw new RuntimeException("Given currency not found!");
	}

	@Override
	public void removeGivenExchangeRate(Currency currency, Date date) 
	{
		for(Currency temporaryCurrency : currencies)
		{
			if(temporaryCurrency.equals(currency))
			{
				for(ExchangeRate er : temporaryCurrency.getExchangeRate())
				{
					if(er.getDate().equals(date))
					{
						temporaryCurrency.getExchangeRate().remove(er);
						return;
					}
				}
			}
		}
	}

	@Override
	public ExchangeRate getExchangeRate(Currency currency, Date date)
	{		
		for(Currency temporaryCurrency : currencies)
			if(temporaryCurrency.equals(currency))
				for(ExchangeRate temporaryExchangeRate : temporaryCurrency.getExchangeRate())
					if(temporaryExchangeRate.getDate().equals(date))
						return temporaryExchangeRate;
		
		throw new RuntimeException("Given currency with given date not found!");
	}
}
