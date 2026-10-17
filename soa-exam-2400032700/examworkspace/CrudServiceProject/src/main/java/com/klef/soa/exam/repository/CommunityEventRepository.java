package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.CommunityEventEntity;

public interface CommunityEventRepository extends JpaRepository<CommunityEventEntity, Long> {
}
