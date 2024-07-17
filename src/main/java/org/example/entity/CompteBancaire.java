package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class  CompteBancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cbanquaire_id")
    protected int id;
    protected int pay;
    @ManyToOne
    @JoinColumn(name = "client_id")
    protected Client client;
    @OneToMany
    @JoinColumn(name = "cbanquaire_id")
    protected List<Operation> operations;
}
