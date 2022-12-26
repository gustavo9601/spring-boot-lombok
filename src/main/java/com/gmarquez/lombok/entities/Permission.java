package com.gmarquez.lombok.entities;

import lombok.Value;

// Suele usarse para crear objetos que solo se definen al crearlo y no se modifican
@Value // Genera el constructor con todos los parámetros, los métodos getter, equals() y hashCode() y deja la clase FINAL
public class Permission {
    private Long id;
    private String name;
    private String description;
}

