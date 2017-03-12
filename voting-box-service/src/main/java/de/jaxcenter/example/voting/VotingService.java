package de.jaxcenter.example.voting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public class VotingService {

    private final MessageChannel messageChannel;

    @Autowired
    public VotingService(@Qualifier("output") MessageChannel messageChannel) {
        this.messageChannel = messageChannel;
    }

    public void vote(Vote vote) {
        messageChannel.send(MessageBuilder.withPayload(vote).build());
    }
}
