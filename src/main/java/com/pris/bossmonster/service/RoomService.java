package com.pris.bossmonster.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.pris.bossmonster.model.Room;

import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public Room addRoom(Room room) {
        room.setId(UUID.randomUUID());
        rooms.add(room);
        return room;
    }

}