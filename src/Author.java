public class Author {
    private final String firstName;
    private final String lastName;
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName (){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return firstName.equals(firstName) && lastName.equals(lastName);
    }
    public int hashCode (){
        return java.util.Objects.hash(firstName, lastName);
    }
    public String toString(){
        return firstName + " " + lastName;
    }

}
