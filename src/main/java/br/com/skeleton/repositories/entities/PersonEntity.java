package br.com.skeleton.repositories.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "TB_PERSON")
@GenericGenerator(
        name = "SEQ_PERSON",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
                @Parameter(name = "sequence_name", value = "SEQ_PERSON"),
                @Parameter(name = "initial_value", value = "1"),
                @Parameter(name = "increment_size", value = "1")
        }
)
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARGOS")
    @Column(name = "ID_PERSON")
    private Long id;

    @Column(name = "DS_NOME")
    private String name;

    @Column(name = "DT_NACIMENTO")
    private Long birthday;
}
