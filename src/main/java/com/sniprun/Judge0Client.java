package com.sniprun;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@Service
public class Judge0Client {
    private final RestClient restClient;

    public Judge0Client(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://judge0-ce.p.rapidapi.com")
                .defaultHeader("x-rapidapi-key", "d17330c6damsh518d79d417c23d7p1cc1c3jsn902f9c957c9a")
                .defaultHeader("x-rapidapi-host", "judge0-ce.p.rapidapi.com")
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}
