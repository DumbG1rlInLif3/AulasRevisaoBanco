package entidades

import java.math.BigDecimal

class Servico(

    val profissional : Profissional,
    val instalacao: String,
    val preco: BigDecimal,
    val descricao: String,
    val tipo : String,
    val contato: Long,
    val endereco: String,
    val equipamentos: String,
    val dataAgendamento : Int,
    val codigoServico : Int,
    val empresa : String,
)

{

}