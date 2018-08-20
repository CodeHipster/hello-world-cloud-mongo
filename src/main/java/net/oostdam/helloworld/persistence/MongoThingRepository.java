package net.oostdam.helloworld.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoThingRepository extends MongoRepository<Thing, String> {
}