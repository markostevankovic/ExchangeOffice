package domain;

import java.util.Date;

public class ExchangeRate
{
private Date date;
	
	private double buyingExchangeRate;
	private double sellingExchangeRate;
	private double middleExchangeRate;
	
	public ExchangeRate(Date date, double buyingExchangeRate, double sellingExchangeRate, double middleExchangeRate) 
	{
		this.setDate(date);
		this.setBuyingExchangeRate(buyingExchangeRate);
		this.setSellingExchangeRate(sellingExchangeRate);
		this.setMiddleExchangeRate();
	}

	public Date getDate() 
	{
		return date;
	}

	public void setDate(Date date)
	{
		if(date == null)
			throw new RuntimeException("Date could not be null!");
		this.date = date;
	}

	public double getBuyingExchangeRate() 
	{
		return buyingExchangeRate;
	}

	public void setBuyingExchangeRate(double buyingExchangeRate)
	{
		if(buyingExchangeRate <= 0)
			throw new RuntimeException("Buying exchange rate must be a positive real number!");
		this.buyingExchangeRate = buyingExchangeRate;
	}

	public double getSellingExchangeRate() 
	{
		return sellingExchangeRate;
	}

	public void setSellingExchangeRate(double sellingExchangeRate)
	{
		if(sellingExchangeRate <= 0)
			throw new RuntimeException("Selling exchange rate must be a positive real number!");
		this.sellingExchangeRate = sellingExchangeRate;
	}

	public double getMiddleExchangeRate() 
	{
		return middleExchangeRate;
	}

	public void setMiddleExchangeRate()
	{
		this.middleExchangeRate = (this.getBuyingExchangeRate() + this.getSellingExchangeRate()) / 2.0;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(buyingExchangeRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		temp = Double.doubleToLongBits(middleExchangeRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellingExchangeRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ExchangeRate))
			return false;
		ExchangeRate other = (ExchangeRate) obj;
		if (Double.doubleToLongBits(buyingExchangeRate) != Double.doubleToLongBits(other.buyingExchangeRate))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(middleExchangeRate) != Double.doubleToLongBits(other.middleExchangeRate))
			return false;
		if (Double.doubleToLongBits(sellingExchangeRate) != Double.doubleToLongBits(other.sellingExchangeRate))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "ExchangeRate" + 
				"\n\tdate: " + this.getDate()+ 
				"\n\tbuying exchange rate: " + this.getBuyingExchangeRate() + 
				"\n\tselling exchange rate: " + this.getSellingExchangeRate() + 
				"\n\tmiddle exchange rate: " + this.getMiddleExchangeRate();
	}	
}
