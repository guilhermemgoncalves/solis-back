package com.solis.bills.dto;

import com.solis.bills.enums.EntryType;

public record AddTransactionRecord(double amount, EntryType entryType, String name) {
}
