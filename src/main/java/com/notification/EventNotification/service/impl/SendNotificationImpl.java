package com.notification.EventNotification.service.impl;

import com.notification.EventNotification.datamodel.dao.EventDetailsDao;
import com.notification.EventNotification.datamodel.entity.EventDataEntity;
import com.notification.EventNotification.service.SendNotification;
import jdk.jfr.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class SendNotificationImpl implements SendNotification {

    @Autowired
    private EventDetailsDao eventDetailsDao;
    @Override
    public String pushNotification() {
        List<EventDataEntity> newEvent = eventDetailsDao.findAll();

        for(int i = 0; i<newEvent.size(); i++){
            EventDataEntity eventDetail = newEvent.get(i);
            Date notificationTime = eventDetail.getEventDate();
            if(notificationTime.equals(new Date())){
                log.info("Send notification");
            }
        }
        return "Notification send successfully";
    }
}
