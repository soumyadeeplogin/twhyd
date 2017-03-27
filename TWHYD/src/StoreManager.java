import java.util.Scanner;
import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class StoreManager {
	
	int finalPrice[];
	
	public StoreManager(int invSize) {
		finalPrice = new int[invSize];
	}

	private void priceIt(int ptr, String brandName, String wearType, double cost)
	{
		finalPrice[ptr] = new DiscountCalculator().getDiscountedPrice(brandName, wearType, cost);
	}
	
	private void printIt(String saleStream){
		int total = 0;
		StringTokenizer st = new StringTokenizer(saleStream, ",");
		while (st.hasMoreTokens()) {  
	           total+=finalPrice[Integer.parseInt(st.nextToken())];
	     }
		System.out.println(total);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Inv :: ");
		int invSize = sc.nextInt();
		StoreManager sm = new StoreManager(invSize);
		sc.nextLine();
		for(int i=0; i<invSize; i++){
			System.out.print("Line " + i + " :: ");
			String inp =  sc.nextLine();
			String[] str = inp.split(",");
			sm.priceIt(i, str[1],str[2],Double.parseDouble(str[3]));
		}
		
		int custChoices = sc.nextInt();
		for(int i=0; i<custChoices; i++){
			String inp = sc.nextLine();
			sm.printIt(inp);
		}
		sc.close();
	}
	
	
}
