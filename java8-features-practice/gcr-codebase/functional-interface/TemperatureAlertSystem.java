
import java.util.*;
import java.util.function.*;
public class TemperatureAlertSystem{
	public static void main(String[] args){
		ArrayList<Double> temps=new ArrayList<>();
		temps.add(36.5);
		temps.add(38.2);
		temps.add(37.0);
		temps.add(39.1);
		Predicate<Double> p=t->t>37.0;
		for(int i=0;i<temps.size();i++){
			if(p.test(temps.get(i))){
				System.out.println("Alert "+temps.get(i));
			}
		}
	}
}
