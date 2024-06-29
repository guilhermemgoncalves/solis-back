package com.solis.apply.position;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PositionServiceImpl implements PositionService{
    @Inject
    PositionRepository repository;

    PositionMapper mapper = PositionMapper.INSTANCE;
    @Override
    public List<PositionRecord> list() {
        return mapper.toRecordList(repository.listAll());
    }

    @Override
    public PositionRecord getById(String key) {
        return mapper.toRecord(repository.findById(key));
    }

    @Override
    public void update(PositionRecord record) {

    }

    @Override
    public void deactivate(String key) {

    }

    @Override
    public String create(PositionRecord record) {
        PositionEntity entity = mapper.toEntity(record);
        repository.persist(entity);
        return entity.key;
    }
}
