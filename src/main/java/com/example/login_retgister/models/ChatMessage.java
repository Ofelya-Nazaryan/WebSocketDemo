package com.example.login_retgister.models;

import com.example.login_retgister.models.enums.MessageType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ChatMessage {


    private String content;
    private String sender;
    private MessageType messageType;


}
