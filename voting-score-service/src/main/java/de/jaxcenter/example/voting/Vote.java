package de.jaxcenter.example.voting;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Table(name = "vote")
@Entity
@Data
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max = 64)
    private String candidate;
}
