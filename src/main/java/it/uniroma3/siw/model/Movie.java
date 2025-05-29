package it.uniroma3.siw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Integer year;
    private String urlImage;

    // seguono metodi setter e getter
    // seguono metodi equals e hashCode:
    //         due oggetti Movie sono uguali se hanno 
    //         stesso titolo e stesso anno

}
