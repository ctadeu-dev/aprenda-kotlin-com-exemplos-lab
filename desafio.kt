// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val numInscricao: Int, val nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {

        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)

    }

    fun listarMatriculas() {

        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        println("*".repeat(80))
        println("RELATÓRIO DA FORMAÇÃO: ${nome}")
        println(" ".repeat(5) + "Conteúdo Programático: ")
        for (conteudo: ConteudoEducacional in conteudos) println(" ".repeat(10) + "Formação: ${conteudo.nome}  - Duração: ${conteudo.duracao}")

        println("")
        println(" ".repeat(5) + "Quantidade de alunos matriculados no curso: ${inscritos.size}")

        println("")
        println(" ".repeat(5) + "Alunos matriculados no curso: ")
        for (usuario: Usuario in inscritos) println(" ".repeat(10) + "Nome: ${usuario.nome}  Inscrição: ${usuario.numInscricao}  Nível: ${usuario.nivel}")
        println("")
        println("")

    }

}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    // Definição do conteúdo Educacional para Formação FrontEnd
    val conteudoEducDevFrontAng = ConteudoEducacional("Angular JS", 90)
    val conteudoEducDevFrontNod = ConteudoEducacional("Node JS", 90)
    val conteudoEducDevFrontHtm = ConteudoEducacional("HTML 5")
    val conteudoEducDevFrontCss = ConteudoEducacional("CSS 3")

    // Definição do conteúdo Educacional para Formação BackEnd
    val conteudoEducDevBackKot = ConteudoEducacional("Kotlin", 90)
    val conteudoEducDevBackJav = ConteudoEducacional("Java", 90)
    val conteudoEducDevBackSql = ConteudoEducacional("SQL", 40)
    val conteudoEducDevBackNSq = ConteudoEducacional("NoSQL", 30)

    // Definição do conteúdo Educacional para Formação em Data Science
    val conteudoEducScienceSql = ConteudoEducacional("SQL", 40)
    val conteudoEducScienceNSq = ConteudoEducacional("NoSQL", 30)
    val conteudoEducSciencePBi = ConteudoEducacional("Power BI", 30)
    val conteudoEducSciencePyt = ConteudoEducacional("Python")

    // Definição das formações disponíveis
    val devFrontFormation    = Formacao("Formação Front End DIO", listOf(conteudoEducDevFrontAng, conteudoEducDevFrontNod, conteudoEducDevFrontHtm, conteudoEducDevFrontCss))
    val devBackFormation     = Formacao("Formação Back End DIO", listOf(conteudoEducDevBackKot, conteudoEducDevBackJav, conteudoEducDevBackSql, conteudoEducDevBackNSq))
    val dataScienceFormation = Formacao("Formação Data Science DIO", listOf(conteudoEducScienceSql, conteudoEducScienceNSq, conteudoEducSciencePBi, conteudoEducSciencePyt))

    println("Hello, you are welcome at DIO!!!")

    // Controlador de matriculas
    var id: Int = 0;

    // Identificando os alunos
    val aluno1 = Usuario("Antônio", ++id, Nivel.BASICO)
    val aluno2 = Usuario("João", ++id, Nivel.INTERMEDIARIO)
    val aluno3 = Usuario("Benedito", ++id, Nivel.BASICO)
    val aluno4 = Usuario("Luiz", ++id, Nivel.BASICO)
    val aluno5 = Usuario("Mateus", ++id, Nivel.BASICO)
    val aluno6 = Usuario("Diego", ++id, Nivel.DIFICIL)
    val aluno7 = Usuario("Lucas", ++id, Nivel.DIFICIL)
    val aluno8 = Usuario("José", ++id, Nivel.BASICO)
    val aluno9 = Usuario("Pedro", ++id, Nivel.INTERMEDIARIO)

    // Realizando a matricula dos alunos no curso de Desenvolvedor FrontEnd
    devFrontFormation.matricular(aluno1)
    devFrontFormation.matricular(aluno2)

    // Realizando a matricula dos alunos no curso de Desenvolvedor BackEnd
    devBackFormation.matricular(aluno3)
    devBackFormation.matricular(aluno5)
    devBackFormation.matricular(aluno6)
    devBackFormation.matricular(aluno8)
    devBackFormation.matricular(aluno9)

    // Realizando a matricula dos alunos no curso de Cientista de Dados
    dataScienceFormation.matricular(aluno4)
    dataScienceFormation.matricular(aluno7)

    // Exibindo relatório dos alunos matriculados no curso de Desenvolvedor FrontEnd
    devFrontFormation.listarMatriculas()

    // Exibindo relatório dos alunos matriculados no curso de Desenvolvedor BackEnd
    devBackFormation.listarMatriculas()

    // Exibindo relatório dos alunos matriculados no curso de Cientista de Dados
    dataScienceFormation.listarMatriculas()

}
/*
RESULTADO DA EXECUÇÃO:

Hello, you are welcome at DIO!!!
********************************************************************************
RELATÓRIO DA FORMAÇÃO: Formação Front End DIO
     Conteúdo Programático:
          Formação: Angular JS  - Duração: 90
          Formação: Node JS  - Duração: 90
          Formação: HTML 5  - Duração: 60
          Formação: CSS 3  - Duração: 60

     Quantidade de alunos matriculados no curso: 2

     Alunos matriculados no curso:
          Nome: Antônio  Inscrição: 1  Nível: BASICO
          Nome: João  Inscrição: 2  Nível: INTERMEDIARIO


********************************************************************************
RELATÓRIO DA FORMAÇÃO: Formação Back End DIO
     Conteúdo Programático:
          Formação: Kotlin  - Duração: 90
          Formação: Java  - Duração: 90
          Formação: SQL  - Duração: 40
          Formação: NoSQL  - Duração: 30

     Quantidade de alunos matriculados no curso: 5

     Alunos matriculados no curso:
          Nome: Benedito  Inscrição: 3  Nível: BASICO
          Nome: Mateus  Inscrição: 5  Nível: BASICO
          Nome: Diego  Inscrição: 6  Nível: DIFICIL
          Nome: José  Inscrição: 8  Nível: BASICO
          Nome: Pedro  Inscrição: 9  Nível: INTERMEDIARIO


********************************************************************************
RELATÓRIO DA FORMAÇÃO: Formação Data Science DIO
     Conteúdo Programático:
          Formação: SQL  - Duração: 40
          Formação: NoSQL  - Duração: 30
          Formação: Power BI  - Duração: 30
          Formação: Python  - Duração: 60

     Quantidade de alunos matriculados no curso: 2

     Alunos matriculados no curso:
          Nome: Luiz  Inscrição: 4  Nível: BASICO
          Nome: Lucas  Inscrição: 7  Nível: DIFICIL

 */