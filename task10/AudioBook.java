package task10;//package task10

public class AudioBook extends Book {//the public class Audio Book extends the book class
    private double length;//private double length

    // superclass constructor
    public AudioBook(String name, int year, double length) {//puts all of the types together
        super(name, year);//superclass
        setLength(length);//sets length
    }

    private void setLength(double length) {//start of the getters/setters
        this.length = length;//sets length
    }

    public double getLength() {//gets length
        return length;//returns the length after it gets it
    }

    public void displayInfo() {//displays info in format below
        System.out.println(getName() + " " + getYear() + " "+ length);
    }
}
