import java.util.Scanner;
public interface IGameFrame {
	 public <T> T computerSelect();
	 public <T> T userSelect();

	 public boolean gameAct();
	    
	    default void loseWinOut(boolean loseWin){//�̷��� �������̽� �ȿ��� ���� �� ���� ����
	        if (loseWin)
	            System.out.println("\n[���� �¸�]\n");
	        else
	            System.out.println("\n[��ǻ�� �¸�]\n");
	    }

	    default boolean outGame() {//����Ʈ �Լ��� �� Ʋ�� ����ϴµ� �� �޼��� ������ ������ �ȵǴϱ� ����Ʈ�� �����Ѵ�.
			boolean game = true;
	    	Scanner ex = new Scanner(System.in);
			
	    	while(true) {
		    	System.out.println("������ �����Ͻðڽ��ϱ� (���� : 1 / ���� : 0");
				int a = ex.nextInt();
				if(a==0) {
					System.out.println("������ �����մϴ�.");
					game = false;
					break;
				}
				else
					break;
				}	
	    	return game;
		}	    
}
