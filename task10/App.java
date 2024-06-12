package task10;//package task10

import java.io.IOException;//import statement

public class App {//public class App
    public static void main(String[] args) {
        String txtfile = "data/data2.txt";//imports data text file
        try {
            AudioBookApp app = new AudioBookApp(txtfile);//new Book App
            AudioBook shortest = app.getShortestBook();//gets the shortest book
            if(shortest != null) {//if statement
                System.out.println("Shortest book:");//prints the shortest book
                shortest.displayInfo();//displays info
            }

            System.out.printf("Books published btw 2010-2020: %d\n", app.countBooks());//prints time frame books were published in
            app.randomBookList();//gets random book from book list

            }catch(IOException ioe) {//catches IOException
                System.out.printf("Perhaps missing text file: %s/%s? \n\n",//prints error message if file not found
                new App().getClass().getPackage().getName(), txtfile);
            }
        }
}
