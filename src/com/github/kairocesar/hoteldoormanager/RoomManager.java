package com.github.kairocesar.hoteldoormanager;

public class RoomManager {

    User user;

    public void openDoor() {
        if (UserCategory.TENANT.equals(this.user.userCategory))
            System.out.println("Door openned!");

    }

    public void closeDoor() {
        System.out.println("Door closed!");
    }
}
