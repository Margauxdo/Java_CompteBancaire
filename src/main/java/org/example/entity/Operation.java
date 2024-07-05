package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.util.StatutOperation;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "operation_id")
    private int id;
    // TODO auto incrémentation du nombre (pas dans le CRUD, ici ou dans OperationService)
    private int numberOperation;
    private float price ;
    private StatutOperation statutOperation;
}
