package enumeration_p;

import java.util.Enumeration;
import java.util.Vector;

public class BalloonDriver {
	
public static void main(String[] args) {
		
		Balloon b1=new Balloon(50,"Green");
		Balloon b2=new Balloon(40,"Blue");
		Balloon b3=new Balloon(20,"Red");
		Vector v=new Vector();
		v.add(b1);
		v.add(b2);
		v.add(b3);
		
		Enumeration<Balloon> enu=v.elements();
		
		while(enu.hasMoreElements())
		{
			Balloon b=enu.nextElement();
			if(b.getCost()==50)
			{
				b.display();				
			}
			if(b.getColor().equalsIgnoreCase("Red"))
			{
				System.out.println(b.getCost());				
			}
			
		}
	}

}
