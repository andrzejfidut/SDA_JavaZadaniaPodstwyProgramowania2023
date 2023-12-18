package com.andrzejfidut.java.basic.exercies.day2;

import java.util.Scanner;

    public class Task9 {
//    Napisz program w jezyku java, którybędzieod użytkownikapobierałkolejne teksty (typu String) tak długo,aż
//    użytkownikpoda tekst „Enough”, a następniewypisze najdłuższyz podanych tekstów(nie biorąc
//pod uwagętekstu „Enough”). Jeśliużytkowniknie poda żadnegotekstu, to wypisz „Noinput”.
//    Przykład:
//    Please insert your text: Ala
//    Please insert your text:
//    No input
//    Please insert your text: ma
//    Please insert your text: kota
//    Please insert your text: i
//    Please insert your text: psa
//    Please insert your text: Enough
//    Result: kota

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;
            String longestText = null;

            System.out.println("Please insert your text: ");

            while (true) {
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("Enough")) {
                    break;
                }

                if (input.trim().isEmpty()) {
                    System.out.println("No input");
                    return;
                }

                if (longestText == null || input.length() > longestText.length()) {
                    longestText = input;
                }

                System.out.println("Please insert your text: ");
            }

            if (longestText != null) {
                System.out.println("Result: " + longestText);
            } else {
                System.out.println("No input");
            }
        }
    }
