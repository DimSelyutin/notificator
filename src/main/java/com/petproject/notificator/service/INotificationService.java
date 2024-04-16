package com.petproject.notificator.service;



import com.petproject.notificator.entity.Notification;

public interface INotificationService {
    Notification createNotification(Notification notification);

    Notification findNotificationById(Long id);

    // List<Notification> findNotificationsByDelivered(boolean delivered);
}
