package org.ja.honda;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="hondaQuizPageBean", eager = true)
@SessionScoped
public class QuizBean{

	private int tries;
	private int score;
	private Vector<Problem> problems;
	private int currentProblemInt;
	private boolean answerDisplayed;
	private String currentlySelectedAnswer;
	private boolean currentlyAnsweredResult;
	private float finalScore;
	private String assessmentText;
	private boolean shuffle = false;
	
	public QuizBean(){

	}
	
	@PostConstruct
	public void init(){
		tries = 0;
		score = 0;
		currentProblemInt=0;
		
		problems = new Vector<Problem>();
		Problem problem1 = new Problem();
		problem1.setQuestion("You purchased a car, but decided a spring break trip to the beach sounds like more fun than making your car payment this month.  What could possibly go wrong?");
		problem1.setImagePath("slippery_when_wet.png");
		problem1.setCorrectText("The correct answer is C. Missing payments is a slippery road that could lead to damaged credit or, worse, a repossessed car.");

		Vector<Answer> answerVector1 = new Vector<Answer>();
		Answer answer1a = new Answer();
		answer1a.setAnswer("Nothing.  Missing one payment won't hurt anyone.");
		answer1a.setValue("a");
		answer1a.setCorrect(false);
		answerVector1.add(answer1a);
		
		Answer answer1b = new Answer();
		answer1b.setAnswer("The finance company will start charging you more to make up the missed payment.");
		answer1b.setValue("b");
		answer1b.setCorrect(false);
		answerVector1.add(answer1b);
		
		Answer answer1c = new Answer();
		answer1c.setAnswer("It could hurt your credit rating and you might lose your car.");
		answer1c.setValue("c");
		answer1c.setCorrect(true);
		answerVector1.add(answer1c);
		
		Answer answer1d = new Answer();
		answer1d.setAnswer("The police might ticket you.");
		answer1d.setValue("d");
		answer1d.setCorrect(false);
		answerVector1.add(answer1d);
		problem1.setAnswers(answerVector1);

		
		Problem problem2 = new Problem();
		problem2.setQuestion("Which one of the following pieces of information is typically requested<br /> on a car loan application?");
		problem2.setImagePath("y_sign.png");
		problem2.setCorrectText("The correct answer is D, All of the Above.  Your Social Security Number, monthly Income, and bank account number are all required on a car loan application.  These are important pieces of information which assist the financial institution in the loan review process.");
		
		Vector<Answer> answerVector2 = new Vector<Answer>();
		Answer answer2a = new Answer();
		answer2a.setAnswer("Your Social Security Number");
		answer2a.setValue("a");
		answer2a.setCorrect(false);
		answerVector2.add(answer2a);
		
		Answer answer2b = new Answer();
		answer2b.setAnswer("Your Monthly Income");
		answer2b.setValue("b");
		answer2b.setCorrect(false);
		answerVector2.add(answer2b);
		
		Answer answer2c = new Answer();
		answer2c.setAnswer("Your Bank Account Number");
		answer2c.setValue("c");
		answer2c.setCorrect(false);
		answerVector2.add(answer2c);
		
		Answer answer2d = new Answer();
		answer2d.setAnswer("All of the above");
		answer2d.setValue("d");
		answer2d.setCorrect(true);
		answerVector2.add(answer2d);
		problem2.setAnswers(answerVector2);

	
		Problem problem3 = new Problem();
		problem3.setQuestion("Which of the following is <strong>not</strong> covered by your liability auto insurance?");
		problem3.setImagePath("exclamation.jpeg");
		problem3.setCorrectText("The correct answer is D, All of the Above.  Liability insurance only covers the damage your vehicle does to another vehicle. Even comprehensive insurance&mdash;insurance that covers your car&mdash;won't cover routine maintenance, like replacing worn tires, and may not cover a cracked windshield, unless you have a special rider in your policy.");
		Vector<Answer> answerVector3 = new Vector<Answer>();
		
		Answer answer3a = new Answer();
		answer3a.setAnswer("Cracked Windshield");
		answer3a.setCorrect(false);
		answer3a.setValue("a");
		answerVector3.add(answer3a);
		
		Answer answer3b = new Answer();
		answer3b.setAnswer("Worn Tires");
		answer3b.setCorrect(false);
		answer3b.setValue("b");
		answerVector3.add(answer3b);
		
		Answer answer3c = new Answer();
		answer3c.setAnswer("Broken Axle");
		answer3c.setCorrect(false);
		answer3c.setValue("c");
		answerVector3.add(answer3c);
		
		Answer answer3d = new Answer();
		answer3d.setAnswer("All of the Above");
		answer3d.setCorrect(true);
		answer3d.setValue("d");
		answerVector3.add(answer3d);
		problem3.setAnswers(answerVector3);

		
		Problem problem4 = new Problem();
		problem4.setQuestion("What additional items should you budget for when buying a car?");
		problem4.setImagePath("car.png");
		problem4.setCorrectText("The correct answer is D, All of the above. Owning a car can be a costly but rewarding experience.  Make sure that you include these items in your monthly budget.");
		Vector<Answer> answerVector4 = new Vector<Answer>();
		
		Answer answer4a = new Answer();
		answer4a.setAnswer("Taxes");
		answer4a.setCorrect(false);
		answer4a.setValue("a");
		answerVector4.add(answer4a);
		
		Answer answer4b = new Answer();
		answer4b.setAnswer("Insurance");
		answer4b.setCorrect(false);
		answer4b.setValue("b");
		answerVector4.add(answer4b);
		
		Answer answer4c = new Answer();
		answer4c.setAnswer("Maintenance");
		answer4c.setCorrect(false);
		answer4c.setValue("c");
		answerVector4.add(answer4c);
		
		Answer answer4d = new Answer();
		answer4d.setAnswer("All of the above");
		answer4d.setCorrect(true);
		answer4d.setValue("d");
		answerVector4.add(answer4d);
		problem4.setAnswers(answerVector4);

		
		Problem problem5 = new Problem();
		problem5.setQuestion("Your owner's manual suggests you change your vehicle oil every 5,000 miles.  Instead of paying for an oil change today, you decide to use that money to go out with friends this weekend.  What could possibly go wrong?");
		problem5.setImagePath("one_way.png");
		problem5.setCorrectText("The correct answer is B. Failing to do routine maintenance on your vehicle is a one way street to a possible costly repair.  Make sure you follow your owner's manual for all of the recommended repairs.");
		Vector<Answer> answerVector5 = new Vector<Answer>();
		
		Answer answer5a = new Answer();
		answer5a.setAnswer("Nothing.  The owner's manual is just a suggestion.");
		answer5a.setCorrect(false);
		answer5a.setValue("a");
		answerVector5.add(answer5a);
		
		Answer answer5b = new Answer();
		answer5b.setAnswer("Letting your oil go long enough without changing it could damage your engine.");
		answer5b.setCorrect(true);
		answer5b.setValue("b");
		answerVector5.add(answer5b);
		
		Answer answer5c = new Answer();
		answer5c.setAnswer("You can go a few thousand miles more without changing it.");
		answer5c.setCorrect(false);
		answer5c.setValue("c");
		answerVector5.add(answer5c);
		
		Answer answer5d = new Answer();
		answer5d.setAnswer("Let it go until something else needs to be done on your vehicle, like replacing tires.");
		answer5d.setCorrect(false);
		answer5d.setValue("d");
		answerVector5.add(answer5d);
		problem5.setAnswers(answerVector5);
		
		problems.add(problem2);
		problems.add(problem1);
		problems.add(problem3);
		problems.add(problem5);
		problems.add(problem4);
		
		if(shuffle){
		  Collections.shuffle(problems);
		  
			//Problem currentProblem = problems.elementAt(currentProblemInt);
			
			// loop through and find the answer selected by the answer value.
			//Vector<Answer> currentAnswers = currentProblem.getAnswers();
			//for(int i=0; i<currentAnswers.size(); i++){
		    //   Collections.shuffle(currentAnswers);
			//}
		}
		setProblemsIndexing();
		
	}
	
