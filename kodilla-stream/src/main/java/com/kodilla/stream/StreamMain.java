package com.kodilla.stream;



import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Poem", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Poem2", text -> toUpperCase (text));
        poemBeautifier.beautify("Poem3", text -> "@" + text + "@");
        poemBeautifier.beautify("Poem4", text -> toLowerCase (text));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
