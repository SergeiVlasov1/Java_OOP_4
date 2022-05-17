package ru.netology.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import ru.netology.domain.PosterFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepositoryFilmTest {

    private RepositoryFilms repository = new RepositoryFilms();
    private PosterFilm first = new PosterFilm(1, 1, " Bloodshot ", "horror", 600);
    private PosterFilm second = new PosterFilm(2, 2, "Forward", "cartoon", 350);
    private PosterFilm third = new PosterFilm(3, 3, "Hotel Belgrade", "comedy", 500);
    private PosterFilm fourth = new PosterFilm(4, 4, "Gentlemen", "action movie", 500);
    private PosterFilm fifth = new PosterFilm(5, 5, "Invisible Man", "horror", 350);
    private PosterFilm sixth = new PosterFilm(6, 6, "Trolls. World tour", "cartoon", 500);
    private PosterFilm seventh = new PosterFilm(7, 7, "Number one", "comedy", 300);
    private PosterFilm eighth = new PosterFilm(8, 8, "lion king", "cartoon", 250);
    private PosterFilm ninth = new PosterFilm(9, 9, "Batman", "drama", 500);
    private PosterFilm tenth = new PosterFilm(10, 10, "Scream", "mystery", 300);
    private PosterFilm eleventh = new PosterFilm(11, 11, "Havoc", "thriller", 300);


    @Test
    public void shouldFindAllFilms() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        PosterFilm[] expected = new PosterFilm[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        PosterFilm[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSaveFilms() {
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        PosterFilm[] expected = new PosterFilm[]{seventh, eighth, ninth, tenth, eleventh};
        PosterFilm[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindIfFilmsExists() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        repository.findById(4);
        PosterFilm expected = fourth;
        PosterFilm actual = repository.findById(4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNullIfFilmsNotExists() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        repository.findById(12);
        PosterFilm expected = null;
        PosterFilm actual = repository.findById(12);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyIfNoFilms() {

        PosterFilm[] expected = new PosterFilm[]{};
        PosterFilm[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveIfExists() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        repository.removeById(4);
        PosterFilm[] expected = new PosterFilm[]{first, second, third, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        PosterFilm[] actual = repository.findAll();
        assertArrayEquals(expected, actual);

    }
    @Disabled
    @Test
    public void shouldNotRemoveIfNotExists() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        repository.removeById(12);
        PosterFilm[] expected = new PosterFilm[]{first, second, third, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        PosterFilm[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);

        repository.removeAll();
        PosterFilm[] expected = new PosterFilm[]{};
        PosterFilm[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}

