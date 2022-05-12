package ru.netology.posterfilm;

public class PosterFilmManager {
    private PosterFilm[] films = new PosterFilm[0];
    private int limit = 10;

    public PosterFilmManager() {
    }


    public PosterFilmManager(int limit) {
        this.limit = limit;
    }


    public PosterFilm[] getAddFilm() {
        return this.films;
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
