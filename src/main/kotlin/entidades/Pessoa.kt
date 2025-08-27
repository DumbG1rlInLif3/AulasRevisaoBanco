package entidades

import enumeradores.Material
import enumeradores.Setor
import java.math.BigDecimal

open class Pessoa(
    val nome: String,
    val cpf: Long,
    val contato: Long,
    val sexo: String,
    val endereco: String,
    val habilidade: String,
    val setor : Setor,
    val material : Material,
    val conta : Conta,
) {
    // comportamentos do cliente

    open fun receberConta (conta : Conta, aReceber : BigDecimal){
        conta.saldo = conta.saldo.add(aReceber)

    }
}