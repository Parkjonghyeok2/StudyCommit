package Day0609;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
//TreeSet�� Random�� �̿��Ͽ� ������ ���� 10���� �����Ͽ� ����϶�
public class Q1 {
	public static void main(String[] args) {
		Random r = new Random();
		TreeSet<Integer> num = new TreeSet<>();//treeset�� ���İ� ���ÿ� set�� ������ �ߺ� ���� ������ ������ 
		for(int i =0; i<10; i++) {
			 int a = r.nextInt(99+1);//�⺻ Ŭ���� �� randomŬ���� 
			 num.add(a);
		}
		Iterator<Integer> i = num.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
	}

}
