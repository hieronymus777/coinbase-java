package com.coinbase.api.entity;

public class TransactionResponse extends Response {
    private Transaction _transaction;
    
    public Transaction getTransaction() {
        return _transaction;
    }

    public void setTransaction(Transaction transaction) {
        _transaction = transaction;
    }
}
