package com.klef.soa.exam.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.klef.soa.exam.entity.CommunityEventEntity;
import com.klef.soa.exam.service.CommunityEventService;
@RestController
public class CommunityEventController {
    private final CommunityEventService service;

    public CommunityEventController(CommunityEventService service) {
        this.service = service;
    }
    @GetMapping("/")
    public String home() {
        return "Test api call";
    }
    @PostMapping("/Add")
    public CommunityEventEntity addEvent(@RequestBody CommunityEventEntity event) {
        return service.addEvent(event);
    }
    @GetMapping("/DisplayAll")
    public List<CommunityEventEntity> displayAll() {
        return service.getAllEvents();
    }
    @DeleteMapping("/Delete/{id}")
    public boolean deleteEvent(@PathVariable Long id) {
        return service.deleteEvent(id);
      }
   }
