package com.project.clankarchive.models.repositories;

import com.project.clankarchive.models.entities.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Long>{
}
