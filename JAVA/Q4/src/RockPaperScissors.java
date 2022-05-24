
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements IGameFrame {

	@Override
	public <T> T computerSelect() {//<T> Ÿ���� ���� �޼����̰� T�������Ѵ�.
		Random r = new Random();// ������ �� r������ �Ҵ�
		int n = r.nextInt(2); // n�� 0~2���� ���������� ���� �Ҵ�
		T select = (T) ""; //TŸ���� select �����̴�. 
		
		switch(n) {
		case 0:
			select = (T) "����";
			break;
		case 1:
			select = (T) "����";
			break;
		case 2:
			select = (T) "��";
			break;
		}
		return select;
	}
	

	@Override
	public <T> T userSelect() {
		String s = "";
		while(true) {
			Scanner ex = new Scanner(System.in);
			System.out.print("���� ���� �� �� �ϳ��� �Է��Ͻÿ� >>");	
			s = ex.next();
			if(s.equals("����")||s.equals("����")||s.equals("��")) {
				 break;
			}
			else
				System.out.println("�ٽ� �Է��Ͻÿ�");					
		}
		return (T) s;
	}

	@Override
	public boolean gameAct() {
		
		boolean result = true;//������ �̱�� Ʈ��
		while(true) {
			String user = userSelect(); //TŸ���� userSelect�� T�� �����ؾ��ϴµ� ������ ���ص� �ڵ� ����ȯ�� �̷������ å�� ����
			String com = computerSelect();
			if(user.equals(com)) {
				System.out.println("�����ϴ�.");
			}
			else{
				if(user.equals("����")&&com.equals("����")) {
						result = false;
				}
				else 
					break;
							
				if(user.equals("����")&&com.equals("��")) {
					result = false;
					}
				else 
					break;
				
				if(user.equals("��")&&com.equals("����")) {
						result = false;
				}
				else
					break;
				}
			}
		return result;
	}



}
