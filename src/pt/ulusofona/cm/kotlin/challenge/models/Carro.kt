package pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Carro(private val _identificador: String, val motor: Motor): Veiculo(_identificador), Movimentavel, Ligavel {
    override val identificador get() = _identificador
    override fun requerCarta(): Boolean {
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
        posicao.x = x
        posicao.y = y
    }

    override fun ligar() {
        TODO("Not yet implemented")
        motor.ligado = true
    }

    override fun desligar() {
        TODO("Not yet implemented")
        motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
        return motor.ligado
    }
}