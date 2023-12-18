package com.andrzejfidut.java.basic.exercies.day1;

public class Task1 {

        public static void main(String[] args) {
//        github.com/pd1916/ZdJavaPol153ZadaniaPodstawy/tree/day_1

            displayWordUsingDecimal();
            System.out.println();
            displayWordUsingHexa();
            System.out.println();
            displayWordUsingBinary();
        }

        private static void displayWordUsingBinary() {
            char s = 0b01010011;
            char d = 0b01000100;
            char a = 0b01000001;
            System.out.print(s);
            System.out.print(d);
            System.out.print(a);
        }

        private static void displayWordUsingHexa() {
            char s = 0x53;
            char d = 0x44;
            char a = 0x41;
            System.out.print(s);
            System.out.print(d);
            System.out.print(a);
        }

        private static void displayWordUsingDecimal() {
            char s = 83;
            char d = 68;
            char a = 65;
            System.out.print(s);
            System.out.print(d);
            System.out.print(a);

        }
}
