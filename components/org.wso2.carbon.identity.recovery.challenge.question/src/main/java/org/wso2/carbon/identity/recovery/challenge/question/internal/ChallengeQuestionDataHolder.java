package org.wso2.carbon.identity.recovery.challenge.question.internal;

import org.wso2.carbon.identity.api.user.recovery.commons.UserAccountRecoveryServiceDataHolder;
import org.wso2.carbon.identity.recovery.services.password.PasswordRecoveryManager;

public class ChallengeQuestionDataHolder {

    private static ChallengeQuestionDataHolder instance = new ChallengeQuestionDataHolder();

    public static ChallengeQuestionDataHolder getInstance() {
        return instance;
    }
}
