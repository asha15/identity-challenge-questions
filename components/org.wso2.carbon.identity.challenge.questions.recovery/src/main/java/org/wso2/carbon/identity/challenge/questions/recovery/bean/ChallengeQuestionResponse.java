package org.wso2.carbon.identity.challenge.questions.recovery.bean;

import org.wso2.carbon.identity.challenge.questions.recovery.model.ChallengeQuestion;

public class ChallengeQuestionResponse {

    private ChallengeQuestion question;
    private String code;
    private String status;

    public ChallengeQuestionResponse() {
        //Default constructor
    }

    public ChallengeQuestionResponse(ChallengeQuestion question) {
        this.question = question;
    }

    public ChallengeQuestion getQuestion() {
        return question;
    }

    public void setQuestion(ChallengeQuestion question) {
        this.question = question;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
