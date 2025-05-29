package ru.zaikin.requestnotificationmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;
import ru.zaikin.requestnotificationmicroservice.model.UserFormBlank;

@Service
public class UserEventSender {

    private final StreamBridge streamBridge;

    @Autowired
    public UserEventSender(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void sendUserEvent(UserFormBlank event) {
        streamBridge.send("sendToUserStorage-out-0", event);
    }
}
