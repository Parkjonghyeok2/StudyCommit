package day2;
//�ٻ� ���� �����
public class Main {
	public static void main(String[] args) {
		FindApproximateValue F = new FindApproximateValue();
		System.out.println("�ٻ� ã�� ����");
		
		while(true){
			F.loseWinOut(F.gameAct());
			if(F.outGame()) {
				break;
			}
		}
	}

}
