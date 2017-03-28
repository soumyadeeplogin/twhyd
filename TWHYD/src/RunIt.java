import java.util.Scanner;

public class RunIt {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Inv :: ");
		int invSize = sc.nextInt();
		StoreManager sm = new StoreManager(invSize);
		sc.nextLine();
		for(int i=0; i<invSize; i++){
			//System.out.print("Line " + (i+1) + " :: ");
			String inp =  sc.nextLine();
			String[] str = inp.split(",");
			sm.priceIt(i, str[1],str[2],Double.parseDouble(str[3]));
		}
		
		int custChoices = sc.nextInt();
		sc.nextLine();
		String result = "";
		for(int i=0; i<custChoices; i++){
			String inp = sc.nextLine();
			result += sm.printIt(inp)+"\n";
		}
		System.out.println(result);
		sc.close();
	}	
}
