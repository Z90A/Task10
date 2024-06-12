package task10;//package task10

import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.concurrent.ThreadLocalRandom;

public class AudioBookApp {//public class Audio Book App
    private List<AudioBook> bookList;//private list / sets book list

    public List<AudioBook> getBookList() {//gets audio book from book list
        return bookList;//returns data called from book list
    }

    public AudioBookApp(String filename) throws IOException {//throws filename 
        bookList = new LinkedList<>();//creates a new linked list in book list
        readData(filename);//reads the filename in the new list above
    }

    public void readData(String filename) throws IOException {//throws read data from the filename
        Path path = Paths.get(filename);//gets the filename from path
        List<String> lines = Files.readAllLines(path);//reads the lines in the file path
        for (String line : lines) {//for statement
            String[] objItem = line.split(",");//checks between lines
            String name = objItem[0];
            int year = Integer.parseInt(objItem[1]);//spaces the data out
            double length = Double.parseDouble(objItem[2]);
            bookList.add(new AudioBook(name, year, length));//adds data into book list
        }
    }

    public AudioBook getShortestBook() {//gets shortest book from audio book
        double length = bookList.get(0).getLength();//calculates the length of each book
        AudioBook shortestBook = bookList.get(0);//starts off by 0
        for (AudioBook book : bookList) {//for statement
            if (length > book.getLength()) {//if statement / gets book length
                shortestBook = book;//calls shortest book
            }
        }
        return shortestBook;//returns shortest book
    }

    public int countBooks() {//count books class
        int count = 0;//count class begins with 0 as it is an int
        for (AudioBook book : bookList) {//for statement
            if (book.getYear() > 2010 && book.getYear() < 2020) {//if statement 
                count ++;//counts go up
            }
        }
        return count;//returns count statement
    }

    public void randomBookList() {//random book list class

        List<AudioBook> b1;//book 1
        b1 = new LinkedList<>();//new book
        List<AudioBook> b2;//book 2
        b2 = new LinkedList<>();//new book
        List<AudioBook> b3;//book 3
        b3 = new LinkedList<>();//new book

        for (AudioBook book : bookList) {//for statement
            int randomInt = ThreadLocalRandom.current().nextInt(1,3);//random int
            if (randomInt == 1) {//if statement
                b1.add(book);
            } else if (randomInt == 2) {//if-else statement
                b2.add(book);//adds book 2
            } else {
                b3.add(book);
            }
        }

        System.out.println("Books in list #1: " + b1.size());//prints books in list 1
        for (AudioBook book : b1) {
            book.displayInfo();
        }
        System.out.println("Books in list #2: " + b2.size());//prints books in list 2
        for (AudioBook book : b2) {
            book.displayInfo();
        }
        System.out.println("Books in list #3: " + b3.size());//prints books in list 3
        for (AudioBook book : b3) {
            book.displayInfo();
        }
    }
}
