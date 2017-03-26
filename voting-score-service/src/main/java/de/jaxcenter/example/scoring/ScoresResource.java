package de.jaxcenter.example.scoring;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ScoresResource.PATH)
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ScoresResource {

    public static final String PATH = "scores";

    @NonNull
    private final ScoringService scoringService;

    @RequestMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(scoringService.getScores());
    }

}
