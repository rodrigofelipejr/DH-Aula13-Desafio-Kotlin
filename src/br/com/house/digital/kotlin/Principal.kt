package br.com.house.digital.kotlin

import br.com.house.digital.kotlin.Aluno.Aluno
import br.com.house.digital.kotlin.Curso.Curso
import br.com.house.digital.kotlin.DigitalHouseManager.DigitalHouseManager
import br.com.house.digital.kotlin.Professor.ProfessorAdjunto
import br.com.house.digital.kotlin.Professor.ProfessorTitular

fun main() {
    val DH = DigitalHouseManager()

    with(DH) {
        matricularAluno(1, "Aluno1", "Carvalho")
        matricularAluno(2, "Aluno2", "Felipe")
        matricularAluno(3, "Aluno3", "Lemos")
        matricularAluno(4, "Aluno4", "Oliveira")
        matricularAluno(5, "Aluno5", "Carlos")

        registrarCurso(20001, "Full Stack", 3)
        registrarCurso(20002, "Android", 2)

        registrarProfessorTitular(1, "Tiago", "Ramos", "PHP")
        registrarProfessorTitular(2, "Tales", "Ramos", "CSS")

        registrarProfessorAdjunto(3, "Adriano", "Silva", 15)
        registrarProfessorAdjunto(4, "Antonio", "Silva", 30)

        alocarProfessores(20001, 1, 3)
        alocarProfessores(20002, 2, 4)

        matricularAluno(1, 20001)
        matricularAluno(2, 20001)

        matricularAluno(3, 20002)
        matricularAluno(4, 20002)
        matricularAluno(5, 20002)
    }


}