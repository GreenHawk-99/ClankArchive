package com.project.clankarchive.models.repositories;

import com.project.clankarchive.models.entities.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Long> {
}
