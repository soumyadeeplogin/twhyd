
public class Driver {

	public static void main(String[] args) {

		String[] srcDst = new String[2];
		srcDst = new InputHandler().getStations();
		String src = StationCodeFinder.getStationName(srcDst[0]);
		String dst = StationCodeFinder.getStationName(srcDst[1]);
		String[] distCost = new String[2];
		distCost = new DistanceAndCostFinder(srcDst[0],srcDst[1]).getDistanceAndCost();
		new Printer().printTicker(src, dst, distCost[0], distCost[1]);
		
	}

}
