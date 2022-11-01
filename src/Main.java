public class Main {
    public static void main (String[] args) {
        Author ivanov = new Author("Ivanov", "Ivan");
        Author ivanov1 = new Author("Ivanov", "Ivan");
        Book nature = new Book("Nature", ivanov,  2020);
        Book nature1 = new Book("Nature", ivanov,  2020);
        Author petrov = new Author("Petrov", "Petr");
        Book world = new Book("World", petrov, 2018);
        nature.setYear(2015);
        System.out.println(nature.equals(nature1));
        System.out.println(ivanov);
        System.out.println(nature);
    }
}