public class Main {
    public static void main (String[] args) {
        Author ivanov = new Author("Ivanov", "Ivan");
        Book nature = new Book("Nature", ivanov,  2020);
        Author petrov = new Author("Petrov", "Petr");
        Book world = new Book("World", petrov, 2018);
        nature.setYear(2015);





    }
}