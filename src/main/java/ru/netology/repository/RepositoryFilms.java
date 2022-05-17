package ru.netology.repository;

import ru.netology.domain.PosterFilm;

public class RepositoryFilms {
    private PosterFilm[] films = new PosterFilm[0];
        private int limit = 10;

    public RepositoryFilms() {
    }


    public RepositoryFilms(int limit) {
        this.limit = limit;
    }

    public void addSave(PosterFilm film) {
        int length = films.length + 1;
        PosterFilm[] tmp = new PosterFilm[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public PosterFilm[] findAll() {
        return films;
    }

    public PosterFilm findById(int id) {
        for (PosterFilm film : films) {
            if (film.getId() == id) {
                return film;
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
            films = tmp;
        }
    }

    public void removeAll() {
        films = new PosterFilm[0];
    }
}


