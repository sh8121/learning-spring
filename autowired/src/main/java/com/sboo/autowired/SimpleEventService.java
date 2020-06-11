package com.sboo.autowired;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {
    @Override
    public void createEvent() {
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");
    }

    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Deleted an event");
    }
}
