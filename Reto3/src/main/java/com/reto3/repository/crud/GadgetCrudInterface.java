package com.reto3.repository.crud;

import com.reto3.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetCrudInterface extends MongoRepository<Gadget, Integer> {

}
