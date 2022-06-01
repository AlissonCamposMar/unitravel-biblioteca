package co.edu.uniquindio.biblioteca.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Prestamo implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(nullable = false)
    private LocalDateTime fechaPrestamo;

    @Future
    @Column(nullable = false)
    private LocalDate fechaDevolucion;
}
