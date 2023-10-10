package com.Basic;

public class Cout {


    public static void main(String[] args) {
        int width = 10;  // Adjust the width as needed

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == 6 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else if (i == 3 && j == 2) {
                    System.out.print("Hello");
                    j += 4; // Skip the characters in "Hello"
                } else if (i == 4 && j == 2) {
                    System.out.print("World");
                    j += 4; // Skip the characters in "World"
                } else if (i == 5 && j == 2) {
                    System.out.print("in");
                    j += 1; // Skip the characters in "in"
                } else if (i == 6 && j == 2) {
                    System.out.print("a");
                    j += 4; // Skip the character in "a"
                } else if (i == 5 && j == 7) {
                    System.out.print("frame");
                    j += 5; // Skip the characters in "frame"
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}


