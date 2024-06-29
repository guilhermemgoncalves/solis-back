package com.solis.apply.position;

import java.util.List;

public interface PositionService {
    List<PositionRecord> list();
    PositionRecord getById(String key);
    void update(PositionRecord record);
    void deactivate(String key);
    String create(PositionRecord record);
}
