package week11;

import java.util.Collections;
import java.util.List;

public class Question {
	private String title;
	private List<String> options;

	public Question(String title, List<String> options) {
		super();
		this.title = title;
		this.options = options;
	}

	public Question(String title) {
		// this 는 현재 클래스의 생성자를 호출하는 메서드이다.
		this(title, Collections.<String>emptyList());
	}

	public String getTitle() {
		return title;
	}

	public List<String> getOptions() {
		return options;
	}

	public boolean isChoice() {
		return options != null && !options.isEmpty();
	}

}