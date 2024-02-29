class Jugador {
    var nombre: String = ""
    var eleccion = 0 //la variable eleccion se puede crear aqui o abajo
    //var marcador = 0

    constructor(nombre:String){
        this.nombre = nombre
    }

    fun elegir():Int{ //es lo qe devuelve el metodo
        println("Dame 1-piedra, 2-papel, 3-tijera")
        var eleccion = readln().toInt()
        return eleccion
    }
}