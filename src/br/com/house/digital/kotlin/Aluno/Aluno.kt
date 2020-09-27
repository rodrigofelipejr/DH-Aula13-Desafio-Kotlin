package br.com.house.digital.kotlin.Aluno

import br.com.house.digital.kotlin.Interfaes.IPessoa

class Aluno(
        override val codigo: Int,
        override var nome: String,
        override var sobrenome: String
) : IPessoa {

    override fun equals(codigo: Any?): Boolean {
        return (this.codigo == codigo)
    }
}