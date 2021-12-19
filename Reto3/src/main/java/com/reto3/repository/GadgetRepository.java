package com.reto3.repository;

import com.reto3.repository.crud.GadgetCrudInterface;
import com.reto3.model.Gadget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GadgetRepository {
    @Autowired
    private GadgetCrudInterface gadgetCrudRepository;

    public List<Gadget> getAll() {
        return gadgetCrudRepository.findAll();
    }

    public Optional<Gadget> getClothe(Integer id) {
        return gadgetCrudRepository.findById(id);
    }

    public Gadget create(Gadget gadget) {
        return gadgetCrudRepository.save(gadget);
    }

    public void update(Gadget gadget) {
        gadgetCrudRepository.save(gadget);
    }

    public void delete(Gadget gadget) {
        gadgetCrudRepository.delete(gadget);
    }
}
