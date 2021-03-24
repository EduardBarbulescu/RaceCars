import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		for(int j=0;j<10;j++)
		{
			Scanner file = new Scanner(new File("File"+ j + ".txt"));
			int lenght;
			lenght = file.nextInt();
		
		
		Instant start = Instant.now();
	
		ArrayList<Car> car = new ArrayList<Car>(10);
		for(int i=0;i<lenght;i++)
		{
			Car c = new Car("Car"+i,0);
			car.add(c);
		}
		int k=1;
		while(k==1)
		{
			for(int i=0;i<10;i++)
			{
				car.get(i).randomSpeedChange();
				car.get(i).accelerate(2);
				car.get(i).deaccelerate(2);
				car.get(i).locationchange();
				if(car.get(i).getLocation()==1000)
				{
					k=0;
				}
			}
		}
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		
		for(int i=0;i<lenght;i++)
		{
			if(car.get(i).getLocation()==1000)
			{
				
				System.out.println("Race-Number: " + (j + 1) + ", Car-ID: " + car.get(i).getName() + ", Time: " + timeElapsed.toMillis() + "ms");

			}
		}
		
		car.clear();
		}
	}
		
	}


