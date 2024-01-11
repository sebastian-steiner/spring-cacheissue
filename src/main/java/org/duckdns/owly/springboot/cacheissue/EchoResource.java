package org.duckdns.owly.springboot.cacheissue;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EchoResource {
    @GetMapping
    public ResponseEntity<String> echo() {
        return ResponseEntity.ok("echo");
    }
}
