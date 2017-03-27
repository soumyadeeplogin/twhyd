import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class InventoryHandler {
	private List<String> ancCatDiscount;
	private HashMap<String, Double> catDiscount;
	private HashMap<String, Double> brandDiscount;
	
	public InventoryHandler(){
		catDiscount = new HashMap<>(6);
		catDiscount.put("Shirts", 0.00);
		catDiscount.put("Trousers", 0.00);
		catDiscount.put("Casuals", 0.30);
		catDiscount.put("Jeans", 0.20);
		catDiscount.put("Dresses", 0.00);
		catDiscount.put("Footwear", 0.00);
		
		ancCatDiscount = new ArrayList<String>();
		ancCatDiscount.add("Dresses");
		ancCatDiscount.add("Footwear");
		
		brandDiscount = new HashMap<>();
		brandDiscount.put(" Wrangler",0.10);
		brandDiscount.put(" Arrow",0.20);
		brandDiscount.put(" Vero Moda",0.60);
		brandDiscount.put(" UCB",0.00);
		brandDiscount.put(" Adidas",0.05);
		brandDiscount.put(" Provogue",0.20);
		
	}
	
	public double getBrandDiscount(String brand) {
		return brandDiscount.get(brand);
	}
	
	public double getAncestorCatDiscount(String wearType) {
		if(ancCatDiscount.contains(wearType))
			return new Double(0.50);
		else
			return new Double(0.00);
	}
	
	public double getCatDiscount(String wearType) {
		return catDiscount.get(wearType);
	}
}
