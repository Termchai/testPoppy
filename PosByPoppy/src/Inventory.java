import java.util.ArrayList;

public class Inventory {
    private static Inventory instance;
	private ArrayList<Item> itemList = new ArrayList<Item>();
    private Inventory()
    {
    	
    }
    public static Inventory getInstance()
    {
    	if(instance == null)
    	 instance = new Inventory();
    	return instance;
    }
	public boolean addNewItem(String code,String name,int quantity) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getProductCode().equals(code))
				return false;

		}

		itemList.add(new Item(code,name,quantity));
		return true;

	}
	
	public void print()
	{
		
		for(int i = 0;i<itemList.size();i++)
		{
			System.out.println(itemList.get(i).toString());
		}
	}
	public void addItemQuantity(String code,int quantity)
	{
		for(int i =0;i<itemList.size();i++)
		{
			if (itemList.get(i).getProductCode().equals(code))
			{
				itemList.get(i).addItemQuantity(quantity);
			}
		}
	}
}
