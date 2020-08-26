package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {
    @Autowired
    private ObjectProvider<Proto> proto;
    //코드 자체에 스프링 코드가 들어가 버림.

    public Proto getProto() {
        return proto.getIfAvailable();
    }
}
