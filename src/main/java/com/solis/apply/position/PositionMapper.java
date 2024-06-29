package com.solis.apply.position;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PositionMapper {
    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);

    PositionRecord toRecord(PositionEntity entity);
    PositionEntity toEntity(PositionRecord record);

    List<PositionRecord> toRecordList(List<PositionEntity> entities);
    List<PositionEntity> toEntityList(List<PositionRecord> records);
}
