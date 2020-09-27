package br.com.house.digital.kotlin.Utils

import java.text.SimpleDateFormat
import java.util.*

fun Date.dateToString(): String {
    val format = SimpleDateFormat("dd/MM/yyyy")
    return format.format(this)
}
