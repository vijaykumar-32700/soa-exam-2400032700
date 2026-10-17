package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "community_event")
public class CommunityEventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private String venue;
    private Integer attendeeCount;
    private Boolean completed;

    public CommunityEventEntity() {
     }
    public Long getId() {
        return id;
     }
    public void setId(Long id) {
        this.id = id;
     }
    public String getEventName() {
        return eventName;
     }
    public void setEventName(String eventName) {
        this.eventName = eventName;
     }
    public String getVenue() {
        return venue;
     }
    public void setVenue(String venue) {
        this.venue = venue;
     }
    public Integer getAttendeeCount() {
        return attendeeCount;
    }

    public void setAttendeeCount(Integer attendeeCount) {
        this.attendeeCount = attendeeCount;
     }
    public Boolean getCompleted() {
        return completed;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
      }
  }
