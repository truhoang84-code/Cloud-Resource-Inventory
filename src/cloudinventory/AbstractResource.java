package cloudinventory;

public abstract class AbstractResource implements CloudResource {
	String name;
	String region;
	double monthlyPrice;
	
	public AbstractResource(String name, String region, double monthlyPrice)
	{
		this.name = name;
		this.region = region;
		this.monthlyPrice = monthlyPrice;
	}
	public abstract double getCost(); 
	public abstract String getStatus();
	public String describe()
	{
		return name + " (" + region + "): $" + monthlyPrice + "/month";
	}
}
