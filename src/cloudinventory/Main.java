package cloudinventory;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		EC2Instance firstInstance = new EC2Instance("WebServer1", "us-east-1", 15.00, "t2.micro");
		EC2Instance secondInstance = new EC2Instance("AppServer-Prod", "us-west-2", 20.00, "t3.medium");
		EC2Instance thirdInstance = new EC2Instance("WebServer3", "eu-west-3", 50.00,"m5.large");
		
		ArrayList<CloudResource> instances = new ArrayList<CloudResource>();
		instances.add(firstInstance);
		instances.add(secondInstance);
		instances.add(thirdInstance);
		
		for(CloudResource n : instances) 
		{
			System.out.println(n.describe());
			
		}
	}

}
