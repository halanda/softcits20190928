package catchup4;

public enum Moblie
{
	Nokia("WindowsPhone",4000), Samsung("Android", 5000),
	iPhone("iOS", 6000), MI("Android", 1999),Vivo("Android", 3000),
	BlavkBerry("Android", 2500), HuaWei("Android", 2500),
	HTC("Android",3400), BlackBerry("Android", 2500);
	
	private final String os;
	private final float price;
	private Moblie(String os,float price)
	{
		this.os    = os;
		this.price = price;
	}
	public String getOs()
	{
		return this.os;
	}
	public float getPrice()
	{
		return this.price;
	}
}
