package de.jaxcenter.example.scoring;

import de.jaxcenter.example.voting.VotingRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ScoringService {

    @NonNull
    private final VotingRepository votingRepository;

    public List<Score> getScores() {
        return votingRepository.findAllScores();
    }
}