	public void setProblemsIndexing()
	{
	     // loop through problems
		for(int i=0; i<problems.size(); i++){
		   Problem currentProblem = (Problem)problems.get(i);
		   // loop through the answers

	       for(int j=0; j<currentProblem.getAnswers().size(); j++){
	    	   
	    	   if(j == 0){
	    		   currentProblem.getAnswers().get(j).setIndexValue("A. ");
	    	   }
	    	   if(j == 1){
	    		   currentProblem.getAnswers().get(j).setIndexValue("B. ");
	    	   }
	    	   if(j == 2){
	    		   currentProblem.getAnswers().get(j).setIndexValue("C. ");
	    	   }
	    	   if(j == 3){
	    		   currentProblem.getAnswers().get(j).setIndexValue("D. ");
	    	   }
	    	   
	       }
		}
	}
	
	
	public String startQuiz() {
		currentProblemInt = 0;
		answerDisplayed = false;
		currentlySelectedAnswer = "";
		assessmentText = "";
		answerDisplayed = false;
		return "question";
	}
	
	public String getCurrentProblemQuestion()
	{
		return problems.elementAt(currentProblemInt).getQuestion();
	}
	
	public String getCurrentProblemImage()
	{
		return problems.elementAt(currentProblemInt).getImagePath();
	}
	
