package day2;

public class MuckJiPa extends RockPaperScissors {
	 public boolean gameAct() {
	        boolean atkDf = super.gameAct();//�θ�Ŭ������ ���������� �޼��� �������� �������������� �̱����� ���ݱ��� ������ ������
	        boolean losewin = true; //���� �̰���� �����ϴ� �ҷ��� ��

	        while (true) {
	            if (atkDf) {//������ �̰�����
	                System.out.println("\n[������ �غ��ϼ���]");
	                
	                String user = userSelect();
	                String computer = computerSelect();

	                System.out.println("����[����] : " + user);
	                System.out.println("��ǻ��[���] : " + computer);

	                int a = muckJjiPaAct(user, computer);//�������� ���� �� ���� �̰���� �ǰ����ϴ� �޼���

	                if (a == 1) {
	                	System.out.println("������ �̰���ϴ�.");
	                    break;
	                }
	                else if (a == 2) {
	                    System.out.println("\n[���� ����]");
	                    atkDf = false;//������ ���� ���� �ٲ���� ������ ���� �� ������ else ���� ����� �� �ִ�.
	                }
	            }
	            else {//������ ���� ��
	                System.out.println("\n[�� �غ��ϼ���]");
	                
	                String user = userSelect();
	                String computer = computerSelect();

	                System.out.println("\n����[���] : " + user);
	                System.out.println("��ǻ��[����] : " + computer);

	                int a = muckJjiPaAct(computer, user);

	                if (a == 1) {
	                    losewin = false;
	                    break;
	                }
	                else if (a == 2) {
	                    System.out.println("\n[���� ����]");
	                    atkDf = true;
	                }
	            }
	        }

	        return losewin;
	    }

	    public int muckJjiPaAct(String atk, String df){//
	        int distinction = 0; 

	        if (atk.equals(df))//�����ڰ� ����ٸ� �̰��� ��
	            distinction = 1;
	        else if (isChange(atk, df)) {//�����ڿ� �����ڰ� �ٸ� �� ���� ������ ����ȴ�. �� else if ���� Ʈ�� �϶� ����ȴ�
	            distinction = 2;
	        }

	        return distinction;
	    }

	    public boolean isChange(String atk, String df){//�������밡 �Ǵ� ������ �޼���
	        boolean change = false;

	        switch (atk) {
	            case "����":
	                if (df.equals("����"))
	                    change = true;
	                break;
	            case "����":
	                if (df.equals("��"))
	                    change = true;
	                break;
	            case "��":
	                if (df.equals("����"))
	                    change = true;
	                break;
	        }

	        return change;
	    }
}
