package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//Proxy Bean을 만들어서 주입.
public class Proto {
//    @Autowired
//    Single single;
    //아무 문제 없음.
}
