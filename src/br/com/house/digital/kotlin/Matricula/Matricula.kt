package br.com.house.digital.kotlin.Matricula

import br.com.house.digital.kotlin.Aluno.Aluno
import br.com.house.digital.kotlin.Curso.Curso
import java.util.*

data class Matricula(val aluno: Aluno, val curso: Curso) {
    private lateinit var dataMatricula: Date

    init {
        dataMatricula = Date()
    }
}