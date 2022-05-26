package Homeclass;
import java.util.*;
import java.util.Scanner;

public class Cart {
	private 
	Scanner ex = new Scanner(System.in);
	LinkedList<Item> itemList = new LinkedList<Item>();
	String name = "";
	
	public Cart(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addCart(Item item) {
		for(int i =0; i<itemList.size(); i++) {
			Item item1 = itemList.get(i);
			int quatityItem = item1.getQuatity();
			if(item == item1) {
				System.out.println("�̹� �ִ� �������Դϴ�");
				quatityItem++;
				item1.setQuatity(quatityItem);
			}
			else {
				itemList.add(item);
				System.out.println("�ش� �������� �߰��Ǿ����ϴ�.");
			}
			}
	}
	public void removeCart(String name) {
		for(int i =0; i<itemList.size(); i++) {
			Item item1 = itemList.get(i);
			String name1 = item1.getName();
			if(name== name1) {
				itemList.remove(i);
			}
		}
	}
	public void updateCart(String name) {
		for (int i =0; i<itemList.size(); i++) {
			Item item1 = itemList.get(i);
			String name1 = item1.getName();
			if(name == name1) {
				System.out.print("������ �󸶳� �����Ͻðڽ��ϱ�>>");
				int range = ex.nextInt();
				int quatity = item1.getQuatity();
				quatity +=range;
				item1.setQuatity(quatity);
			}
		}
	}
	public void emptyCart() {
		itemList.clear();
	}
	public void printItems() {
		for (Item item:itemList) {
			System.out.println(item);
		}
		/*System.out.println(itemList)*/
	}
}
