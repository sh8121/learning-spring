package com.sboo.springboottutorial;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
//@CrossOrigin(origins = "http://localhost:18080")
public class SampleController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
