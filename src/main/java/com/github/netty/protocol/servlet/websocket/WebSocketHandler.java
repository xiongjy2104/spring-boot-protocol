package com.github.netty.protocol.servlet.websocket;

import jakarta.websocket.CloseReason;
import jakarta.websocket.PongMessage;
import jakarta.websocket.Session;
import java.nio.ByteBuffer;

public interface WebSocketHandler {

    default void afterConnectionEstablished(Session session) throws Exception {
    }

    default void handleTextMessage(Session session, String message, boolean isLast) throws Exception {
    }

    default void handleBinaryMessage(Session session, ByteBuffer message, boolean isLast) throws Exception {
    }

    default void handlePongMessage(Session session, PongMessage message, boolean isLast) throws Exception {
    }

    default void handleTransportError(Session session, Throwable exception) throws Exception {
    }

    default void afterConnectionClosed(Session session, CloseReason closeStatus) throws Exception {
    }

}