	public Answer[] getCurrentAnswerArray(){
		Vector<Answer> currentAnswerObjectVector = (Vector<Answer>)problems.elementAt(currentProblemInt).getAnswers();
		Answer[] currentAnswerObjectArray = new Answer[problems.elementAt(currentProblemInt).getAnswers().size()];
		for(int i=0; i<currentAnswerObjectVector.size(); i++){
			Answer a = (Answer)currentAnswerObjectVector.get(i);
			currentAnswerObjectArray[i] = a;
		}
        return currentAnswerObjectArray;
	}
	
	public String getCurrentProblemAnswerText()
	{
		Problem currentProblem = problems.elementAt(currentProblemInt);
		if(this.answerDisplayed == false){
			return "";
		} else {
			
			if(currentProblem.isAnsweredCorrectly()){
			  return "<span class=\"problemExplanation\"><strong>Correct.</strong><br />" + problems.elementAt(currentProblemInt).getCorrectText() + "</span>";	
			} else {
		      return "<span class=\"problemExplanation\"><span style=\"color:red;\"><strong>Incorrect.</strong></span><br />" + problems.elementAt(currentProblemInt).getCorrectText() + "</span>";
			}
		}
	}
	
	public String nextQuestion(){
		this.currentProblemInt++;
		this.currentlySelectedAnswer = "";
		this.currentlyAnsweredResult = false;
		this.answerDisplayed = false;
		
		if(currentProblemInt >= problems.size()){
			currentlySelectedAnswer = "";
			this.answerDisplayed = false;
			return "displayFinal";
		}
		return "question";
	}
	
