package com.github.netty.protocol.servlet.websocket;

import jakarta.websocket.CloseReason;
import jakarta.websocket.Endpoint;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.Session;
import java.io.IOException;

public class WebSocketNotFoundHandlerEndpoint extends Endpoint {
    public static final WebSocketNotFoundHandlerEndpoint INSTANCE = new WebSocketNotFoundHandlerEndpoint();

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        session.getAsyncRemote().sendText("close! cause not found endpoint! ");
        try {
            session.close(new CloseReason(CloseReason.CloseCodes.UNEXPECTED_CONDITION, null));
        } catch (IOException ignored) {

        }
    }
}
