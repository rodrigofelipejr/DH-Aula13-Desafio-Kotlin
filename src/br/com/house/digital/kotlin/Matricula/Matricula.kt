package br.com.house.digital.kotlin.Matricula

import br.com.house.digital.kotlin.Aluno.Aluno
import br.com.house.digital.kotlin.Curso.Curso
import java.util.*

data class Matricula(val aluno: Aluno, val curso: Curso) {
    var dataMatricula: Date
        private set

    init {
        dataMatricula = Date()
    }
}