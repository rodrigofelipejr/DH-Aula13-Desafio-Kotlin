package br.com.house.digital.kotlin

import br.com.house.digital.kotlin.DigitalHouseManager.DigitalHouseManager

fun main() {
    val DH = DigitalHouseManager()

    with(DH) {
        matricularAluno(21, "Ferrán", "Torres")
        matricularAluno(17, "Kevin", "De Bruyne")
        matricularAluno(10, "Sergio", "Agüero")
        matricularAluno(6, "Nathan", "Aké")
        matricularAluno(16, "Rodri", "Hernández")
        matricularAluno(50, "Eric", "García")

        registrarCurso(20001, "Full Stack", 3)
        registrarCurso(20002, "Android", 2)

        registrarProfessorTitular(1, "Josep", "Guardiola", "PHP")
        registrarProfessorTitular(2, "Brendan", "Rodgers", "CSS")

        registrarProfessorAdjunto(3, "Jürgen", "Klopp", 15)
        registrarProfessorAdjunto(4, "Marcelo", "Bielsa", 30)

        alocarProfessores(20001, 1, 3)
        alocarProfessores(20002, 2, 4)

        matricularAluno(21, 20001)
        matricularAluno(17, 20001)

        matricularAluno(10, 20002)
        matricularAluno(6, 20002)
        matricularAluno(16, 20002)

        consultarMatriculas(50)
        consultarMatriculas(17)
    }
}