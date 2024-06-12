package task10;//package task10

public class Book {//public class book
    private String name;//private string name
    private int year;//private int year

    public Book(String name, int year) {//puts both together then sets them both
        setName(name);//sets name
        setYear(year);//sets year
    }

    private void setName(String name) {//sets name
        this.name = name;//sets
    }

    private void setYear(int year) {//sets int year
        this.year = year;//sets
    }

    public String getName() {//getters /gets name
        return name;//returns name
    }

    public int getYear() {//gets year
        return year;//returns year
    }
}
