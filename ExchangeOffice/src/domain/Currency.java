package domain;

import java.util.ArrayList;

public class Currency 
{
	private String currencyName;
	private String currencySymbol;
	
	private ArrayList<ExchangeRate> exchangeRate = new ArrayList<ExchangeRate>();

	public Currency(String currencyName, String currencySymbol, ArrayList<ExchangeRate> exchangeRate)
	{
		this.setCurrencyName(currencyName);
		this.setCurrencySymbol(currencySymbol);
		this.setExchangeRate(exchangeRate);
	}

	public String getCurrencyName() 
	{
		return currencyName;
	}

	public void setCurrencyName(String currencyName)
	{
		this.currencyName = currencyName;
	}

	public String getCurrencySymbol() 
	{
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) 
	{
		this.currencySymbol = currencySymbol;
	}

	public ArrayList<ExchangeRate> getExchangeRate()
	{
		return exchangeRate;
	}

	public void setExchangeRate(ArrayList<ExchangeRate> exchangeRate) 
	{
		this.exchangeRate = exchangeRate;
	}
}
