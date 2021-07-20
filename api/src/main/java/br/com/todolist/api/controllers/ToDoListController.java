package br.com.todolist.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "todo", produces = "application/json", consumes = "application/json")
public class ToDoListController {
    @GetMapping("health")
    public Object getHealth() {
        return new Object() {
            public final String status = "everything is working :)";
        };
    }
}
