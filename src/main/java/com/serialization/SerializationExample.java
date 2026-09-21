package com.serialization;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

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
//        User user = new User("rohit", "password");
//        String filename = "user.ser";
//        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))) {
//            output.writeObject(user);
//            System.out.println("Serialization successful");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().peek(System.out::println);
        //System.out.println(count);
       // First Non-Repeated Character
        String str = "Rohit Kumar Sharma";
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()))
                .forEach((x,y)->{
                    System.out.println(x+" "+y);
                });
        //Query to
    }
}