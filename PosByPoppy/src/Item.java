
public class Item {

	private int quantity;
	private String productCode;
	private String name;
	 
	public Item(String code,String name,int quantity)
	{
		this.productCode = code;
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getProductCode()
	{
		return productCode;
	}
	public String getName()
	{
		return name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String toString()
	{
		return productCode + " " + name + " " + quantity;
	}
	public void addItemQuantity(int quantity)
	{
		this.quantity +=quantity;
	}
}
