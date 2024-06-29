package com.solis.apply.position;

import java.util.List;

public interface PositionService {
    List<PosistionRecord> list();
    PosistionRecord getById(String key);
    void update(PosistionRecord record);
    void deactivate(String key);
}
