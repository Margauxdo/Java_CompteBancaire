package org.example.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@SuperBuilder
@AllArgsConstructor
public class CompteEpargne extends CompteBancaire {
}
