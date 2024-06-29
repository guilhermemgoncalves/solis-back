package com.solis.apply.position;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PositionRepository implements PanacheRepositoryBase<PositionEntity, String> {
}
