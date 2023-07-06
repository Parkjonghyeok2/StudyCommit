package configure;

import java.util.Calendar;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import controller.ControllerEx;
import controller.RegisterController;
import controller.SurveyController;

//Bean 객체 등록 환경설정 클래스 
@Configuration
public class ControllerConfig {

	// week 10
	@Bean
	public ControllerEx controllerEx() {
		return new ControllerEx();
	}

	@Bean
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 10) {
			return "좋은 아침입니다.";
		} else if (hour >= 11 && hour < 15) {
			return "점심 식사는 하셨나요?";
		} else if (hour >= 16 && hour <= 22) {
			return "좋은 밤 되세요";
		}
		return "안녕하세요";
	}

// week11 registercontroller 자바 bean 생성
	@Bean
	public RegisterController registerController() {
		return new RegisterController();
	}

	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}

	@Bean
	// 빈의 아이디는 반드시 messageSource로 지정
	public MessageSource messageSource() {
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		// common 패키지에서 label.properties 파일을 읽어옴
		ms.setBasenames("common.label");
		ms.setDefaultEncoding("UTF-8");
		return ms;
	}
}