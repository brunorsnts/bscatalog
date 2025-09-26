package com.santos.bscatalog.dto;

import com.santos.bscatalog.entities.Category;

import java.io.Serializable;

public record CategoryDto(Long id, String name) implements Serializable {
    private static final long serialVersionUID = 1L;
}
