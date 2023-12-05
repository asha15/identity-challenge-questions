/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.rest.api.user.challenge.v1.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class UserChallengeAnswerResponseDTO  {
  
  
  @NotNull 
  private String questionSetId = null;
  
  @NotNull 
  private String question = null;
  
  @NotNull 
  private String answer = null;

  
  /**
   * A unique ID to identify the challenge set.
   **/
  @ApiModelProperty(required = true, value = "A unique ID to identify the challenge set.")
  @JsonProperty("questionSetId")
  public String getQuestionSetId() {
    return questionSetId;
  }
  public void setQuestionSetId(String questionSetId) {
    this.questionSetId = questionSetId;
  }

  
  /**
   * Challenge question display value.
   **/
  @ApiModelProperty(required = true, value = "Challenge question display value.")
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }

  
  /**
   * A hashed value of the challenge answer.
   **/
  @ApiModelProperty(required = true, value = "A hashed value of the challenge answer.")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChallengeAnswerResponseDTO {\n");
    
    sb.append("  questionSetId: ").append(questionSetId).append("\n");
    sb.append("  question: ").append(question).append("\n");
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
