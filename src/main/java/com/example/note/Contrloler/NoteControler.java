package com.example.note.Contrloler;

import com.example.note.Model.Note;
import com.example.note.Model.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RepositoryRestController
public class NoteControler {

    private static final Logger logger = LoggerFactory.getLogger(NoteControler.class);
    private final NoteRepository repository;

    public NoteControler(NoteRepository repository) {
        this.repository = repository;
    }
    @GetMapping(path="/notes")
    ResponseEntity<?> readAllNote(){
        logger.warn("Test loggera");
        return ResponseEntity.ok(repository.findAll());
    };

}
