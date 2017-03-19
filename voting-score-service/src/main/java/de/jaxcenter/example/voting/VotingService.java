package de.jaxcenter.example.voting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotingService {

    private final VotingRepository votingRepository;

    @Autowired
    public VotingService(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    public Vote addVote(Vote vote) {
        return votingRepository.save(vote);
    }
}
