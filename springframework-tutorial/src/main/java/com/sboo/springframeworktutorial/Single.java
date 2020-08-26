package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {
    @Autowired
    private Proto proto;
    //계속 사용해도 이게 변경되지 않음.

    public Proto getProto() {
        return proto;
    }
}
