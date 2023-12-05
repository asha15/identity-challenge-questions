/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.identity.api.user.challenge.common;

import org.wso2.carbon.identity.recovery.ChallengeQuestionManager;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * Service holder class for user challenge services.
 */
public class ChallengeQuestionServiceHolder {

    private static ChallengeQuestionManager challengeQuestionManager;

    private static RealmService realmService;

    /**
     * Get ChallengeQuestionManager osgi service.
     * @return ChallengeQuestionManager
     */
    public static ChallengeQuestionManager getChallengeQuestionManager() {
        return challengeQuestionManager;
    }

    public static void setChallengeQuestionManager(ChallengeQuestionManager challengeQuestionManager) {
        ChallengeQuestionServiceHolder.challengeQuestionManager = challengeQuestionManager;
    }

    public static RealmService getRealmService() {

        return realmService;
    }

    public static void setRealmService(RealmService realmService) {

        ChallengeQuestionServiceHolder.realmService = realmService;
    }
}
