package com.example.note;

import org.hibernate.annotations.GeneratorType;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(name = "NOTE")
public class note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String note;

    public note(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
