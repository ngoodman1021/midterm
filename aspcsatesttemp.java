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
					int fahrenheit = (celsius *(9/5)) + 32; 
					System.out.println("%.2f\n", fahrenheit + "equals" + oScale);
				}else if(dScale == 'K'){
			}
		}
	}
}
