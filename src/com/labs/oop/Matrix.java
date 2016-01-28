package com.labs.oop;

import java.util.Random;

public class Matrix {
    private int size;
    private int[][] matrix;


    public Matrix () {
        this.size = 2;
        this.matrix = new int[size][size];
    }

    public Matrix (int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public Matrix(int size, int[][] matrix) {
        this.size = size;
        this.matrix = matrix;
    }

    public Matrix (Matrix obj) {
        this.size = obj.getSize();
        this.matrix = obj.getMatrix();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void fillMatrix() {
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.matrix[i][j] = rand.nextInt(21) - 10;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.matrix[row][col];
    }

    public void setValue(int row, int col, int val) {
        this.matrix[row][col] = val;
    }

    @Override
    public String toString() {

        String result = new String();

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                result += "\t" + String.valueOf(this.getValue(i, j));
            }
            result += "\n";
        }

        return result;
    }

    public int getMin() {

        int min = this.matrix[0][0];

        for (int i = 0; i < size; i++)
            for (int j = 1; j < size; j++)
                if (this.matrix[i][j] < min)
                    min = this.matrix[i][j];

        return min;

    }

    public int getMax() {

        int max = this.matrix[0][0];

        for (int i = 0; i < size; i++)
            for (int j = 1; j < size; j++)
                if (this.matrix[i][j] > max)
                    max = this.matrix[i][j];

        return max;

    }

    public int getMaxInRow (int row) {

        
    }
}

