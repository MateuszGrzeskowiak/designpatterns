package pl.sdacademy.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {
    public static void main(String[] args) {
        final Player player = new Player.Builder().withHealth(100)
                .withMana(50)
                .withUsername("Andrzej")
                .withFriends(List.of())
                .build();
        System.out.println(player);
        Person.builder()
                .age(22)
                .firstName("Andrzej")
                .lastName("Andrzejewski")
                .build();
    }
}
