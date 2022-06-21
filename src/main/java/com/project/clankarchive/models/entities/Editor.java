package com.project.clankarchive.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Editor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEditor;
    private String editorName;
    private String editorImage;

    @ManyToOne
    private Game game;

    public Editor(String editorName, String editorImage) {
        this.editorName = editorName;
        this.editorImage = editorImage;
    }
}
