package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open class Veiculo(private val _identificador: String): Movimentavel {

    var posicao: Posicao = Posicao()
    var dataDeAquisicao: Date = Date()

    open val identificador get() = _identificador

    open fun requerCarta(): Boolean{
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }
        posicao.x = x
        posicao.y = y
    }
    override fun toString(): String{
        return "Veiculo | $identificador"
    }

}