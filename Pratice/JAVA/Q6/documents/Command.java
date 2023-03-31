package documents;
import java.util.Scanner;

import java.util.LinkedList;


public class Command {
	   Scanner scanner = new Scanner(System.in);

	    DocumentManager documentManager = new DocumentManager();

	    public void commandAct(String command){
	        if (command.equals("1") || command.equals("make")) {
	            makeDocument();
	        }
	        else if (command.equals("2") || command.equals("delate")) {
	            deletDocument();
	        }
	        else if (command.equals("3") || command.equals("recontetct")) {
	            reContent();
	        }
	        else if (command.equals("4") || command.equals("search")) {
	            searchDocument();
	        }
	    }

	    public void  makeDocument() {
	        System.out.println("\n[���� ����]");
	        System.out.print("���� �̸� : ");
	        String name = scanner.nextLine();
	        System.out.print("���� ���� ��¥ : ");
	        String day = scanner.nextLine();
	        System.out.print("���� ���� : ");
	        String content = scanner.nextLine();
	        
	        documentManager.makeDocument(day, name, content);
	    }

	    public void deletDocument() {
	        System.out.println("\n[���� ����]");
	        System.out.print("���� �̸� : ");
	        String name = scanner.nextLine();

	        documentManager.deletDocument(name);
	    }

	    public void reContent() {
	        System.out.println("\n[���� ���� ����]");
	        System.out.print("���� �̸� : ");
	        String name = scanner.nextLine();
	        scanner.nextLine();
	        System.out.print("���� ���� : ");
	        String content = scanner.nextLine();

	        documentManager.recontent(name, content);
	    }

	    public void searchDocument() {
	        System.out.println("\n[���� �˻�]");
	        System.out.print("���� �̸� : ");
	        String name = scanner.nextLine();

	        if (name.isEmpty()) {
	            for (Documents document : documentManager.documents) {
	                System.out.println("\n���� �̸� : " + document.getName());
	                System.out.println("���� ���� ��¥ : " + document.getDay());
	                System.out.println("���� ���� : " + document.getContent());
	            }
	            return;
	        }
	        Document document = documentManager.returnDocument(name);

	        if (document == null) {
	            System.out.println("\n�ش� ������ �������� �ʽ��ϴ�.");
	        } else {
	            System.out.println("\n���� �̸� : " + document.getName());
	            System.out.println("���� ���� ��¥ : " + document.getDay());
	            System.out.println("���� ���� : " + document.getContent());
	        }
	    }
}
