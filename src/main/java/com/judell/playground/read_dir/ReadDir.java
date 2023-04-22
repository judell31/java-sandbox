package com.judell.playground.read_dir;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadDir {

    public static void main(String[] args) {
        System.out.println("Read Dir\n");

//        Path dir = Paths.get(Constants.DIR_PATH);
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//            for (Path file : stream) {
//                System.out.println("URI: " + file.toUri());
//                System.out.println("File: " + file.toFile());
//            }
//        } catch (IOException | DirectoryIteratorException x) {
//            // IOException can never be thrown by the iteration.
//            // In this snippet, it can only be thrown by newDirectoryStream.
//            System.err.println(x);
//        }

        getSubDir();
    }

    public static void getSubDir() {
        Path start = Paths.get(Constants.DIR_PATH);
        try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
            List<String> collect = stream
                    .map(String::valueOf)
                    .sorted()
//                    .collect(Collectors.toList());
                    .toList();

            collect.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
