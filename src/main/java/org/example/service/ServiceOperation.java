package org.example.service;

import org.example.entity.Operation;
import org.example.repository.RepositoryOperation;
import org.hibernate.Session;

import java.util.List;

public class ServiceOperation {

    private RepositoryOperation repositoryOperation;
    private Session session ;

    public ServiceOperation() {
        this.repositoryOperation = new RepositoryOperation();
    }

    public Operation createOperation(Operation operation) {
        return repositoryOperation.createOperation(operation);
    }

    public Operation findOperationById(int id) {
        return repositoryOperation.findOperationById(id);
    }

    public List<Operation> findAllOperations() {
        return repositoryOperation.findAllOperation();
    }

    public Operation updateOperation(Operation operation) {
        return repositoryOperation.updateOperation(operation);
    }

    public Operation deleteOperationB(Operation operation) {
        return repositoryOperation.deleteOperation(operation);
    }
}
