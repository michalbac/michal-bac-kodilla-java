package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumber = new ArrayList<Integer>();

     public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int n = 0; n < numbers.size(); n++) {
            if ((numbers.get(n)) % 2 == 0){
                evenNumber.add(numbers.get(n));
            }
        }
        return evenNumber;
    }
}
