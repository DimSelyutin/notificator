package com.petproject.notificator.controller;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/notifications")
public class AppController {



    @GetMapping("/welcome")
    public String welcome() {
        return "Добро пожаловать!";
    }

    
    // @PostMapping("/{id}")
    // @Operation(summary = "send a Notification to all Recipients registered for
    // the provided Template ID")
    // public ResponseEntity<String> notify(
    // @RequestHeader Long clientId,
    // @PathVariable("id") Long templateId) {
    // return
    // ResponseEntity.status(OK).body(notificationService.distributeNotifications(clientId,
    // templateId));
    // }

    // @PostMapping("/{id}/sent")
    // @Operation(summary = "set Notification status as successfully sent to
    // Recipient")
    // public ResponseEntity<NotificationHistoryResponse> setNotificationAsSent(
    // @RequestHeader Long clientId,
    // @PathVariable("id") Long notificationId) {
    // return
    // ResponseEntity.status(OK).body(notificationService.setNotificationAsSent(clientId,
    // notificationId));
    // }

    // @PostMapping("/{id}/error")
    // @Operation(summary = "set Notification status as error")
    // public ResponseEntity<NotificationHistoryResponse> setNotificationAsError(
    // @RequestHeader Long clientId,
    // @PathVariable("id") Long notificationId) {
    // return
    // ResponseEntity.status(OK).body(notificationService.setNotificationAsError(clientId,
    // notificationId));
    // }

    // @PostMapping("/{id}/corrupt")
    // @Operation(summary = "set Notification status as impossible to sent")
    // public ResponseEntity<NotificationHistoryResponse> setNotificationAsCorrupt(
    // @RequestHeader Long clientId,
    // @PathVariable("id") Long notificationId) {
    // return
    // ResponseEntity.status(OK).body(notificationService.setNotificationAsCorrupt(clientId,
    // notificationId));
    // }

    // @PostMapping("/{id}/resending")
    // @Operation(summary = "set Notification status as waiting to be resend")
    // public ResponseEntity<NotificationResponse> setNotificationAsResending(
    // @RequestHeader Long clientId,
    // @PathVariable("id") Long notificationId) {
    // return
    // ResponseEntity.status(OK).body(notificationService.setNotificationAsResending(clientId,
    // notificationId));
    // }

    // @GetMapping("/")
    // @Operation(summary = "FOR REBALANCER: get Resending/Pending/New Notifications
    // (set Pending status)")
    // public ResponseEntity<List<NotificationKafka>>
    // getNotificationsForRebalancing(
    // @RequestParam(name = "pending", required = false, defaultValue = "10") Long
    // pendingSec,
    // @RequestParam(name = "new", required = false, defaultValue = "10") Long
    // newSec,
    // @RequestParam(name = "size", required = false, defaultValue = "20") Integer
    // size) {
    // return ResponseEntity.status(OK).body(
    // notificationService.getNotificationsForRebalancing(pendingSec, newSec,
    // size));
    // }
}