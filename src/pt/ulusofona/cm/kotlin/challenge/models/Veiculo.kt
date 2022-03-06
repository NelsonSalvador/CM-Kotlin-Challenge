package pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*
import kotlin.collections.*

open class Veiculo(private val _identificador: String): Movimentavel {

    var posicao: Posicao = Posicao()
    var dataDeAquisicao: Date = Date()

    open val identificador get() = _identificador

    open fun requerCarta(): Boolean{
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
        posicao.x = x
        posicao.y = y
    }

}