# java-basico
classDiagram
    class iPhone {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --|> AparelhoTelefonico : herda
    iPhone --|> ReprodutorMusical : herda
    iPhone --|> NavegadorInternet : herda
