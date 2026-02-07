
import java.util.ArrayList;
import java.util.List;

public class TopTrendingMovies {

    static class Movie{
        String name;
        double rating;
        int year;

        Movie(String name,double rating,int year){
            this.name = name;
            this.rating = rating;
            this.year = year;
        }
    }

    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Movie A",8.5,2023));
        list.add(new Movie("Movie B",7.2,2022));
        list.add(new Movie("Movie C",9.0,2024));
        list.add(new Movie("Movie D",6.9,2021));
        list.add(new Movie("Movie E",8.8,2024));
        list.add(new Movie("Movie F",7.5,2023));
        list.add(new Movie("Movie G",8.0,2022));

        list.stream()
        .filter(m -> m.rating >= 7.0)
        .sorted((m1,m2)->{
            if(m2.rating > m1.rating){
                return 1;
            }else if(m2.rating < m1.rating){
                return -1;
            }else{
                return m2.year - m1.year;
            }
        })
        .limit(5)
        .forEach(m ->
            System.out.println(m.name+" | "+m.rating+" | "+m.year)
        );
    }
}
