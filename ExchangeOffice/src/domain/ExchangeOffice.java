package domain;

import java.util.ArrayList;
import java.util.Date;

import exchange_office_interface.EchangeOfficeInterface;

public class ExchangeOffice implements EchangeOfficeInterface
{
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
		
		throw new RuntimeException("Given currency with specific date not found!");
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
