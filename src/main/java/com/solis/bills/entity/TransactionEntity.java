package com.solis.bills.entity;

import com.solis.bills.dto.AddTransactionRecord;
import com.solis.bills.enums.EntryType;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


@Table(name="TRANSACTION_ENTITY")
@Entity
public class TransactionEntity extends PanacheEntity {


    public TransactionEntity(){

    }

    EntryType entryType;

    Double amount;

    String name;


    public void addTransaction(AddTransactionRecord record){
        amount = record.amount();
        entryType = record.entryType();
        name = getName(record);
    }

    private String getName(AddTransactionRecord record){
        if(record.name().trim().isBlank()){
            return "#" + OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddhhmm"));
        }
        return record.name();
    }
}
