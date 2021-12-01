package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void MovieManagerNonEmptyWithSetup() {

        MovieManager manager = new MovieManager();

        MovieItem first = new MovieItem(11, "Master and Margaret", 150, 8);
        MovieItem second = new MovieItem(26, "Brigada", 180, 9);
        MovieItem third = new MovieItem(23, "Maski Show", 195, 10);
        MovieItem fourth = new MovieItem(33, "Railway Station for two", 220, 8);
        MovieItem fifth = new MovieItem(34, "Dog Barbos and Unusual Cross", 200, 10);
        MovieItem sixth = new MovieItem(36, "Avengers", 210, 9);
        MovieItem seventh = new MovieItem(43, "The Adventure of Doctor Aybolit", 190, 8);
        MovieItem eighth = new MovieItem(37, "Operation Y and other Shurik's adventures", 175, 9);
        MovieItem ninth = new MovieItem(15, "Home Alone", 190, 10);
        MovieItem tenth = new MovieItem(87, "Caucasian Hostage girl", 200, 10);



        manager.save(first);
        manager.save(second);
        manager.save(third);









    }


}



