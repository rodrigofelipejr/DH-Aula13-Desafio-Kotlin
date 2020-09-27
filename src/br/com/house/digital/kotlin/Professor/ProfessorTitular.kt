package br.com.house.digital.kotlin.Professor

import br.com.house.digital.kotlin.Interfaes.IProfessor

class ProfessorTitular(
        override val codigo: Int,
        override var nome: String,
        override var sobrenome: String,
        override var tempoCasa: Int,
        var especialidade: String
) : IProfessor {

    override fun equals(codigo: Any?): Boolean {
        return (this.codigo == codigo)
    }
}