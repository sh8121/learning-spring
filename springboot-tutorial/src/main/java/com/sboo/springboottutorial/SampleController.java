package com.sboo.springboottutorial;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/exception")
    public void exception() {
        throw new SampleException();
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "sboo");
        return "hello";
    }

//    @ExceptionHandler(SampleException.class)
//    @ResponseBody
//    public AppError sampleError(SampleException exception) {
//        AppError appError = new AppError();
//        appError.setMessage("error.app.key");
//        appError.setReason("akakakakakak");
//        return appError;
//    }
}
