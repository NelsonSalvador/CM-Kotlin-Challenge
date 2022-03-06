package pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(private val _identificador: String):Veiculo(_identificador), Movimentavel {

    override val identificador get() = _identificador

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
        posicao.x = x
        posicao.y = y
    }
}