	public String answerAction()
	{
		tries++;
		if(answerDisplayed == false){
			this.answerDisplayed = true;
		} 		

		// retrieve currentProblem
		Problem currentProblem = problems.elementAt(currentProblemInt);
		
		// loop through and find the answer selected by the answer value.
		Vector<Answer> currentAnswers = currentProblem.getAnswers();
		for(int i=0; i<currentAnswers.size(); i++){

			if(currentlySelectedAnswer.equalsIgnoreCase(currentAnswers.get(i).getValue()) && currentAnswers.get(i).isCorrect()){
				// once value is matched... check to see if the answer "correct" value is true.
				problems.elementAt(currentProblemInt).setAnsweredCorrectly(true);
				break;
			} else {
				problems.elementAt(currentProblemInt).setAnsweredCorrectly(false);
			}
		}
	
		/* if(problems.get(currentProblem).getAnswers().isCorrect()){
			score++;
			if(currentProblem == problems.size()) return "displayFinal"; 
			else return "question";
		} */
		
		return "question";
	}
	
	
	public double getFinalScore() {
		
		double numberOfProblems = problems.size();
		double numberOfCorrect = 0;
		double finalScore = 0;
		
		// loop through the problems and get the correct count
		
		for(int i=0; i<problems.size(); i++)
		{
			    // once value is matched... check to see if the answer "correct" value is true.
				if(problems.elementAt(i).isAnsweredCorrectly()){
					numberOfCorrect++;
				}
		}
		
		finalScore = numberOfCorrect / numberOfProblems;
		
		if(finalScore <= .50){
			assessmentText = "Not bad, but not perfect.  Try again, or<br /> learn more about what it takes to be a savvy driver.";
		}
		if(finalScore > .50 && finalScore <= .60){
			assessmentText = "Not bad, but not perfect.  Try again, or<br /> learn more about what it takes to be a savvy driver.";
		}
		if(finalScore > .60 && finalScore <= .70){
			assessmentText = "Not bad, but not perfect.  Try again, or<br /> learn more about what it takes to be a savvy driver.";
		}
		if(finalScore > .70 && finalScore <= .80){
			assessmentText = "Not bad, but not perfect.  Try again, or<br /> learn more about what it takes to be a savvy driver.";
		}
		if(finalScore > .80 && finalScore <= .90){
			assessmentText = "Not bad, but not perfect.  Try again, or<br /> learn more about what it takes to be a savvy driver.";
		}
		if(finalScore > .90 && finalScore <= 1.0){
			assessmentText = "Perfect score!";
		}
		
		return finalScore;
	}

	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}

	public boolean checkAnswer(){
		
		return true;
	}
	
	public String reset(){
		init();
		startQuiz();
		return "question";
	}
	
	public String getAssessmentText() {
		return assessmentText;
	}

	public void setAssessmentText(String assessmentText) {
		this.assessmentText = assessmentText;
	}

	public int getTries() {
		return tries;
	}

	public void setTries(int tries) {
		this.tries = tries;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Vector<Problem> getProblems() {
		return problems;
	}

	public void setProblems(Vector<Problem> problems) {
		this.problems = problems;
	}

	public int getCurrentProblemInt() {
		return currentProblemInt;
	}

	public void setCurrentProblemInt(int currentProblemInt) {
		this.currentProblemInt = currentProblemInt;
	}

	public boolean isAnswerDisplayed() {
		return answerDisplayed;
	}
	
	public boolean getAnswerDisplayed() {
		return answerDisplayed;
	}

	public void setAnswerDisplayed(boolean answerDisplayed) {
		this.answerDisplayed = answerDisplayed;
	}

	public String getCurrentlySelectedAnswer() {
		return currentlySelectedAnswer;
	}

	public void setCurrentlySelectedAnswer(String currentlySelectedAnswer) {
		this.currentlySelectedAnswer = currentlySelectedAnswer;
	}

	public boolean isCurrentlyAnsweredResult() {
		return currentlyAnsweredResult;
	}

	public void setCurrentlyAnsweredResult(boolean currentlyAnsweredResult) {
		this.currentlyAnsweredResult = currentlyAnsweredResult;
	}
	
	
	
	
	/*
	 *
	 * You purchased a car, but decided a Spring Break Trip to the beach sounds like more fun than making your car payment this month.  What could possibly go wrong?
A.  Nothing.  Missing one payment won't hurt anyone.
B.  The car company will start charging you more to make up the missed payment.
C.  It could hurt your credit rating and you might lose your car.
D.  The police might ticket you.

Answer C: Missing payments is a slippery road that could lead to damaged credit or, worse a repossessed car.

Which one of the following questions is not asked in a credit application for a car loan:

A.  Your Social Security Number
B.  The Amount of Your Down Payment
C.  Your Monthly Income
D.  Your Bank Account Number

Answer B: While the amount of the down payment may not be asked for in the application, you may be required to make a down payment in order to secure the loan.


Which of the following is NOT covered by your liability auto insurance?

A.  Cracked Windshield
B.  Worn Tires
C.      Broken Axle 
D.      All of The Above

Answer D: Liability insurance only covers the damage your vehicle does to another vehicle. Even comprehensive insurance-insurance that covers your car-won't cover routine maintenance, like replacing worn tires, and may not cover a cracked windshield, unless you have a special rider in your policy.


Which of the following is a realistic amount to expect to pay each month for your first car? 

A. Less than $100
B. $135
C. $352
D. $703 

Answer C: While payments for a vehicle can vary widely, the average monthly payment for a used car in the United States is $352, according to Experian. The average payment for a new car loan is $471.

Your owner's manual suggests you change your truck's oil every 50,000 miles.  Instead of paying for an oil change today, you decide to use that money to go out with friends this weekend.  What could possibly go wrong?

A. Nothing.  The owner's manual is just a suggestion.
B. Letting your oil go long enough without changing it could damage your engine.
C. You can go a few thousand miles more without changing it.
D. Let it go until something else needs to be done on your truck, like replacing tires.

Answer B: Failing to do routine maintenance on your vehicle is a One Way street to a major and costly repair.  Make sure you follow your owner's manual and pay less now.

	 */
	
	
	
}
