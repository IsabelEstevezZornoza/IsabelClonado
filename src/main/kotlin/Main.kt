fun main(args: Array<String>) {
    var humano = Jugador("Pepe")
    var ordenador = Ordenador("Deep Blue")
    var arbitro = Arbitro()

    do{
        arbitro.ganador(humano, ordenador)
    }while(!arbitro.hayGanador()) //! es para negarlo y decir que es false
    arbitro.resumen()
}