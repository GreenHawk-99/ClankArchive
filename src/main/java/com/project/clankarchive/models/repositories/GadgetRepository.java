package com.project.clankarchive.models.repositories;

import com.project.clankarchive.models.entities.Gadget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GadgetRepository extends JpaRepository<Gadget, Long> {
}
