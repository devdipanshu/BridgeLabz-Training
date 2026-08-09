package com.greet.controller;

import com.greet.model.Greeting;
import com.greet.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/greet")
public class GreetingController {
    private final GreetingService service;
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public List<Greeting> getAllGreetings() {

        return service.getAllGreetings();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Greeting getGreeting(@PathVariable int id) {
        return service.getGreetingById(id);
    }

    @PostMapping
    @ResponseBody
    public Greeting addGreeting(
            @RequestParam String name,
            @RequestParam String message) {
        return service.addGreeting(name, message);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public String updateGreeting(
            @PathVariable int id,
            @RequestParam String name,
            @RequestParam String message) {
        boolean updated =
                service.updateGreeting(id, name, message);
        if (updated) {
            return "Greeting updated successfully";
        }
        return "Greeting not found";
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteGreeting(@PathVariable int id) {
        boolean deleted =
                service.deleteGreeting(id);
        if (deleted) {
            return "Greeting deleted successfully";
        }
        return "Greeting not found";
    }
}