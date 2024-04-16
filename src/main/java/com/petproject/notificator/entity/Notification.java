package com.petproject.notificator.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.petproject.notificator.model.NotificationStatus;
import com.petproject.notificator.model.NotificationType;
import lombok.Builder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


import static com.petproject.notificator.model.NotificationStatus.NEW;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clientId;
    private Long recipientId;
    private Long templateHistoryId;
    private Long urlId;

    private NotificationType type;
    private String credential;

    @Builder.Default
    private NotificationStatus status = NEW;

    @Builder.Default
    private Integer retryAttempts = 0;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    public Notification setNotificationStatus(NotificationStatus notificationStatus) {
        setStatus(notificationStatus);
        return this;
    }

    public Notification updateCreatedAt() {
        setCreatedAt(LocalDateTime.now());
        return this;
    }

    public Notification incrementRetryAttempts() {
        setRetryAttempts(getRetryAttempts() + 1);
        return this;
    }

    public Notification addTemplateHistory(Long templateHistoryId) {
        setTemplateHistoryId(templateHistoryId);
        return this;
    }

    public Notification setUrl(Long urlId) {
        setUrlId(urlId);
        return this;
    }
}