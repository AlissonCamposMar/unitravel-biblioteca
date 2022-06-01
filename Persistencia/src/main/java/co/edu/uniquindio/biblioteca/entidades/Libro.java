package co.edu.uniquindio.biblioteca.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro implements Serializable {

    @Id
    @Column(length = 10)
    @EqualsAndHashCode.Include
    private String isbn;

    private String nombre;

    private int unidades;

    private short anio;

}
