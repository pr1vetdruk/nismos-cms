package ru.somsin.nismos.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.somsin.nismos.cms.model.dto.TestDto;

import java.util.List;

@RestController
@RequestMapping("/nismos-cms/v0/tests")
public class TestController {
    @GetMapping
    public Mono<List<TestDto>> tests() {
        TestDto test1 = TestDto.builder()
                .id(1L)
                .name("test 1L")
                .build();
        TestDto test2 = TestDto.builder()
                .id(2L)
                .name("test 2L")
                .build();

        return Mono.just(List.of(test1, test2));
    }
}
