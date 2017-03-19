package de.jaxcenter.example.voting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(VotingResource.PATH)
public class VotingResource {

    public static final String PATH = "/votes";

    private final VotingService votingService;

    @Autowired
    public VotingResource(VotingService votingService) {
        this.votingService = votingService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createVote(@RequestBody Vote vote) {
        votingService.vote(vote);
        return ResponseEntity.ok().build();
    }

}
