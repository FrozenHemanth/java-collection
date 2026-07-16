package Runner;

import com.frozen.collection.set.Books;
import java.util.*;

public class BookRunner {

    public static void main(String[] args) {
        Set<String> bookTitles = new HashSet<>();
        bookTitles.add("Java Programming");
        bookTitles.add("Python Basics");
        bookTitles.add("Data Structures");
        bookTitles.add("Java Programming");
        System.out.println("Book titles: " + bookTitles);

        System.out.println("Searching for Java:");
        bookTitles.stream()
            .filter(c -> c.contains("Java"))
            .map(c -> c.toUpperCase())
            .forEach(System.out::println);

        System.out.println("Searching for Python:");
        bookTitles.stream()
            .filter(c -> c.contains("Python"))
            .map(c -> c.toLowerCase())
            .forEach(System.out::println);

        System.out.println("-------------operations-----------------");
        Set<String> anotherBooks = new HashSet<>();
        anotherBooks.add("Java Programming");
        anotherBooks.add("Algorithms");
        anotherBooks.add("Data Structures");

        System.out.println("Set equality:");
        boolean isEqual = bookTitles.equals(anotherBooks);
        System.out.println("Are two sets equal: " + isEqual);

        System.out.println("Subset check:");
        boolean isSubset = bookTitles.containsAll(anotherBooks);
        System.out.println("Is anotherBooks subset of bookTitles: " + isSubset);

        System.out.println("Converting to List:");
        List<String> listBooks = new ArrayList<>(bookTitles);
        for (int i = 0; i < listBooks.size(); i++) {
            System.out.println(listBooks.get(i));
        }

        System.out.println("Custom object sets:");
        Set<Books> booksSet = new HashSet<>();
        booksSet.add(new Books("Java Programming", "James Gosling"));
        booksSet.add(new Books("Python Basics", "Guido van Rossum"));
        booksSet.add(new Books("Data Structures", "Cormen"));
        for (Books book : booksSet) {
            System.out.println(book);
        }

        System.out.println("TreeSet (sorted):");
        Set<String> treeBooks = new TreeSet<>();
        treeBooks.addAll(bookTitles);
        for (String book : treeBooks) {
            System.out.println(book);
        }

        System.out.println("Set iteration:");
        for (String book : bookTitles) {
            System.out.println(book);
        }

        System.out.println("---------");
        System.out.println(bookTitles);
        System.out.println(anotherBooks);

        System.out.println("Removing specific book:");
        bookTitles.remove("Java Programming");
        System.out.println(bookTitles);

        System.out.println("Set size:");
        int size = bookTitles.size();
        System.out.println("Number of unique books: " + size);

        System.out.println("Clearing set:");
        bookTitles.clear();
        System.out.println(bookTitles);
    }
}
