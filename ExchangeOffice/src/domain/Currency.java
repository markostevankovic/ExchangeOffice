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
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currencyName == null) ? 0 : currencyName.hashCode());
		result = prime * result + ((currencySymbol == null) ? 0 : currencySymbol.hashCode());
		result = prime * result + ((exchangeRate == null) ? 0 : exchangeRate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Currency))
			return false;
		Currency other = (Currency) obj;
		if (currencyName == null) 
		{
			if (other.currencyName != null)
				return false;
		}
		else if (!currencyName.equals(other.currencyName))
			return false;
		if (currencySymbol == null) 
		{
			if (other.currencySymbol != null)
				return false;
		} 
		else if (!currencySymbol.equals(other.currencySymbol))
			return false;
		if (exchangeRate == null) 
		{
			if (other.exchangeRate != null)
				return false;
		} 
		else if (!exchangeRate.equals(other.exchangeRate))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Currency:" +
				"\n\tcurrency name: " + this.getCurrencyName() + 
				"\n\tcurrency symbol: " + this.getCurrencySymbol() +
				"\n\texchange rate: " + this.getExchangeRate().toString();
	}	
}
