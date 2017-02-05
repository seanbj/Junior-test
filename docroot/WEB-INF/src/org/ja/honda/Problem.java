package org.ja.honda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

public class Problem implements Serializable {
	
	private String question;
	private Vector<Answer> answers;
	private String imagePath;
	private String correctText;
	private String incorrectText;
	private boolean answeredCorrectly;
	
	public Problem(){};
	
	public Problem(String question, String imagePath, Vector answers){
		
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Vector<Answer> getAnswers() {
		return answers;
	}	
	
	public void setAnswers(Vector<Answer> answers) {
		this.answers = answers;
	}

	public String getCorrectText() {
		return correctText;
	}

	public void setCorrectText(String correctText) {
		this.correctText = correctText;
	}

	public String getIncorrectText() {
		return incorrectText;
	}

	public void setIncorrectText(String incorrectText) {
		this.incorrectText = incorrectText;
	}

	public boolean isAnsweredCorrectly() {
		return answeredCorrectly;
	}

	public void setAnsweredCorrectly(boolean answeredCorrectly) {
		this.answeredCorrectly = answeredCorrectly;
	}
	
	

}
