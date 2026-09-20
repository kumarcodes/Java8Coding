package com.serialization;

import java.io.*;

class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class SerializationExample {

    public static void main(String args[]) throws FileNotFoundException {
        User user = new User("rohit", "password");
        String filename = "user.ser";
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))) {
            output.writeObject(user);
            System.out.println("Serialization successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}