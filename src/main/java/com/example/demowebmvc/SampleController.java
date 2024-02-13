package com.example.demowebmvc;

import org.springframework.boot.WebApplicationType;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleController {

    @GetMapping("/events")
    public @ResponseBody String getEvents(){
        return "events";
    }

    @GetMapping("/events/{id}")
    public @ResponseBody String getEventsId(@PathVariable("id") int id){
        return "events";
    }

    @DeleteMapping("/events/{id}")
    @ResponseBody
    public String deleteEvents(@PathVariable int id){
        return "events";
    }

}
