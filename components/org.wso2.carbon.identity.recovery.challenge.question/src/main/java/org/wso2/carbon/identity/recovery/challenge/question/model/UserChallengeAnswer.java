package org.wso2.carbon.identity.recovery.challenge.question.model;

public class UserChallengeAnswer {

    private ChallengeQuestion question;

    private String answer;

    public UserChallengeAnswer(ChallengeQuestion question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public UserChallengeAnswer() {
        //default constructor
    }

    public ChallengeQuestion getQuestion() {
        return question;
    }

    public void setQuestion(ChallengeQuestion question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
