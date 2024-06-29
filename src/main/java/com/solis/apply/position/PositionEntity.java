package com.solis.apply.position;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PositionEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String key;
    String name;
}
