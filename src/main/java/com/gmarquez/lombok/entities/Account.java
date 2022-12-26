package com.gmarquez.lombok.entities;

import lombok.*;

/*
* @Data:
*   @ToString,  // Genera el método toString()
*   @EqualsAndHashCode,  // Genera el método equals() y hashCode()
*   @Getter, // Genera los métodos getter
*   @Setter,  // Genera los métodos setter
*   @RequiredArgsConstructor // Genera el constructor con los parámetros requeridos
* */
@NoArgsConstructor // Genera el constructor sin parámetros
@AllArgsConstructor // Genera el constructor con todos los parámetros
@Data
public class Account {

    private String id;

    @NonNull // No permitira que sea null
    private String nombre;

    @EqualsAndHashCode.Exclude // Excluye el campo de equals() y hashCode()
    @ToString.Exclude // Excluye el campo del método toString()
    private String password;

}
