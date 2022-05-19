import java.util.Scanner;

abstract public class ScheduleSet implements IScheduleSet {
	private int count;
	public ScheduleSet(int count) {
		this.count = count;
	}
	@Override
	public Schedule[] makeSchedule() {//- Schedule �迭�� ����� ��ȯ�ϴ� makeSchedule �޼��� �������̵�
		Schedule[] sch = new Schedule[count];//Schedule ��ü�迭 ���� ũ��� count
		
		for(int i =0; i<count; i++) {
			String [] s = getString();
			sch[i] = (s[2].isEmpty() == true)? new Schedule(s[0], s[1]):new Schedule(s[0], s[1], s[2]);
			/*if(s[2].isEmpty() == true) {
			 * sch[i] = new Schedule(s[0], s[1])
			}
			else {
				sch[i] = new Schedule(s[0], s[1], s[2]);
			}*/
			}
		return sch;
	}
	@Override
	public void searchSchedule(Schedule []sch, String day) {//-- Schedule�迭�� ��¥�� �Է¹޾� �O�� �������� ��� �ϴ� sreachSchedule �޼��� �������̵�
		boolean nullIt = true;
		for(int i = 0; i<count; i++) {
			if(sch[i].getDay().equals(day)) {
				System.out.println(sch[i].getSchedule());
				nullIt = false;
			}
			if(nullIt==true) {
				System.out.println("��ġ�ϴ� ���� �����ϴ�.");
			}
		}
	}
	abstract public String[] getString();

}
