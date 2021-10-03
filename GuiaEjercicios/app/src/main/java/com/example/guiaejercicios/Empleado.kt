package com.example.guiaejercicios

class Empleado()
{
    var sueldo = 0
        get() = field
        set(value) {
            if(value<0){
                println("No pueden haber cantidades negativas")
            }else{
                field = value
            }
        }

    var nombre:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("El nombre no puede estar vacio")
            }
            else if(value!!.isEmpty()) {
                println("No hay caracteres")
            }else{
                field = value
            }
        }
    var area:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("El area no puede estar vacia")
            }
            else if(value!!.isEmpty()) {
                println("No hay caracteres")
            }else{
                field = value
            }
        }

    var cargo:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("El cargo no puede estar vacio")
            }
            else if(value!!.isEmpty()) {
                println("No hay caracteres")
            }else{
                field = value
            }
        }

    var tiempo:Int = 0
        get() = field
        set(value) {

            field = value
        }

    public fun verificacion(): Int {
        return (tiempo.div(5))
    }

    public fun Datos(){
        if( nombre == null ||  cargo == null ||  area == null){
            println("Faltan datos en los campos")
        }else{
            var sueldoextra = 20 * verificacion()
            var sueldototal = sueldo + sueldoextra
            println("Empleado: $nombre, area de trabajo: $area, cargo: $cargo, sueldo: $sueldo, " +
                    "tiempo trabajado: $tiempo, remuneracion por horas extra: $sueldoextra, " +
                    "sueldo final: $sueldototal")
        }
    }

}