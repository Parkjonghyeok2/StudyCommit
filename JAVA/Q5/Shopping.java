package Homeclass;
import java.util.*;


public class Shopping {
	
	Scanner ex = new Scanner(System.in);
	LinkedList<Cart> carts= new LinkedList<Cart>();
	private Item Item;

	public void shoppingMenu() {
		System.out.println("1. ī���Ӵ� \n 2. īƮ �ݳ� \n 3. �������� \n ���� �Է� : ");
		int a = ex.nextInt();
		
		if(a==1)
			rentCart();
		else if(a==2) {
			System.out.println("�ݳ��ϴ� ����� �̸��� �Է�>>");
			String name = ex.next();
			for(int i =0; i<carts.size(); i++) {
				Cart cart1 = carts.get(i);
				String name1 = cart1.getName();
				if(name == name1) {
				returnCart(cart1);}
			}
		}
		else {
			System.out.println("������ �����մϴ�.");
		}
	}

	public Cart rentCart() {//����� �̸��� ���� ��ü�� ��ȯ
		System.out.print("(�Ӵ�)����� �̸� �Է� >>");
		String name = ex.next();
		Cart cart = new Cart(name);
		carts.add(cart); //����� �̸����� ��ü�� �����ϰ� �� ��ü�� �迭�� �߰�
		return cart;
	}
	public void returnCart(Cart cart) {
		for(int i =0; i<carts.size();i++) {
			Cart cart1 = carts.get(i);
			if(cart == cart1)
				carts.remove(cart);
	}
	}
	public void cartMenu(Cart cart) {//��ƮīƮ �޼���� ���� ��ü�� ����ؾ��Ѵ�.
		System.out.println("------------------------ \n 1. īƮ�� ��ǰ �߰� \n 2. īƮ�� ���� �߰� \n 3. īƮ ��ǰ ���� \n 4. īƮ ��ǰ ��� \n 5. īƮ ���� ���� ���� \n ī�� ���� �Է� : ");
		int num = ex.nextInt();
		if(num==1) {
			
		}
	}
	public void cartActionAdd(Cart cart) {
		carts.add(cart.addCart(Item item));
	
	}
	public void cartAction()
	{
		}
	}
