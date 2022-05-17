package ru.netology.manager;

import ru.netology.domain.PosterFilm;
import ru.netology.repository.RepositoryFilms;

public class PosterFilmManager {
    private RepositoryFilms repository;
    private PosterFilm[] films = new PosterFilm[0];
    private int limit = 10;

    public PosterFilmManager() {
    }


    public PosterFilmManager(int limit) {
        this.limit = limit;
    }

    public PosterFilmManager(RepositoryFilms repository) {
        this.repository = repository;
    }

    public PosterFilm[] findAll() {
        repository.findAll();
        return films;

    }

    public void addSave(PosterFilm film) {
        repository.addSave(film);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void findById(int id) {
        repository.findById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

    public PosterFilm[] getAll() {
        PosterFilm[] films = repository.findAll();
        int resultLength = limit;
        if (films.length < resultLength)
            resultLength = films.length;
        PosterFilm[] result = new PosterFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public PosterFilm[] findLast() {
        int resultLength = films.length;
        if (resultLength > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }


        PosterFilm[] result = new PosterFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
