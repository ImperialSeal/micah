package org.ncblazers.micah;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    
    @GetMapping
    public Person get(){
        Person newbie = new Person();
        newbie.setFirstName("Micah");
        newbie.setLastName("Edwards");
        newbie.setFavoriteMovie("Top Gun");
        newbie.setFavoriteSong("Gratitude");
        newbie.setFavoriteBibleVerse("Ephesians 2:8-9");
        return newbie;
    }

@GetMapping("/{id}")
public Person getById(@PathVariable String id){
    System.out.println("Looking for person "+id);
    Person newbie = new Person();
    newbie.setFirstName("Micah2");
    newbie.setLastName("Edwards2");
    newbie.setFavoriteMovie("Top Gun2");
    newbie.setFavoriteSong("Gratitude2");
    newbie.setFavoriteBibleVerse("Ephesians 2:8-92");
    return newbie;
}

}
