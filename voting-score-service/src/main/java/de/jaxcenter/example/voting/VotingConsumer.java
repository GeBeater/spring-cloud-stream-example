package de.jaxcenter.example.voting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class VotingConsumer {

    private final VotingService votingService;

    @Autowired
    public VotingConsumer(VotingService votingService) {
        this.votingService = votingService;
    }

    @StreamListener(Sink.INPUT)
    public void receive(Vote vote) {
        log.info("Vote with payload: {} received.", vote);
        votingService.addVote(vote);
    }
}
