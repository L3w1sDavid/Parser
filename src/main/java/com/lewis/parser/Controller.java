package com.lewis.parser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
@RestController
public class Controller {
    @GetMapping("/api/whoami")
    public WhoamIResponse parseHeaders(HttpServletRequest request) {
        WhoamIResponse whoamIResponse = new WhoamIResponse(request.getRemoteAddr(), request.getHeader("Accept-Language"), request.getHeader("User-Agent")
        );
        return whoamIResponse;

    }
}
