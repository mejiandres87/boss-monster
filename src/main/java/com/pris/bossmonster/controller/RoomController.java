package com.pris.bossmonster.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.pris.bossmonster.model.Room;
import com.pris.bossmonster.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rooms")
public class RoomController {

    @Autowired
    private RoomService service;

    @GetMapping
    public ResponseEntity<List<Room>> getRooms() {
        return ResponseEntity.ok().body(service.getRooms());
    }

    @PostMapping
    public ResponseEntity createRoom(@Valid @RequestBody Room room) {
        Room r = service.addRoom(room);
        return ResponseEntity.created(URI.create("http://localhost:9000/rooms/" + r.getId())).build();
    }

}