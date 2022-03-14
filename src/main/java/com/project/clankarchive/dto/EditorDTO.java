package com.project.clankarchive.dto;

import com.project.clankarchive.model.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class EditorDTO {
    private Long idEditor;
    private String editorName;
    private String editorImage;

    private Game game;
}
