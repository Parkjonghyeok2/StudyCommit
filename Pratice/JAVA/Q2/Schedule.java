import java.text.SimpleDateFormat;
import java.util.Date;


public class Schedule {
	private String schedule, place;
	
	private Date now = new Date();//now�� Date��ü�ȿ� �ִ� ���� �ð��� ����
	SimpleDateFormat dayf = new SimpleDateFormat("yyyyMMdd");
	private String day = dayf.format(now).toString(); 

	public String getSchedule() {
		return schedule;
	}

	public String getPlace() {
		return place;
	}

	public String getDay() {
		return day;
	}

	public Schedule(String schedule, String place){
		this.schedule = schedule;
		this.place = place;
	}
	public Schedule(String schedule, String place, String day){
		this.schedule = schedule;
		this.place = place;
		this.day = day;
	}
}
