package de.jaxcenter.example.voting;

import de.jaxcenter.example.scoring.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VotingRepository extends JpaRepository<Vote, Long> {

    @Query("select new de.jaxcenter.example.scoring.Score(count(v.candidate), v.candidate) from Vote v group by v.candidate")
    List<Score> findAllScores();
}
