public class Book implements Comparable<Book>{
    private String name;
    private int ageRecomendation;

    public Book(String name,int age){
        this.name = name;
        this.ageRecomendation = age;
    }
    public String getBook(){
        return this.name;
    }
    public int getAge(){
        return this.ageRecomendation;
    }
    public String toString(){
        return getBook()+"(recommended for "+getAge()+" year-olds or older)";
    }
    public int compareTo(Book book){
        if(this.ageRecomendation == book.getAge()){
            return this.getBook().compareTo(book.getBook());
        } return this.getAge()-book.getAge();
    }


}
