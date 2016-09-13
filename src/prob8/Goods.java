package prob8;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getCountStock(){
		return countStock;
	}
	public void setCountStock(int countStock){
		this.countStock = countStock;
	}
	
	public void printInfo(){
		System.out.println(getName()+"(가격: "+getPrice()+"원)이 "+getCountStock()+"개 입고되었습니다.");
	}

}
