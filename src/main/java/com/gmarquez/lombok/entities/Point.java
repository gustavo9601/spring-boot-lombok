package com.gmarquez.lombok.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
public class Point {
    private Integer x;
    @With // Genera un metodo con el mismo nombre que el atributo, pero con el prefijo "with" y retorna un NUEVO Objeto
    private Integer y;
}
