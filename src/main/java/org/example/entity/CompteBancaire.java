package org.example.entity;

import jdk.dynalink.Operation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class  CompteBancaire {

    protected int id;
    protected int pay;
    protected String client;
    protected List<Operation> operations;
}
