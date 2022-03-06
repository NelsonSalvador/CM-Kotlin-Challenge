package pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*
import kotlin.collections.*

open class Veiculo(val identificador: String): Movimentavel {
    //val identificador get() = _identificador
    var posicao: Posicao = Posicao()


}