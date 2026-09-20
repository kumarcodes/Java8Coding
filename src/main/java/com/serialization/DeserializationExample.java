package com.serialization;

import java.io.*;

public class DeserializationExample {

    public static void main(String[] args) {
        User user = new User("rohit", "password");
        String filename = "user.ser";
        // Deserialization
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(filename))) {

            User user2 = (User) input.readObject();

            System.out.println("Deserialization successful");
            System.out.println(user2);

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
