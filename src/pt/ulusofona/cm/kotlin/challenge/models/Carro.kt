package pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Carro(private val _identificador: String, val motor: Motor): Veiculo(_identificador), Movimentavel, Ligavel {
    override val identificador get() = _identificador
    override fun requerCarta(): Boolean {
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }
        posicao.x = x
        posicao.y = y
    }

    override fun ligar() {

        if(motor.ligado) throw VeiculoDesligadoException()

        motor.ligado = true
    }

    override fun desligar() {

        if(!motor.ligado) throw VeiculoDesligadoException()

        motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        return motor.ligado
    }

    override fun toString(): String{
        return "Carro | $identificador | $dataDeAquisicao | $posicao"
    }
}