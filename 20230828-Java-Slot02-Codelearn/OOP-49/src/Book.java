public class Book {
    private String name;
    private double price;
    private Author[] authors;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length - 1; i++) {
            authorNames += authors[i].getName() + ", ";
        }
        authorNames += authors[authors.length - 1].getName();
        return authorNames;
    }
}