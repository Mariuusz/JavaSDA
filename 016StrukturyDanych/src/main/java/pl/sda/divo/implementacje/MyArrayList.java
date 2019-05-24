package pl.sda.divo.implementacje;

import java.util.Arrays;

class MyArrayList {
    private static final int CAPACITY = 6;
    private int[] numbers = new int[CAPACITY];
    private int index = 0;

    public int get(int i) {
        return numbers[i];
    }

    public void add(int number) {
        if (index >= numbers.length) {
            copy(2 * numbers.length);
        }
        numbers[index++] = number;
    }

    private void copy(int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i < size() - 1; i++) {
            temp[i] = get(i);
        }
        numbers = temp;
    }
    public int size() {
        return index + 1;
    }

        @Override
    public String toString() {
        return  "index[" + index + "] = " + Arrays.toString(numbers);
    }
}