package io.github.com.cleanarchworkshop.controller;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final Map<Integer, Todo> db;

    private final AtomicInteger counter;

    public TodoController()  {
        db = new ConcurrentHashMap<>();
        counter = new AtomicInteger(1);
    }

    @PostMapping
    public ResponseEntity<?> createTodo(@RequestBody CreateTodo body) {
        final var id = counter.getAndIncrement();
        final var todo = new Todo(id, body.content());
        db.put(id, todo);
        return ResponseEntity.status(201).body(todo);
    }


    @GetMapping
    public ResponseEntity<?> listTodos() {
        final var todos = db.values();
        return ResponseEntity.ok(todos);
    }
}
