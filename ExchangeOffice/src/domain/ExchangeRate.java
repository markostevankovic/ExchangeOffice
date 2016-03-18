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
		this.date = date;
	}

	public double getBuyingExchangeRate() 
	{
		return buyingExchangeRate;
	}

	public void setBuyingExchangeRate(double buyingExchangeRate)
	{
		this.buyingExchangeRate = buyingExchangeRate;
	}

	public double getSellingExchangeRate() 
	{
		return sellingExchangeRate;
	}

	public void setSellingExchangeRate(double sellingExchangeRate)
	{
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
}
