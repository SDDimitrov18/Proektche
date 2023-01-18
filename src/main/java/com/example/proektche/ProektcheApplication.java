package com.example.proektche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ProektcheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProektcheApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int n = scanner.nextInt();
        System.out.println("Enter second number: ");
        int m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }
}