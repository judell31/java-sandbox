package com.judell.playground.read_dir;

import java.io.IOException;
import java.nio.file.*;

public class ReadDir {

    public static void main(String[] args) {
        System.out.println("Read Dir\n");

        Path dir = Paths.get(Constants.DIR_PATH);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {
                System.out.println("URI: " + file.toUri());
                System.out.println("File: " + file.toFile());
            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }
}
