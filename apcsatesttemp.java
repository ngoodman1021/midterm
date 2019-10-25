import java.util.Scanner;

public class apcsatesttemp {
	
	private static Scanner in = newe Scanner(System.in){
		public static void main(String[] args){
			
			apcsatesttemp ts = new apcsatesttemp();
			ts.temp();
		}
		
		int fahrenheit;
		int celsius;
		int kelvin
		
		public void temp(){
			System.out.print("\n Enter an origin scale: ");
			char oScale = in.next.charAt(0);
			oScale = Character.toUpperCase(oScale);
			System.out.print("\n Enter a destination scale: ");
			char dScale = in.next.charAt(0);
			dScale = Character.toUpperCase(dScale);
			System.out.print("\n Enter a temperature: ");
			double temp = in.nextDouble();
			
			
			if (oScale != 'F' && oScale != 'C' && oScale != 'K'){
				System.out.print("\nInvalid entry.");
				oScale = in.nextInt();
			}else if (dScale != 'F' && dScale != 'C' && dScale != 'K'){
				System.out.print("\nInvalid entry.");
				dScale = in.nextInt();
			}else if ( oScale == 'C' ){
				if(dScale == 'F'){
					int fahrenheit = (temp *(9/5)) + 32; 
					int celsius = temp;
					System.out.println("%.2f\n", fahrenheit + "equals" + celsius);
				}else if(dScale == 'K'){
					int kelvin = temp + 273.15; 
					int celsius = temp;
					System.out.println("%.2f\n", kelvin + "equals" + celsius);
			}else if ( oScale == 'F' ){
				if(dScale == 'C'){
					int celsius = (temp - 32) * (9/5); 
					int fahrenheit = temp;
					System.out.println("%.2f\n", celsius + "equals" + fahrenheit);
				}else if(dScale == 'K'){
					int kelvin = ((temp - 32) * (9/5)) + 273.15; 
					int fahrenheit = temp;
					System.out.println("%.2f\n", kelvin + "equals" + fahrenheit);
				}
			}else if ( oScale == 'C' ){
				if(dScale == 'F'){
					int celsius = temp - 273.15; 
					int kelvin = temp;
					System.out.println("%.2f\n", celsius + "equals" + kelvin);
				}else if(dScale == 'K'){
					int fahrenheit = ((temp - 273.15) *(9/5)) + 32; 
					int kelvin = temp;
					System.out.println("%.2f\n", fahrenheit + "equals" + kelvin);
				}
			}
		}
	}
}
}