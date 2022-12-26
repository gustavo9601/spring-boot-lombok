package com.gmarquez.lombok.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Role {

    private String id;
    @NonNull
    private String name;

    @Singular // Permite agregar elementos a la lista, uno a uno .permission("permiso1").permission("permiso2")
    private List<String> permissions;

    @Builder.Default // Especifica el Valor por defecto
    private LocalDateTime createdAt = LocalDateTime.now();
}
