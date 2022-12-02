package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RPS {

    public static int elf(String filePath) throws IOException {

        int score = 0;

        // If I win = 6
        // If I draw = 3
        // If I lose = 0
        // If I choose rock = 1
        // If I choose paper = 2
        // If I choose scissors = 3

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line
                char result = line.charAt(0);
                char result2 = line.charAt(2);
                
                if (result == 'A' && result2 == 'X') { // rock vs rock
                    score = score + 3 + 1; // A draw and chose rock

                } else if (result == 'A' && result2 == 'Y') { // rock vs paper
                    score = score + 6 + 2; // I won and chose paper

                } else if (result == 'A' && result2 == 'Z') { // rock vs scissors
                    score = score + 0 + 3; // I lost and chose scissors

                } else if (result == 'B' && result2 == 'X') { // paper vs rock
                    score = score + 0 + 1; // I lost and chose rock

                } else if (result == 'B' && result2 == 'Y') { // paper vs paper
                    score = score + 3 + 2; // A draw and chose paper

                } else if (result == 'B' && result2 == 'Z') { // paper vs scissors
                    score = score + 6 + 3; // I won and chose scissors

                } else if (result == 'C' && result2 == 'X') { // scissors vs rock
                    score = score + 6 + 1; // I won and chose rock

                } else if (result == 'C' && result2 == 'Y') { // scissors vs paper
                    score = score + 0 + 2; // I lost and chose paper

                } else if (result == 'C' && result2 == 'Z') { //scissors vs scissors
                    score = score + 3 + 3; // A draw and chose scissors
                }
            }
        } finally {
            br.close();
        }

        return score;

    }

}
