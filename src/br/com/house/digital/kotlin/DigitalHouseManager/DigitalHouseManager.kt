package br.com.house.digital.kotlin.DigitalHouseManager

import br.com.house.digital.kotlin.Aluno.Aluno
import br.com.house.digital.kotlin.Curso.Curso
import br.com.house.digital.kotlin.Interfaes.IProfessor
import br.com.house.digital.kotlin.Matricula.Matricula
import br.com.house.digital.kotlin.Professor.ProfessorAdjunto
import br.com.house.digital.kotlin.Professor.ProfessorTitular

class DigitalHouseManager() {
    private val alunos: MutableSet<Aluno> = mutableSetOf()
    private val professores: MutableSet<IProfessor> = mutableSetOf()
    private val cursos: MutableSet<Curso> = mutableSetOf()
    private val matriculas: MutableSet<Matricula> = mutableSetOf()

    fun registrarCurso(codigoCurso: Int, nome: String, quantidadeMaximaAlunos: Int) {
        val curso = Curso(codigoCurso, nome, null, null, quantidadeMaximaAlunos, null)
        cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        cursos.removeIf { it.codigo == codigoCurso }
    }

    fun registrarProfessorAdjunto(codigoProfessor: Int, nome: String, sobrenome: String, quantidadeHoras: Int) {
        val professor = ProfessorAdjunto(codigoProfessor, nome, sobrenome, 0, quantidadeHoras)
        professores.add(professor)
    }

    fun registrarProfessorTitular(codigoProfessor: Int, nome: String, sobrenome: String, especialidade: String) {
        val professor = ProfessorTitular(codigoProfessor, nome, sobrenome, 0, especialidade)
        professores.add(professor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        professores.removeIf { it.codigo == codigoProfessor }
    }

    fun matricularAluno(codigoAluno: Int, nome: String, sobrenome: String) {
        val aluno = Aluno(codigoAluno, nome, sobrenome)
        alunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = cursos.find { it.equals(codigoCurso) }

        if (curso == null) {
            println("Não encontrado curso com o código $codigoCurso")
            return
        }

        val aluno = alunos.find { it.equals(codigoAluno) }

        if (aluno == null) {
            println("Não encontrado aluno com o código $codigoAluno")
            return
        }

        if (!curso.adicionarAluno(aluno)) {
            println("O curso ${curso.nome} não possui vagas disponíveis (max. ${curso.quantidadeMaximaAlunos})")
            return
        }

        val matricula = Matricula(aluno, curso)

        matriculas!!.add(matricula)
        println("O aluno ${aluno.nome} foi matriculado no curso de ${curso.nome} com sucesso!")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val curso = cursos.find { it.equals(codigoCurso) }

        if (curso == null) {
            println("Não encontrado curso com o código $codigoCurso")
            return
        }

        val professorTitular = professores.find { it.equals(codigoProfessorTitular) }

        if (professorTitular == null) {
            println("Não encontrado professor titular com o código $codigoProfessorTitular")
            return
        }

        val professorAdjunto = professores.find { it.equals(codigoProfessorAdjunto) }

        if (professorAdjunto == null) {
            println("Não encontrado professor adjunto com o código $codigoProfessorAdjunto")
            return
        }

        curso.professorTitular = professorTitular as ProfessorTitular
        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto

        println("Professores T:${professorTitular.nome} e A: ${professorAdjunto.nome} foram alocados ao curso ${curso.nome} com sucesso!")
    }
}