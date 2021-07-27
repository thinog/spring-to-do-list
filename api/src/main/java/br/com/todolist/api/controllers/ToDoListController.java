package br.com.todolist.api.controllers;

import br.com.todolist.api.commons.ApiResponse;
import br.com.todolist.api.dtos.ItemInputDto;
import br.com.todolist.api.dtos.ToDoItemDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "todo", produces = "application/json", consumes = "application/json")
public class ToDoListController {
    @GetMapping("health")
    public Object getHealth() {
        return new Object() {
            public final String status = "everything is working :)";
        };
    }

    @PostMapping
    public ApiResponse<Boolean> createItem(@RequestBody ItemInputDto item) {
        return null;
    }

    @GetMapping
    public ApiResponse<List<ToDoItemDto>> getToDoList(
        @RequestParam(value = "active", required = false, defaultValue = "true") Boolean active,
        @RequestParam(value = "completed", required = false, defaultValue = "false") Boolean completed
    ) {
        return null;
    }

    @PutMapping("{id}")
    public ApiResponse<Object> updateItem(@PathVariable("id") Long id, @RequestBody ItemInputDto item) {
        return null;
    }

    @DeleteMapping("{id}")
    public ApiResponse<Object> deleteItem(@PathVariable("id") Long id) {
        return null;
    }
}
