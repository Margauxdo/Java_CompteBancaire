package org.example.entity;

import jdk.dynalink.Operation;

import java.util.List;

public abstract class  CompteBancaire {

    protected int id;
    protected int pay;
    protected String client;
    protected List<Operation> operations;
}
