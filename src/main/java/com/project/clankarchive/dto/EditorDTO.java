package com.project.clankarchive.dto;

import com.project.clankarchive.models.entities.Game;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditorDTO {
    private Long idEditor;
    private String editorName;
    private String editorImage;

    private Game game;
}
