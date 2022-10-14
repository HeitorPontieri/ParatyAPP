package jandira.sp.senai.br.turismo.dao

import android.content.Context
import jandira.sp.senai.br.turismo.R
import jandira.sp.senai.br.turismo.model.PontoTuristico

class PontosTuristicosDAO() {

    //tudo que esta dentro do metodo companio é estatico
    companion object {

        fun getPontosTuristicos(context: Context): List<PontoTuristico>{

            val pt1 = PontoTuristico()

            pt1.codigo = 1
            pt1.nomePontoTuristico = "Praia do Sono"
            pt1.descricao = "Você já ouviu falar na Praia do Sono? Ela fica entre Ubatuba (SP) e Paraty (RJ), pertinho de Trindade. Ela é acessível somente por trilha ou barco.Por isso, a Praia do Sono é praticamente deserta, sendo um destino ideal para fugir de aglomerações e, é claro, ter muito contato com o silêncio e a natureza!"
            pt1.imagem = context.getDrawable(R.drawable.praia_sono)

            val pt2 = PontoTuristico()

            pt2.codigo = 2
            pt2.nomePontoTuristico = "Saco da Mamanguá"
            pt2.descricao = "No sudoeste do Rio de Janeiro, no município de Paraty, é onde encontramos o único fiorde tropical do mundo: o Saco de Mamanguá. Considerado como tal por não estar cercado de montanhas nevadas, como os encontrados ao norte do planeta, mas sim, da incrível biodiversidade da Mata Atlântica.O mar esverdeado invade o continente por 8km. O Saco do Mamanguá banha uma enorme reserva ambiental que só pode ser acessada por trilhas ou embarcações sem motor. A região protegida conta ainda com 10 rios, 30 praias e dezenas de cachoeiras escondidas entre as matas."
            pt2.imagem = context.getDrawable(R.drawable.saco_mamangua)

            val pt3 = PontoTuristico()

            pt3.codigo = 3
            pt3.nomePontoTuristico = "Centro Histórico de Paraty"
            pt3.descricao = "O Centro Histórico de Paraty remonta aos idos de 1820, quando suas ruas já possuíam seu calçamento “pé de moleque”. A presença das águas, com a invasão das marés na lua cheia, a cultura do café e da cana, o porto e seus piratas, a maçonaria determinaram o traçado do Centro Histórico de Paraty."
            pt3.imagem = context.getDrawable(R.drawable.centro_historico)

            val pt4 = PontoTuristico()

            pt4.codigo = 4
            pt4.nomePontoTuristico = "Paraty-mirim"
            pt4.descricao = "Parati Mirim (ou Paraty-Mirim) é uma enseada cercada de muito verde, que fica dentro de uma área protegida pelo Parque Estadual de Paraty-Mirim. Na paisagem se destaca a simpática igrejinha de Nossa Senhora da Conceição. Suas águas são tranquilas e cristalinas, com praia de areia branca e fina. Não existe estrutura para visitantes, como restaurantes e banheiros."
            pt4.imagem = context.getDrawable(R.drawable.paraty_mirim)

            val pt5 = PontoTuristico()

            pt5.codigo = 5
            pt5.nomePontoTuristico = "Trindade"
            pt5.descricao = "Trindade é uma enseada paradisíaca localizada a 27 km de Paraty, com 4 praias oceânicas e 1 piscina natural no meio do mar.É uma vila de pescadores no passado era um reduto hippie e só se chegava ao local por trilhas ou de barco."
            pt5.imagem = context.getDrawable(R.drawable.trindade)

            val pontosTuristicos = listOf<PontoTuristico>(pt1, pt2, pt3, pt4, pt5)


            return pontosTuristicos

        }
    }
}