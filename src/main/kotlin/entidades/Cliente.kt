package entidades

import enumeradores.Material
import enumeradores.Setor

class Cliente(

    nome : String,
    contato : Long,
    cpf : Long,
    endereco : String,
    sexo : String,
    val pedidos : Array<String>,
    habilidade : String,
    setor : Setor,
    material : Material,
    conta : Conta,


    ) : Pessoa(nome = nome,
    contato = contato,
    cpf = cpf,
    endereco = endereco,
    sexo = sexo,
    habilidade = habilidade,
    setor = setor,
    material = material,
    conta = conta)







//Usando a herença, combina os atributos sem precisar repeti-los,
//abrindo o construtor da classe MÃE para FILHO.