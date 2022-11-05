public class Book {
    private final String title;
    private final Author author;
    private int year;
    public Book (String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle (){
        return title;
    }
    public Author getAuthor (){
        return author;
    }
    public int getYear (){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year && title.equals(title) && author.equals(author);
    }
    public int hashCode(){
        return java.util.Objects.hash(title, author, year);
    }

    public String toString (){
        return "Название: " + title + ", автор: " + author.toString() + ", год издания: " + year;
    }


}
