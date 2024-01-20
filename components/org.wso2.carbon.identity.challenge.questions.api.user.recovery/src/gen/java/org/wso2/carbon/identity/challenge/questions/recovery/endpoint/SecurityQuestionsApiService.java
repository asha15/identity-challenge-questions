package org.wso2.carbon.identity.challenge.questions.recovery.endpoint;

import org.wso2.carbon.identity.recovery.endpoint.*;
import org.wso2.carbon.identity.recovery.endpoint.dto.*;

import org.wso2.carbon.identity.challenge.questions.recovery.endpoint.dto.InitiateAllQuestionResponseDTO;
import org.wso2.carbon.identity.recovery.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class SecurityQuestionsApiService {
    public abstract Response securityQuestionsGet(String username,String realm,String tenantDomain);
}

