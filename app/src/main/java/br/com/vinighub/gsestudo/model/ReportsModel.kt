package carreiras.com.github.listadecompras.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Uma classe de modelo que representa um report dos dados da bitcoin.
 * Esta classe é uma entidade do Room, o que significa que ela representa uma tabela no banco de dados.
 * A classe é uma data class do Kotlin, o que significa que ela tem métodos equals(), hashCode() e toString() gerados automaticamente.
 *
 * @property id A chave primária da tabela. Cada item na tabela terá um ID único.
 * @property value O preço do item
 *
 *
 * @author Vinicius Rodrigues da Silva
 * @version 1.0
 * @since 2024-11-20
 */
@Entity // Anotação que indica que esta classe é uma entidade, ou seja, uma tabela no banco de dados.
data class ReportsModel(

    /**
     * A chave primária da tabela. Cada item na tabela terá um ID único.
     * A anotação @PrimaryKey indica que este campo é a chave primária da tabela.
     * A propriedade autoGenerate é definida como true, o que significa que o Room irá gerar automaticamente um valor único para cada novo item.
     */
    @PrimaryKey(autoGenerate = true)    // Anotação que indica que este campo é a chave primária da tabela.
    val id: Int = 0,    // O valor padrão é 0, mas será substituído pelo valor gerado automaticamente pelo Room.

    /**
     * O preço do item em formato de String.
     * Este campo é obrigatório e não pode ser nulo.
     */
    val value: String,


    /**
     * A data do item em formato de String.
     * Este campo é obrigatório e não pode ser nulo.
     * A data é formatada como "dd/MM/yyyy".
     * Exemplo: "20/11/2024"
     */
    val date: String

)