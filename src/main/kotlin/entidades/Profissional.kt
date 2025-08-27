package entidades

import enumeradores.Material
import enumeradores.Setor
import java.math.BigDecimal

class Profissional(

    nome : String,
    contato : Long,
    val funcao: String,
    val experiencia : String,
    val idade : Int,
    val salario : Double,
    sexo : String,
    cpf : Long,
    val id : Int,
    endereco : String,
    habilidade : String,
    setor : Setor,
    material : Material,
    conta : Conta,

    ) : Pessoa(nome = nome,
    cpf = cpf,
    contato = contato,
    endereco = endereco,
    sexo = sexo,
    habilidade = habilidade,
    setor = setor,
    material = material,
    conta = conta)

{
    //comportamentos do Profissional
    //
    fun instalarCaixaDAgua(clt: Profissional){
        if (clt.setor.equals(Setor.ADMINISTRACAO)){
            println("Profissional habilitado")
        } else {
            println("Profissional desqualificado")
        }
    }

    //o <Polimorfismo> nada mais é do que fazer uma SOBRESCRITA do método que está na superclasse.
    override fun receberConta (conta : Conta, aPagar : BigDecimal){
        conta.saldo = conta.saldo.subtract(aPagar)

    }
}
