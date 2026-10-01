package com.ruralcare.ruralcare.config;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SignalingHandler extends TextWebSocketHandler {

    private final Map<String, WebSocketSession> sessions =
            new ConcurrentHashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {

        sessions.put(session.getId(), session);

        System.out.println(
                "Video user connected: " + session.getId()
        );
    }

    @Override
    protected void handleTextMessage(
            WebSocketSession session,
            TextMessage message) throws Exception {

        String messageText = message.getPayload();

        System.out.println(
                "Video message: " + messageText
        );

        for (WebSocketSession otherSession : sessions.values()) {

            if (otherSession.isOpen()
                    && !otherSession.getId().equals(session.getId())) {

                otherSession.sendMessage(
                        new TextMessage(messageText)
                );
            }
        }
    }

    @Override
    public void afterConnectionClosed(
            WebSocketSession session,
            org.springframework.web.socket.CloseStatus status) {

        sessions.remove(session.getId());

        System.out.println(
                "Video user disconnected: " + session.getId()
        );
    }
}