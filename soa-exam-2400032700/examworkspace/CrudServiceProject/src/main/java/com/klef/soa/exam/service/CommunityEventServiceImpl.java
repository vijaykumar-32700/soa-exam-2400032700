package com.klef.soa.exam.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.klef.soa.exam.entity.CommunityEventEntity;
import com.klef.soa.exam.repository.CommunityEventRepository;

@Service
public class CommunityEventServiceImpl implements CommunityEventService {
    private final CommunityEventRepository repository;

    public CommunityEventServiceImpl(CommunityEventRepository repository) {
        this.repository = repository;
    }
    @Override
    public CommunityEventEntity addEvent(CommunityEventEntity event) {
        return repository.save(event);
    }
    @Override
    public List<CommunityEventEntity> getAllEvents() {
        return repository.findAll();
    }
    @Override
    public boolean deleteEvent(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
