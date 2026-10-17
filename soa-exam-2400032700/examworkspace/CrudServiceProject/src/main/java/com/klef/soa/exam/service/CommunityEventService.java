package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.CommunityEventEntity;

public interface CommunityEventService {
    CommunityEventEntity addEvent(CommunityEventEntity event);
    List<CommunityEventEntity> getAllEvents();
    boolean deleteEvent(Long id);
}
