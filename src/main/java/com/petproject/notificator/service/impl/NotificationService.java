package com.petproject.notificator.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.petproject.notificator.entity.Notification;
import com.petproject.notificator.repository.NotificationRepository;
import com.petproject.notificator.service.INotificationService;

@Service
public class NotificationService implements INotificationService {

    private NotificationRepository notificationRepository;

    public void setNotificationRepository(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification findNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    // public List<Notification> findNotificationsByDelivered(boolean delivered) {
    //     return notificationRepository.findByDelivered(delivered);
    // }
}