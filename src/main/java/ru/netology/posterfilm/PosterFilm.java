package ru.netology.posterfilm;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class PosterFilm {
    public int id;
    private int productId;
    private String filmName;
    private String filmGenre;
    private int ticketPrice;


    public PosterFilm(int id, int productId, String filmName, String filmGenre, int ticketPrice) {
        this.id = id;
        this.productId = productId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.ticketPrice = ticketPrice;
    }
}
