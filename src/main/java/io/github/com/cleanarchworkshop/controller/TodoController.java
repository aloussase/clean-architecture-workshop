package io.github.com.cleanarchworkshop.controller;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final Map<Integer, Todo> db;

    public TodoController()  {
        db = new HashMap<>();
    }

    @PostMapping
    public ResponseEntity<?> createTodo() {
        return null;
    }


    @GetMapping
    public ResponseEntity<?> listTodos() {
        return null;
    }
}
