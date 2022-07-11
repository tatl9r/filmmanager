import ru.netology.domain.FilmManager;
import ru.netology.domain.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTests {
    Film first = new Film("Knockin' On Heaven's Door", "Comedy", 1);
    Film second = new Film("Memoirs of a Geisha", "Drama", 2);
    Film third = new Film("Snatch", "Criminal", 3);
    Film fourth = new Film("Sherlock", "Detective", 4);
    Film fifth = new Film("The Green Mile", "Drama", 5);
    Film sixth = new Film("The Green Mile", "Drama", 6);
    Film seventh = new Film("The Green Mile", "Fantasy", 7);
    Film eighth = new Film("Harry Potter and the Goblet of Fire", "Fantasy", 8);
    Film ninth = new Film ("Legally Blonde", "Melodrama", 9);
    Film tenth = new Film("The Big Lebowski", "Comedy", 10);

@Test
    public void addFilms() {
        FilmManager films = new FilmManager();
        films.add(first);
        films.add(second);
        films.add(third);
        Film[] actual = films.findAll();
        Film[] expected = {first, second, third};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAll() {
        FilmManager films = new FilmManager();
        films.add(first);
        films.add(second);
        films.add(third);
        films.add(fourth);
        films.add(fifth);
        films.add(sixth);
        films.add(seventh);
        films.add(eighth);
        films.add(ninth);
        films.add(tenth);

        films.findLast();

        Film[] actual = films.findLast();
        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void findAllWithLimit() {
        FilmManager films = new FilmManager(3);
        films.add(first);
        films.add(second);
        films.add(third);
        films.add(fourth);
        films.add(fifth);
        films.add(sixth);
        films.add(seventh);
        films.add(eighth);
        films.add(ninth);
        films.add(tenth);

        films.findLast();

        Film[] actual = films.findLast();
        Film[] expected = {tenth, ninth, eighth};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void findAllUnderLimit() {
        FilmManager films = new FilmManager(5);
        films.add(first);
        films.add(second);
        films.add(third);

        films.findLast();

        Film[] actual = films.findLast();
        Film[] expected = {third, second, first};

        Assertions.assertArrayEquals(actual, expected);


    }
}
