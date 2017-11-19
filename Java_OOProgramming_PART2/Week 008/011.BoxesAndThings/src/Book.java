public class Book implements ToBeStored{

    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public double weight(){
        return weight;
    }

    public String getWriter(){
        return writer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getWriter() + ": " + getName();
    }
}
