package com.greet.service;

import com.greet.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    private final List<Greeting> greetings = new ArrayList<>();
    private int nextId = 1;
    public Greeting addGreeting(String name, String message) {
        Greeting greeting =
                new Greeting(nextId++, name, message);
        greetings.add(greeting);
        return greeting;
    }

    public List<Greeting> getAllGreetings() {
        return greetings;
    }

    public Greeting getGreetingById(int id) {
        for (Greeting greeting : greetings) {
            if (greeting.getId() == id) {
                return greeting;
            }
        }
        return null;
    }

    public boolean updateGreeting(int id, String name, String message) {
        Greeting greeting = getGreetingById(id);
        if (greeting != null) {
            greeting.setName(name);
            greeting.setMessage(message);
            return true;
        }
        return false;
    }

    public boolean deleteGreeting(int id) {
        Greeting greeting = getGreetingById(id);
        if (greeting != null) {
            greetings.remove(greeting);
            return true;
        }
        return false;
    }
}