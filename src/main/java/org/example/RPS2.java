package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RPS2 {

    public static int elf(String filePath) throws IOException {

        int score = 0;

        // If I win = 6 points
        // If I draw = 3 points
        // If I lose = 0 points
        // If I choose rock = 1 points
        // If I choose paper = 2 points
        // If I choose scissors = 3 points

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line
                char result = line.charAt(0);
                char result2 = line.charAt(2);
                
                if (result == 'A' && result2 == 'X') { // rock
                    score = score + 0 + 3; // I must lose (X) so choose scissors

                } else if (result == 'A' && result2 == 'Y') { // rock
                    score = score + 3 + 1; // I must draw (X) so choose rock

                } else if (result == 'A' && result2 == 'Z') { // rock
                    score = score + 6 + 2; // I must win (X) so choose paper


                } else if (result == 'B' && result2 == 'X') { // paper
                    score = score + 0 + 1; // I must lose (X) so choose rock

                } else if (result == 'B' && result2 == 'Y') { // paper
                    score = score + 3 + 2; // I must draw (X) so choose paper

                } else if (result == 'B' && result2 == 'Z') { // paper
                    score = score + 6 + 3; // I must win (X) so choose scissors


                } else if (result == 'C' && result2 == 'X') { // scissors
                    score = score + 0 + 2; // I must lose (X) so choose paper

                } else if (result == 'C' && result2 == 'Y') { // scissors
                    score = score + 3 + 3; // I must draw (X) so choose scissors

                } else if (result == 'C' && result2 == 'Z') { //scissors
                    score = score + 6 + 1; // I must win (X) so choose rock
                }
            }

        } finally {
            br.close();
        }

        return score;

    }

}
