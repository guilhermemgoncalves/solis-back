package com.solis.bills.service;

import com.solis.bills.dto.AddTransactionRecord;

public interface ITransactionService {
    void addTransaction(AddTransactionRecord record);
}
