package week11;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex3Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Member member;
		MemberDao dao = (MemberDao) ctx.getBean("memberDao");

		List<Member> members = dao.selectAllUsingParameter("std1");

		Iterator it = members.iterator();
		System.out.println("===== SelectAllUsingParameter() 메서드 실행 결과 =====");
		while (it.hasNext()) {
			member = (Member) it.next();
			System.out.println("ID : " + member.getId());
			System.out.println("Email : " + member.getEmail());
			System.out.println("password : " + member.getPassword());
			System.out.println("name : " + member.getName());
			System.out.println("date : " + member.getRegisterDateTime());
			System.out.println("==========================");
		}
	}

}