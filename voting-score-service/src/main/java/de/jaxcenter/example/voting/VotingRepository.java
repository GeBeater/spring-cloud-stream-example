package de.jaxcenter.example.voting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<Vote, Long> {
}
