//Created by Matthew Drew on 9/10/21
//COSC 314 - Project 1 - Prof. Cowan

import java.util.*;

public class Project {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        char p; // Declares variable p
        char q; // Declared variable q

        System.out.print("Please enter T or F for p: "); // Prompts for a value for p
        p = kb.next().charAt(0); // Scans in the value
        System.out.print("Please enter T of F for q: "); // Prompts for a value for q
        q = kb.next().charAt(0); // Scans in the value

        kb.close();
        System.out.println("-----------------------------");
        printResults(p, q);

    }

    public static void conjunction(char p, char q) { // Method for an AND gate

        if (p == 'T' && q == 'T') {
            System.out.println("Conjunction: T");
        } else if (p == 'T' && q == 'F') {
            System.out.println("Conjunction: F");
        } else if (p == 'F' && q == 'T') {
            System.out.println("Conjunction: F");
        } else {
            System.out.println("Conjunction: F");
        }

    }

    public static void disjunction(char p, char q) { // Method for an OR gate

        if (p == 'T' || q == 'T') {
            System.out.println("Disjunction: T");
        } else {
            System.out.println("Disjunction: F");
        }
    }

    public static void exclusiveOr(char p, char q) { // Method for an XOR gate

        if (p == 'T' && q == 'T') {
            System.out.println("Exclusive Or: F");
        } else if (p == 'T' && q == 'F') {
            System.out.println("Exclusive Or: T");
        } else if (p == 'F' && q == 'T') {
            System.out.println("Exclusive Or: T");
        } else {
            System.out.println("Exclusive Or: F");
        }
    }

    public static void conditional(char p, char q) { // Method for p->q

        if (p == 'T' && q == 'T') {
            System.out.println("Conditional: T");
        } else if (p == 'T' && q == 'F') {
            System.out.println("Conditional: F");
        } else if (p == 'F' && q == 'T') {
            System.out.println("Conditional: T");
        } else {
            System.out.println("Conditional: T");
        }
    }

    public static void biConditional(char p, char q) { // Method for p<->q

        if (p == 'T' && q == 'T') {
            System.out.println("Conditional: T");
        } else if (p == 'T' && q == 'F') {
            System.out.println("Conditional: F");
        } else if (p == 'F' && q == 'T') {
            System.out.println("Conditional: F");
        } else {
            System.out.println("Conditional: T");
        }
    }

    public static void printResults(char p, char q) { // Method to print all results

        conjunction(p, q);
        disjunction(p, q);
        exclusiveOr(p, q);
        conditional(p, q);
        biConditional(p, q);

    }
}