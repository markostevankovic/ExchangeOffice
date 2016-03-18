package domain;

import java.util.Date;

import exchange_office_interface.EchangeOfficeInterface;

public class ExchangeOffice implements EchangeOfficeInterface
{

	@Override
	public void addNewExchangeRate(Date date, double buyingEchangeRate, double sellingExchangeRate)
	{
	}

	@Override
	public void removeGivenExchangeRate(Date date) 
	{	
	}

	@Override
	public ExchangeRate getExchangeRate(Date date)
	{
		return null;
	}

}
