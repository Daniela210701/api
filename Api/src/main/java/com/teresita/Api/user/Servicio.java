package com.teresita.Api.user;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class Servicio {

    private final userRepository userRepo;
    public void crearUser(user user){

        userRepo.save(user);

    }

}
