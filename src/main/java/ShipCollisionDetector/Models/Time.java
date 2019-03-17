package detector;

public class Time {

	double amount;
	String timeType; 
	
	Time(double amount, String timeType)
	{
		this.amount = amount;
		this.timeType = timeType; // s, m (60s), h (60m)
		convertTime();
	}
	
	private void convertTime()
	{
		switch(timeType)
		{
			case "s": break;
			case "m": amount*=60; break;
			case "h": amount*=3600; break;
		}
		
		timeType = "s";
	}
	
	public double as(String timeType)
	{
		double returnAmount=amount;
		
		switch(timeType)
		{
			case "s": break;
			case "m": returnAmount=amount/60; break;
			case "h": returnAmount=amount/3600; break;
		}
		
		return returnAmount;
	}
	
	public void multiplication(double scalar)
	{
		amount*=scalar;
	}
	
	public void add(Time time)
	{
		Time t = new Time(time.getAmount(), time.getType());
		amount += t.getAmount();
	}
	
	public void subtraction(Time time)
	{
		Time t = new Time(time.getAmount(), time.getType());
		amount -= t.getAmount();
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String getType()
	{
		return timeType;
	}
	
	public boolean compare(Time time)
	{
		Time t = new Time(time.getAmount(), time.getType());
		
		return (amount==t.getAmount())?true:false;
		
	}
}
