package day2;
import java.util.Random;
import java.util.Scanner;
//�ٻ� ���� ������
public class FindApproximateValue implements IGameFrame {
	@Override
	public <T> T computerSelect() {
		Random r = new Random();

		Integer bi = new Integer(10);
		return (T) (Integer.valueOf(r.nextInt(99)+1));
 
	}

	@Override
	public <T> T userSelect() {
		Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("\n[���ڸ� �Է��ϼ��� (1 ~ 100)]\n");
            num = scanner.nextInt();

            if (num >= 1 && num <= 100) {
                break;
            }
            else {
                System.out.println("[1���� 100������ ���ڸ� ������ �ּ���]");
            }
        }

        return (T) Integer.valueOf(num);	}

	@Override
	public boolean gameAct() {
		boolean result = true;
		Random a = new Random();
		
		while(true) {
			int user = userSelect();//�������� ������ ������ ��ȯ�ض�
			int com = computerSelect();//�������� ������ ������ ��ȯ�ض�
			
			int c = a.nextInt(99)+1;//1~100������ �ƹ� ���� �����ϴµ� �׳� ������ 0���� �����ؼ� +1�� ���ش�
			
			int userValue = Math.abs(c-user);//���밪���� ��ȯ
			int comValue = Math.abs(c-com);
			
			if(userValue == comValue)
				System.out.println("�����ϴ�.");
			else if(userValue < comValue)
				result = false;
			
			break;
		}
		return result;
	}

}
