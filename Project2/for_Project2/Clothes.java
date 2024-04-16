package for_Project2;


public enum Clothes{
	JEANS("Jeans"),
    SHIRT("Shirt"),
    DRESS("Dress"),
	SHOES("Shoes"), 
	HAT("Hat"), 
	SOCKS("Shock"), 
	SHORTS("Shorts"), 
	SCARF("Scarf"),
	JACKET("Jacket"), 
	SKIRT("Skirt"), 
	GLOVES("Gloves"), 
	COAT("Coat"), 
	T_SHIRT("T-Shirt"), 
	PANTS("Pants"), 
	SANDALS("Sandals"), 
	SUNGLASSES("Sunglasses"), 
	BELT("belt"), 
	RAINCOAT("Raincoat"), 
	FLIP_FLOPS("Flip_Flop"), 
	BOW_TIE("bow_Tie"), 
	SWEATER("Sweater"),
	BOOTS("Boots"), 
	PURSE("Purse");

	private String name;

	Clothes(String theName){
		this.name = theName;
	}

	public String getName()
{
	return this.name;
}
}