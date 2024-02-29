class Arbitro {
    var jugador = 0
    var ordenador = 0

    fun ganador(j:Jugador,o:Ordenador){
        var tiradaJugador = j.elegir()
        var tiradaOrdenador = o.elegir()
        if ((tiradaJugador == 1) && (tiradaOrdenador == 3)){ //hacer todas las posibilidades de juego
            println("ha ganado el humano...")
            jugador ++
        }else{
            println("ha ganado el ordenador...")
            ordenador ++
        }
    }fun hayGanador():Boolean{
        return (jugador == 3 || ordenador == 3)
    }
    fun resumen(){
        println("Marcador")
        println("Humano: ${this.jugador}")
        println("Ordenador: $ordenador")
    }

}