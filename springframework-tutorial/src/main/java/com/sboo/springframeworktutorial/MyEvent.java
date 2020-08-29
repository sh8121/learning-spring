package com.sboo.springframeworktutorial;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

    //비침투성
    private Object source;
    private int data;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }
}
