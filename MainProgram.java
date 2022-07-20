
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String 
        List<Book> library = new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            //scanner.hasNextLine()
            String nameOfBook = scanner.nextLine();
            if(nameOfBook.isEmpty()){
                break;
            }
            System.out.println("Input the age recomendation:");
            int ageRecomendation = Integer.valueOf(scanner.nextLine());
            library.add(new Book(nameOfBook, ageRecomendation));
            
            //Book newBook = new Book(nameO, age)

        }
        /*Comparator<Book> basedOnAgeAndName = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getBook);
        Collections.sort(library,basedOnAgeAndName);*/
        System.out.println("");
        System.out.println(library.size()+" books in total.\n\nBooks:");
        library.stream()
        //    .sorted((p1,p2)->{return p1.getAge()-p2.getAge();})
            .sorted()
            .forEach(s->System.out.println(s));


    }

}
