package com.example.gateway.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fallback")
class FallbackController {
    @GetMapping("/billingFallback")
    public ResponseEntity<String> billingFallback() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("We are facing a problem. Please contact support")
    }
}
