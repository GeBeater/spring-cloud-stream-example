package de.jaxcenter.example.scoring;

import de.jaxcenter.example.voting.Vote;
import de.jaxcenter.example.voting.VotingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ScoresResourceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private VotingService votingService;

    @Test
    public void getAll() throws Exception {
        for (String candidate : Arrays.asList("candidate1", "candidate1", "candidate2")) {
            Vote vote = new Vote();
            vote.setCandidate(candidate);
            votingService.addVote(vote);
        }
        List<Score> actualResponse = this.restTemplate.getForObject("/scores", List.class);
        assertThat(actualResponse).isNotEmpty();
        assertThat(actualResponse).extracting("amount", "candidate").contains(tuple(2, "candidate1"), tuple(1, "candidate2"));
    }

}