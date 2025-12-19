import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int celsiumTemp = sc.nextInt();
    	int fahrenheitTemp = (celsiumTemp*(9/5))+32;
    	System.out.println("Tempreature in fahrenheit is: "+fahrenheitTemp);
    	sc.close();
    }
}
