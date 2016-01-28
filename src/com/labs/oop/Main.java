package com.labs.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int matrix_size = sc.nextInt();
        Matrix m = new Matrix(matrix_size);
        m.fillMatrix();
        System.out.println(m.toString());
    }
}
