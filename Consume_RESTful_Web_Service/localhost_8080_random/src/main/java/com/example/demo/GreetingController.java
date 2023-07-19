package com.example.demo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController { 
	// private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/api/random")
	public Map<String, Object> getRandomQuote() {
        Map<String, Object> json = new HashMap<>();
        Map<String, Object> value = new HashMap<>();

        value.put("id", counter.incrementAndGet());
        value.put("quote", "Really loving Spring Boot, makes stand-alone Spring apps easy.");

        json.put("type", "success");
        json.put("value", value);

        return json;
    }
}
