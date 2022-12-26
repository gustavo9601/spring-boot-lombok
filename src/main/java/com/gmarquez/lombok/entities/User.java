package com.gmarquez.lombok.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true) // Heredara el equals() y hashCode() de la clase padre
public class User extends Parent{
}

@Data
class Parent{
    private String name;
}
