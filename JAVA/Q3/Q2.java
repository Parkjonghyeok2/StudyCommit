package Homework;

import java.util.Calendar;

public class Q2 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1 ;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); 
        System.out.println(year+ "�� " + month + "�� " + date + "��");

        switch (day) {
            case 1:
                System.out.print("�Ͽ��� ");
                break;
            case 2:
                System.out.print("������ ");
                break;
            case 3:
                System.out.print("ȭ���� ");
                break;
            case 4:
                System.out.print("������ ");
                break;
            case 5:
                System.out.print("����� ");
                break;
            case 6:
                System.out.print("�ݿ��� ");
                break;
            case 7:
                System.out.print("����� ");
                break;
        }
        
        switch (c.get(Calendar.AM_PM)) {
            case 0:
                System.out.println("����");
                break;
            case 1:
                System.out.println("����");
        }

        System.out.println(c.get(Calendar.HOUR) + "�� " + c.get(Calendar.MINUTE) + "�� " + c.get(Calendar.SECOND) + "��");
    }

}
