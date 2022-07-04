package com.example.note.Contrloler;

import com.example.note.Model.Note;
import com.example.note.Model.SqlNoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteControler {

    private static final Logger logger = LoggerFactory.getLogger(NoteControler.class);
    private SqlNoteRepository repository = null;

    public NoteControler(SqlNoteRepository repository) {
        this.repository = repository;
    }
    @GetMapping(path="/notes", params = {"!sort", "!page","!size"})
    ResponseEntity<List<Note>> readAllNote(){
        logger.warn("Test loggera");
        return ResponseEntity.ok(repository.findAll());
    };

    @GetMapping(path ="/notes")
    ResponseEntity<?> readAllNote(Pageable page){
        logger.warn("Test loggera 2");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }

}
