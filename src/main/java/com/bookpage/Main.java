package com.bookpage;

import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Tutunamayanlar", "Oğuz Atay", 687, LocalDate.of(1989, 1, 26));
        Book book2 = new Book("Yalnız Efe", "Ömer Seyfettin", 130, LocalDate.of(1999, 2, 22));
        Book book3 = new Book("Osmanlı İmparatorluğu", "Halil İnalcık", 700, LocalDate.of(1974, 3, 14));
        Book book4 = new Book("Nutuk", "Mustafa Kemal Atatürk", 598, LocalDate.of(1930, 4, 21));
        Book book5 = new Book("Kayı 1", "Ahmet Şimşirgil", 400, LocalDate.of(2010, 5, 5));

        TreeSet<Book> books1 = new TreeSet<>();
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);

        for(Book book : books1) {System.out.println(book.getTitle());}

        TreeSet<Book> books2 = new TreeSet<>(new BookPageComparator());
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        System.out.println("#############");

        for (Book book : books2) {System.out.println(book.getPage());}
    }
}