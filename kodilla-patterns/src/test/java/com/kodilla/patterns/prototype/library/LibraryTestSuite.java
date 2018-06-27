package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library bookList = new Library("List of books");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> bookList.getBooks().add(new Book("Book number " + n, "Author no: " +n, LocalDate.of(2000,1,1 +n))));


        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = bookList.shallowCopy();
            clonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLirary = null;
        try {
            deepClonedLirary = bookList.deepCopy();
            clonedLibrary.setName("Deep Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        bookList.getBooks().clear();

        //Then
        Assert.assertEquals(0, bookList.getBooks().size());
        Assert.assertEquals(10, deepClonedLirary.getBooks().size());
        Assert.assertEquals(0,clonedLibrary.getBooks().size());



    }
}
