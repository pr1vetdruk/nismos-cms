package ru.somsin.nismos.cms.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;
import ru.somsin.nismos.cms.config.SpringTestConfig;

public class TestControllerTest extends SpringTestConfig {
    @Autowired
    private WebTestClient webClient;

    @Test
    public void tests() {
        webClient.get().uri("/nismos-cms/v0/tests")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("[{\"id\":1,\"name\":\"test 1L\"},{\"id\":2,\"name\":\"test 2L\"}]");
    }
}
