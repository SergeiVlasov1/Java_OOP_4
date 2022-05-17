package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterFilm;
import ru.netology.manager.PosterFilmManager;
import ru.netology.repository.RepositoryFilms;
import static org.junit.jupiter.api.Assertions.*;

class PosterFilmManagerTest {

    @Test
    void addSave() {
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
        managers.addSave(first);
        managers.addSave(second);
        managers.addSave(third);
        managers.addSave(fourth);
        managers.addSave(fifth);
        managers.addSave(sixth);
        managers.addSave(seventh);
        managers.addSave(eighth);
        managers.addSave(ninth);
        managers.addSave(tenth);
        managers.addSave(eleventh);


        PosterFilm[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        PosterFilm[] actual = managers.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
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

        PosterFilm[] expected = {};
        PosterFilm[] actual = managers.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast1() {
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
        managers.addSave(sixth);
        managers.addSave(seventh);
        managers.addSave(eighth);
        managers.addSave(ninth);
        managers.addSave(tenth);

        PosterFilm[] expected = {tenth, ninth, eighth, seventh, sixth};
        PosterFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast2() {
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
        managers.addSave(first);
        managers.addSave(second);
        managers.addSave(third);
        managers.addSave(fourth);

        PosterFilm[] expected = {fourth, third, second, first};
        PosterFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }


}