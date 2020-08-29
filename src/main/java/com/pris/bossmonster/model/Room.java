package com.pris.bossmonster.model;

import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Room {

    private UUID id;
    @NotNull(message = "Chúpelo Name must be not null")
    @Size(min = 3, message = "Name is to short, must be at least {min} characters long")
    // name should not exceed 16 characters
    private String name;
    // type must not be blank
    private String type;
    // effect must not be blank
    private String effect;
    // treasure must not be blank
    private String treasure;
    // damage must be positive, 0 included and should not be grater than 6
    private int damage;

}