package com.example.note.Contrloler;

import com.example.note.Model.Note;
import com.example.note.Model.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RepositoryRestController
public class NoteControler {

    private static final Logger logger = LoggerFactory.getLogger(NoteControler.class);
    private NoteRepository repository = null;

    public NoteControler(NoteRepository repository) {
        this.repository = repository;
    }
    @GetMapping(path="/notes", params = {"!sort", "!page","!size"})
    ResponseEntity<?> readAllNote(){
        logger.warn("Test loggera");
        return ResponseEntity.ok(repository.findAll());
    };

    @GetMapping(path ="/notes")
    ResponseEntity<?> readAllNote(Pageable page){
        logger.warn("Test loggera 2");
        return ResponseEntity.ok(repository.findAll(page));
    }

}
