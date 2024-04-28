package com.teresita.Api.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping ("/user")
@RequiredArgsConstructor

public class userController {

    private final Servicio userService;

    @PostMapping
    public void createUser(@RequestBody user User)
    {
        userService.crearUser(User);

    }
}
