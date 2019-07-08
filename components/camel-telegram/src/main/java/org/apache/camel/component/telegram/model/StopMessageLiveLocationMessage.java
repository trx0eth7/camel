/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopMessageLiveLocationMessage extends OutgoingMessage {

    @JsonProperty("message_id")
    private Long messageId;

    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    @JsonProperty("reply_markup")
    private ReplyKeyboardMarkup replyKeyboardMarkup;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public ReplyKeyboardMarkup getReplyKeyboardMarkup() {
        return replyKeyboardMarkup;
    }

    public void setReplyKeyboardMarkup(ReplyKeyboardMarkup replyKeyboardMarkup) {
        this.replyKeyboardMarkup = replyKeyboardMarkup;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StopMessageLiveLocationMessage{");
        sb.append("message_id='").append(messageId).append('\'');
        sb.append(", inlineMessageId=").append(inlineMessageId).append('\'');
        sb.append(", replyKeyboardMarkup=").append(replyKeyboardMarkup);
        sb.append('}');
        return sb.toString();
    }
}
