package com.example.guiaejercicios

class Dado {

    var numero:Int? = null
        get() = field
        set(value) {
            if (value != null) {
                if(value <= 0 || value >= 7){
                    field = 1
                }else{
                    field = value
                }
            }
        }

    fun LanzarDado(){
        if(numero == null){
            var numeroAleatorio = (1..6).random()
            println("El numero del dado es: $numeroAleatorio")
        }else{
            println("El numero del dado es: $numero")
        }
    }
}