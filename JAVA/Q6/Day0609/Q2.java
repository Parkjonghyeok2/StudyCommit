package Day0609;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		Map<String, Integer> list = Map.of("���", 5000, "�ٳ���", 2000, "����", 3000, "����", 4000, "���", 6000);
		System.out.println("������ ���� \n���, �ٳ���, ����, ����, ���");
		System.out.print("������ �ϳ� ���ÿ� >>");
		String key = ex.next();
		System.out.println();
		if(list.containsKey(key)) {
			System.out.println(key + "�� ������" + list.get(key) + "�� �Դϴ�.");
		}
		else
			System.out.println("ã���ô� ������ �����ϴ�.");
		System.out.println("---------------------------------------");
	 HashMap<String, Integer> fruits = new HashMap<>();
	 System.out.println("������ �̸��� ������ ���ʴ�� �Է��Ͻÿ� (5��)");
	 for(int i =0; i<6; i++){
		 String keys = ex.next();
		 int sets = ex.nextInt();
		 fruits.put(keys, sets);
		 System.out.println("�ش� ������ ����Ǿ����ϴ�.");
	 }
	 System.out.print("ã���� ������ �Է��Ͻÿ� >>");
	 String fruit = ex.next();
	 if(fruits.keySet().contains(fruit)) {
		 System.out.println(fruit + "�� ������ " + fruits.get(fruit) + "�� �Դϴ�.");
	 }
	 else
		 System.out.println("ã���ô� ������ �����ϴ�.");
	 
	 /*
	  HashMap map = new HashMap<>();
	  map.putAll(Map.of("���", 1000 ......);
	  
	  */
		
		
		
		
	}
	

}
