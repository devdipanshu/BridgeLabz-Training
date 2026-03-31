import java.util.*;
import java.util.stream.*;

class Book{
    String genre;
    int pages;
    Book(String genre,int pages){
        this.genre=genre;
        this.pages=pages;
    }
}

public class LibraryBookStatistics{
    public static void main(String[] args){
        List<Book> books=new ArrayList<>();
        books.add(new Book("Fiction",300));
        books.add(new Book("Fiction",500));
        books.add(new Book("Science",400));
        books.add(new Book("Science",600));

        Map<String,IntSummaryStatistics> stats=
            books.stream()
            .collect(Collectors.groupingBy(
                b->b.genre,
                Collectors.summarizingInt(b->b.pages)
            ));

        stats.forEach((k,v)->{
            System.out.println(k+" Total:"+v.getSum()+" Avg:"+v.getAverage()+" Max:"+v.getMax());
        });
    }
}
