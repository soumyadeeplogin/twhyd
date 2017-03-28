public class DistanceAndCostFinder {

	String src;
	String dst;
	
	String[] x1 = {"A11","C14"};
	String[] x2 = {"B10","A20"};
	String[] x3 = {"B2","C9"};
	
	public DistanceAndCostFinder(String src, String dst){
		this.src = src;
		this.dst = dst;
	}
	
	public int findDistance(String src, String dst){
		int iSrc = Integer.parseInt(src.substring(1,src.length()));
		int iDst = Integer.parseInt(dst.substring(1,dst.length()));
		return Math.abs(iSrc-iDst);
	}
	
	public double getCost(double unitCost, int distance){
		return distance*unitCost;
	}
	
	public String[] getDistanceAndCost(){
		String distCost[] = new String[2]; 
		int distance = 0;
		double cost = 10;
		if(src.charAt(0)==dst.charAt(0) && src.charAt(0)!='X') //Same line
		{
			double lineCost = 0;
			if(src.charAt(0)=='A')
				lineCost = 2.50;
			else if(src.charAt(0)=='B')
				lineCost = 2.00;
			else if(src.charAt(0)=='C')
				lineCost  = 3.00;
			
			distance += findDistance(src, dst);
			cost += getCost(lineCost, distance-3);
			
			
			
			distCost[0] = String.valueOf(distance);
			distCost[1] = String.valueOf(cost);
		} 
		else //Different line
		{
			
		}
		return distCost;
	}
}
