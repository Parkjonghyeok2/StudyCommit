import java.util.Scanner;
public class ScheduleClass extends ScheduleSet{

	public ScheduleClass(int count) {
		super(count);
	}

	@Override
	public String[] getString() {
		Scanner ex = new Scanner(System.in);
		String[] sch = new String[3];
		for(int i = 0; i<3 ;i++) {
			switch(i) {
			case 0:
				System.out.print("������ >>");
				sch[i] = ex.nextLine();
				break;
			case 1:
				System.out.print("��� >>");
				sch[i] = ex.nextLine();
				break;
			case 2:
				System.out.print("�ð� >>");
				sch[i] = ex.nextLine();
				break;
			}
		}
		return sch;
	}
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("�������� ���� ���� ���ϼ��� : ");
        ScheduleClass sdc = new ScheduleClass(scan.nextInt());
        
        System.out.println("---������ ����---");
        Schedule[] schedule = sdc.makeSchedule();

        while(true){
            System.out.print("�������� �˻��� ��¥�� �Է��ϼ���(���� : q) : ");
            String day = scan.next();
            
            if(day.equals("q")){
                break;
            }
            
            sdc.searchSchedule(schedule, day);
        }
    }
	
}
