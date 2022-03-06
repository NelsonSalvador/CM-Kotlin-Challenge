package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.sql.Date
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


fun main() {
    val formatter = DateTimeFormatter.ofPattern("dd MM yyyy")
    val text: String = LocalDate.now().format(formatter)
    val dataDeNascimento = LocalDate.parse(text, formatter)

    val cal = Calendar.getInstance()
    cal[Calendar.YEAR] = 1988
    cal[Calendar.MONTH] = Calendar.NOVEMBER
    cal[Calendar.DAY_OF_MONTH] = 1
    val pessoa: Pessoa = Pessoa("Rodrigo", cal.time)
    //pessoa.tirarCarta()
    print(text)
    print(pessoa)
}

