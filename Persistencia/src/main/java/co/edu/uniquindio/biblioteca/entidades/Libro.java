package co.edu.uniquindio.biblioteca.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro implements Serializable {

    @Id
    @Column(length = 13)
    @EqualsAndHashCode.Include
    private String isbn;

    @Column(length = 200, nullable = false)
    private String nombre;

    @PositiveOrZero
    @Column(nullable = false)
    private int unidades;

    @Max(9999)
    @Column(nullable = false)
    private short anio;

}
