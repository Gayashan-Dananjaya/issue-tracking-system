package com.issue_tracker.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin
//@RequestMapping("/api/v1/issue_tracker")
public class HomeController {

    @GetMapping
    public String home() {
        return "Hello, home!";
    }

    @GetMapping(value = "/secured")
    public String secured(Principal principal, @AuthenticationPrincipal OAuth2User user) {
//        return "Hello, secured!" + " username: " + principal.getName() + principal.toString() + "\n" + user.getAttributes();
        return user.getAttributes().toString();
    }

}
