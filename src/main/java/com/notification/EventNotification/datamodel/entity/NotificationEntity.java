package com.notification.EventNotification.datamodel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="notifications")
public class NotificationEntity {
    private int id;
    private Date  createdOn;
    private String created_by;
    private Date updatedOn;
    private int alertLimit;
    private int eventDetailsId;
}
