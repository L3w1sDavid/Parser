package com.lewis.parser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Map;
@RestController
public class Controller {
    @GetMapping("/api/whoami")
    public Map<String, String> parseHeaders(HttpServletRequest request) {
        // FCC expects these exact three keys: ipaddress, language, and software
        return Map.of(
                "ipaddress", request.getRemoteAddr(),
                "language", request.getHeader("Accept-Language"),
                "software", request.getHeader("User-Agent")
        );
    }
}
