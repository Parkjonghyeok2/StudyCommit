package week11;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration // 환경설정 클래스 선언
public class AppCtx {
	
//DataSource라는 클래스를 이용하여 DB 접근 자바빈을 만든다.	
	@Bean
	public DataSource dataSource() {
		// DB 연결 클래스
		SimpleDriverDataSource ds = new SimpleDriverDataSource();
		// DB 드라이버 종류 선언
		ds.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		// DB 주소 선언
		ds.setUrl("jdbc:mysql://localhost/springdb?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("1234");

		return ds;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource());
	}
}