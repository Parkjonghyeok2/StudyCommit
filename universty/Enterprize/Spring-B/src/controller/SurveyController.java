package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import week11.AnsweredData;
import week11.Question;
//AnsweredData, Question, Respondent Class들의 Controller

@Controller
public class SurveyController {
	
	@GetMapping("/survey")
	public String form(Model model) {
		List<Question> questions = createQuestions();
		model.addAttribute("questions", questions);
		return "week11/surveyForm";
	}

	public List<Question> createQuestions() {
		Question q1 = new Question("당신의 역할은 무엇입니까?", Arrays.asList("서버", "프론트", "풀스택"));
		Question q2 = new Question("당신의 많이 사용하는 개발도구는 무엇입니까?", Arrays.asList("이클립스", "인텔리 J", "서브라입"));
		Question q3 = new Question("하고싶은 말을 적어주세요.");
		return Arrays.asList(q1, q2, q3);
	}
	
	@PostMapping("/survey")
	public String submit(@ModelAttribute("ansData") AnsweredData data){
		return "week11/surveySubmitted";
	}
}