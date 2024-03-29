package de.jaxcenter.example.voting;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class VotingService {

    @NonNull
    private final VotingRepository votingRepository;

    public Vote addVote(Vote vote) {
        return votingRepository.save(vote);
    }
}
