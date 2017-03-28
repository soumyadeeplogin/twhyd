
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Printer().printTicker("Kukatpally", "Charminar", 18, 46.50);
		//new InputHandler().getStations();
		//System.out.println(StationCodeFinder.getStationName("X3"));
		String[] srcDst = new String[2];
		srcDst = new InputHandler().getStations();
		String src = StationCodeFinder.getStationName(srcDst[0]);
		String dst = StationCodeFinder.getStationName(srcDst[1]);
		new Printer().printTicker(src, dst, 18, 46.50);
	}

}
