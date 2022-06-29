package com.example.note.Contrloler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class NoteControler {

    Logger logger = LoggerFactory.getLogger(NoteControler.class);
    private final NoteControler noteControler;

    public NoteControler(NoteControler noteControler) {
        this.noteControler = noteControler;
    }
}
