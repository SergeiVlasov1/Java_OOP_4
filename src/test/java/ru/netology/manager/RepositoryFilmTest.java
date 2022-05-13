package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterFilm;
import ru.netology.manager.PosterFilmManager;
import ru.netology.repository.RepositoryFilms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RepositoryFilmTest {

    private RepositoryFilms repository = new RepositoryFilms();
    private PosterFilmManager manager = new PosterFilmManager(repository);

    @Test
    void save() {
        PosterFilm first = new PosterFilm(1, 1, " Bloodshot ", "horror", 600);
        PosterFilm second = new PosterFilm(2, 2, "Forward", "cartoon", 350);
        PosterFilm third = new PosterFilm(3, 3, "Hotel Belgrade", "comedy", 500);
        PosterFilm fourth = new PosterFilm(4, 4, "Gentlemen", "action movie", 500);
        PosterFilm fifth = new PosterFilm(5, 5, "Invisible Man", "horror", 350);
        PosterFilm sixth = new PosterFilm(6, 6, "Trolls. World tour", "cartoon", 500);
        PosterFilm seventh = new PosterFilm(7, 7, "Number one", "comedy", 300);
        PosterFilm eighth = new PosterFilm(8, 8, "lion king", "cartoon", 250);
        PosterFilm ninth = new PosterFilm(9, 9, "Batman", "drama", 500);
        PosterFilm tenth = new PosterFilm(10, 10, "Scream", "mystery", 300);
        PosterFilm eleventh = new PosterFilm(11, 11, "Havoc", "thriller", 300);

        PosterFilmManager managers = new PosterFilmManager();
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


        PosterFilm[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        PosterFilm[] actual = repository.save();

        assertArrayEquals(expected, actual);
    }

}