package documents;
import java.util.Scanner;

public class CommandMode {
	Scanner ex = new Scanner(System.in);
	Command d = new Command();
	public void setMode() {
		
	}
	
	public void defaultCommand() {
		String a = ex.next();
		while(true) {
				System.out.print("1~5 �� �ϳ��� �����Ͻÿ� >> ");
				if(a.equals(5)) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
					else {
						d.commandAct(a);
					}
				}
					
	}
	}
		
}
