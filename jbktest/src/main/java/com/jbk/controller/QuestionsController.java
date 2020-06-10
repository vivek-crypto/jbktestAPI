package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuestionsController {
	
	@RequestMapping("singleQuestion")
	public Question getQuestions() { //this is just dummy code
		Question question=new Question();
		question.setQuestionText("java is platform independent");
		question.setOption1("Yes");
		question.setOption2("No");
		question.setCorrectOption("1");
		question.setExplanation("due to byte code...which is os independent");
		
		
		return question;
		
	}

}
