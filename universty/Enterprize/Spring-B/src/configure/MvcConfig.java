package configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//week 10 -> ControllerEx
@Configuration
//WebMvc를 활성화 시키는 어노테이션
@EnableWebMvc 
public class MvcConfig implements WebMvcConfigurer {
	// 환경설정 클래스를 이용하려면 해당 WebMvcConfigurer 인터페이스를 상속받아야 한다.
	
	// DefaultServletHandler를 사용하기 위한 메서드 오버라이딩
	@Override 
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	// ViewResolver를 사용하기 위한 메서드 오버라이딩
	@Override 
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// View 페이지 확장자 지정
		registry.jsp("/view/", ".jsp");
	}

	//week11 /main mapping을 컨트롤러에 선언하지 않고 MVC를 호출하는 법 
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/main").setViewName("week11/welcome");
	}
	
	
}