package br.com.todolist.api.dtos;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class ItemInputDto {
    private @NonNull String input;
}
