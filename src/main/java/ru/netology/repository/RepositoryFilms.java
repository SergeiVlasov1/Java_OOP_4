package ru.netology.repository;

import ru.netology.domain.PosterFilm;

public class RepositoryFilms {
    private PosterFilm[] films = new PosterFilm[0];

    public PosterFilm[] findAll() {
        return films;
    }

    public void save(PosterFilm film) {
        int length = films.length + 1;
        PosterFilm[] tmp = new PosterFilm[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public PosterFilm[] findById(int id) {
        for (PosterFilm film : films) {
            if (film.getId() == id) {
                return films;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        PosterFilm[] tmp = new PosterFilm[length];
        int index = 0;
        for (PosterFilm film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    public void removeAll(int id) {
        int length = 0;
        PosterFilm[] tmp = new PosterFilm[length];
        int index = 0;
        films = tmp;
    }
}


