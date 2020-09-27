package br.com.house.digital.kotlin.Professor

import br.com.house.digital.kotlin.Interfaes.IProfessor

class ProfessorAdjunto(
        override val codigo: Int,
        override var nome: String,
        override var sobrenome: String,
        override var tempoCasa: Int,
        var quantidadeHorasMonitoria: Int
) : IProfessor {

    init {
        tempoCasa = 0
    }

    override fun equals(codigo: Any?): Boolean {
        return (this.codigo == codigo)
    }
}