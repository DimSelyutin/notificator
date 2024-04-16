package com.petproject.notificator.repository;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.petproject.notificator.entity.Notification;

import io.lettuce.core.dynamic.annotation.Param;


public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Optional<Notification> findByIdAndClientId(Long notificationId, Long clientId);

    List<Notification> findNotificationsByStatusAndCreatedAt(
            @Param("pendingDateTime") LocalDateTime pendingDateTime,
            @Param("newDateTime") LocalDateTime newDateTime,
            Pageable pageable
    );
}
