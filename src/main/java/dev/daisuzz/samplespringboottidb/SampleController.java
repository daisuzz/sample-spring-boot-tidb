package dev.daisuzz.samplespringboottidb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    private final SampleMapper mapper;

    public SampleController(SampleMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/hello")
    public String hello() {
        return mapper.getHelloWorld();
    }
}
