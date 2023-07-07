package ru.somsin.nismos.cms.config;

import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.somsin.nismos.cms.Application;

@ActiveProfiles("test")
@AutoConfigureWebTestClient
@SpringBootTest(classes = Application.class)
public class SpringTestConfig {
}
