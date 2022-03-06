package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(private val _identificador: String): Veiculo(_identificador), Movimentavel {

    override val identificador get() = _identificador
    override fun requerCarta(): Boolean {
        return false
    }
    override fun moverPara(x: Int, y: Int) {
        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }
        posicao.x = x
        posicao.y = y
    }

    override fun toString(): String{
        return "Carro | $identificador | $dataDeAquisicao | $posicao"
    }
}