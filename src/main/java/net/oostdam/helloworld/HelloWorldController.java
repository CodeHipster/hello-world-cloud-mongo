package net.oostdam.helloworld;

import net.oostdam.helloworld.persistence.MongoThingRepository;
import net.oostdam.helloworld.persistence.Thing;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController()
public class HelloWorldController {

    MongoThingRepository repository;

    public HelloWorldController(MongoThingRepository repo){
        this.repository = repo;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/thing", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Thing> getThings(){
        Collection<Thing> collection = new ArrayList<>();
        repository.findAll().forEach(collection::add);
        return collection;
    }

    @GetMapping(path = "/thing/new", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Thing> newThing(){
        repository.save(new Thing("new", "thing"));
        Collection<Thing> collection = new ArrayList<>();
        repository.findAll().forEach(collection::add);
        return collection;
    }
}
