package de.jaxcenter.example.scoring;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Score {

    @Getter
    private final long amount;

    @NonNull
    @Getter
    private final String candidate;
}
