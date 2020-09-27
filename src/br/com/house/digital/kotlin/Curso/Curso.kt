package br.com.house.digital.kotlin.Curso

import br.com.house.digital.kotlin.Aluno.Aluno
import br.com.house.digital.kotlin.Interfaes.IItem
import br.com.house.digital.kotlin.Professor.ProfessorAdjunto
import br.com.house.digital.kotlin.Professor.ProfessorTitular

class Curso(
        override val codigo: Int,
        override var nome: String,
        var quantidadeMaximaAlunos: Int,
) : IItem {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    var alunos: MutableSet<Aluno>? = null

    override fun equals(codigo: Any?): Boolean {
        return (this.codigo == codigo)
    }

    fun adicionarAluno(aluno: Aluno): Boolean {
        return when (verificaDisponibilidadeVaga()) {
            false -> false
            else -> {
                alunos?.add(aluno)
                true
            }
        }
    }

    fun excluirAluno(aluno: Aluno) {
        alunos?.removeIf { it.equals(aluno) }
    }

    private fun verificaDisponibilidadeVaga(): Boolean {
        val vagasPreenchidas = alunos?.count()
        return when (vagasPreenchidas) {
            null -> true
            else -> (vagasPreenchidas + 1) <= quantidadeMaximaAlunos
        }
    }
}