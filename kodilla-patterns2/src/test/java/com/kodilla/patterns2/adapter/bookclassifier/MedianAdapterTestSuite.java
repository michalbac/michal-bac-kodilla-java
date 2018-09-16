package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        BookA book1 = new BookA("Suzanne Collins", "The Hunger Games", 2008, "BOOK1");
        BookA book2 = new BookA("J.K. Rowling", "Harry Potter and the Order of the Phoenix", 2004, "BOOK2");
        BookA book3 =  new BookA("Jane Austen", "Pride and Prejudice", 2000, "BOOK3");
        BookA book4 = new BookA("Markus Zusak", "The Book Thief", 2006, "BOOK4");
        BookA book5 = new BookA("George Orwell", "Animal Farm", 2003, "BOOK5");
        BookA book6 = new BookA("Margaret Mitchell", "Gone with the Wind", 1999, "BOOK6");
        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(book1);
        bookASet.add(book2);
        bookASet.add(book3);
        bookASet.add(book4);
        bookASet.add(book5);
        bookASet.add(book6);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookASet);

        //Then
        System.out.println(median);
        assertEquals(median,2004);
    }
}
