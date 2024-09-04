package com.solis.bills.service;

import com.solis.bills.dto.AddTransactionRecord;
import com.solis.bills.entity.TransactionEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TransactionService implements ITransactionService{

    @Transactional
    @Override
    public void addTransaction(AddTransactionRecord transactionRecord) {

        TransactionEntity entity = new TransactionEntity();

        entity.addTransaction(transactionRecord);

        entity.persist();
    }
}
