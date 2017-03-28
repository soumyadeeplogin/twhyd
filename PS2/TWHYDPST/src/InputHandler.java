import java.util.Scanner;

public class InputHandler {
	public String[] getStations(){
		
		String[] srcdsc = new String[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Source Station Code:");
		srcdsc[0] = sc.nextLine();
		System.out.println("Enter Destination Station Code:");
		srcdsc[1] = sc.nextLine();
		sc.close();
		return srcdsc;		
	}
}
