class DiscountCalculator {
	
	public int getDiscountedPrice(String brandName, String wearType, double cost){
		
		return 0;
	}
	private double getDiscount(String brandName,String wearType){
		InventoryHandler ih = new InventoryHandler();
		double brandDiscount = ih.getBrandDiscount(brandName);
		double catDiscount = ih.getCatDiscount(wearType);
		double ancDiscount = ih.getAncestorCatDiscount(wearType);
		
		if(brandDiscount > catDiscount)
		{
			if(brandDiscount > ancDiscount)
			{
				return brandDiscount;
			}
			else {
				return ancDiscount;
			}
		} 
		else 
		{
			if(catDiscount > ancDiscount)
			{
				return catDiscount;
			}
			else
			{
				return ancDiscount;
			}
		}
	}
	
	private int calculateDiscount(double discount, double cost)
	{
		int finalPrice = (int) (cost - (cost*discount));
		return finalPrice;
	}

}
