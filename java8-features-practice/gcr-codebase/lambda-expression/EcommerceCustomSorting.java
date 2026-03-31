import java.util.*;
class Product{
	int price;
	double rating;
	int discount;
	Product(int price,double rating,int discount){
		this.price=price;
		this.rating=rating;
		this.discount=discount;
	}
}
public class EcommerceCustomSorting{
	public static void main(String[] args){
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product(500,4.2,10));
		list.add(new Product(300,4.8,2));
		list.add(new Product(800,3.9,5));
		Comparator<Product> c = (a,b)->a.price-b.price;
		Collections.sort(list,c);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).price+" "+list.get(i).rating+" "+list.get(i).discount);
		}
		System.out.println();
		Collections.sort(list,(a,b)->Double.compare(b.rating,a.rating));
		Collections.sort(list,(a,b)->b.discount-a.discount);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).price+" "+list.get(i).rating+" "+list.get(i).discount);
		}
	}
}
