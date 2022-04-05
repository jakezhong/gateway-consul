package com.example.gateway.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import reactor.core.publisher.Mono

@RestController
class HystrixFallbackRestController {
    @GetMapping("/api/fallback")
    Mono<String> getApiSvcMsg() {
        return Mono.just("No response from api service and will be back shortly")
    }

    @GetMapping("/fx-exchange/fallback")
    Mono<String> getFxSvcMsg() {
        return Mono.just("No response from Forex Service and will be back shortly")
    }

    @GetMapping("/cc-converter/fallback")
    Mono<String> getCcSvcMsg() {
        return Mono.just("No response from Currency Conversion Service and will be back shortly")
    }

}
