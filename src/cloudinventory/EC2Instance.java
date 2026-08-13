package cloudinventory;

public class EC2Instance extends AbstractResource 
{
	String instanceType;
	public EC2Instance(String name, String region, double monthlyPrice, String instanceType) 
	{
		super(name, region, monthlyPrice);
		this.instanceType = instanceType;
	}
	public double getCost() 
	{
		return monthlyPrice;
	}
	public String getStatus() 
	{
		return "running";
	}
}
