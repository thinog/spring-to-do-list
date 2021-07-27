package br.com.todolist.api.dtos;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ToDoItemDto {
    private @NonNull long id;
    private @NonNull String input;
    private Boolean completed;
    private Date createdAt;
    private Date completedAt;
}
