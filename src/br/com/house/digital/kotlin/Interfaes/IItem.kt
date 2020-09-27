package br.com.house.digital.kotlin.Interfaes

interface IItem {
    val codigo: Int
    var nome: String

    override fun equals(codigo: Any?): Boolean
}