package ru.netology.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.PosterFilm;
import ru.netology.manager.PosterFilmManager;
import ru.netology.repository.RepositoryFilms;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MockitoTest {
    @Mock
    private RepositoryFilms repository = Mockito.mock(RepositoryFilms.class);

    @InjectMocks
    private PosterFilmManager manager = new PosterFilmManager(repository);
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


    @BeforeEach
    public void setUp() {
        manager = new PosterFilmManager(repository);

    }

    @Test
    public void shouldAddMovies() {
        manager.addSave(first);
        manager.addSave(second);
        manager.addSave(third);
        manager.addSave(fourth);
        manager.addSave(fifth);
        manager.addSave(sixth);
        manager.addSave(seventh);
        manager.addSave(eighth);
        manager.addSave(ninth);
        manager.addSave(tenth);

        PosterFilm[] returned = new PosterFilm[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        doReturn(returned).when(repository).findAll();

        PosterFilm[] expected = new PosterFilm[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        PosterFilm[] actual = manager.getAll();
        assertArrayEquals(expected, actual);

        verify(repository).findAll();

    }

    @Test
    public void shouldShowZeroMovies() {
        PosterFilm[] returned = new PosterFilm[]{};
        doReturn(returned).when(repository).findAll();

        PosterFilm[] expected = new PosterFilm[]{};
        PosterFilm[] actual = manager.getAll();
        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    public void shouldShowOneMovie() {
        PosterFilm[] returned = new PosterFilm[]{tenth};
        doReturn(returned).when(repository).findAll();

        PosterFilm[] expected = new PosterFilm[]{tenth};
        PosterFilm[] actual = manager.getAll();
        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

}



