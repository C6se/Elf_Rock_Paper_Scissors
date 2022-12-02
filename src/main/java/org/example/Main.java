package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("First session scores me " + RPS.elf("rps.txt") + " points.");
        System.out.println("Second session scores me " + RPS2.elf("rps.txt") + " points.");

    }
}