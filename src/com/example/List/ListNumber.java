//4). Задан список целых чисел и число X. Не используя вспомогательных
// объектов и не изменяя размера списка, переставить элементы списка так,
// чтобы сначала шли числа, не превосходящие X, а затем числа, большие X.
package com.example.List;

public class ListNumber {
  private   int number;

    public ListNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public  void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  " "+ number ;
    }
}
