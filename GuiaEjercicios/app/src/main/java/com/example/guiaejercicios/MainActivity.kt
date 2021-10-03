package com.example.guiaejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejercicio1()
        ejercicio2(3,10)

        //ejercicio 3
        var empleado = Empleado()
        empleado.sueldo = 200
        empleado.nombre = "Roberto"
        empleado.tiempo = 20
        empleado.cargo = "Administrador"
        empleado.area = "Administracion"
        empleado.Datos()

        //ejercicio 4
        println("Numero del dado:")
        var dado = Dado()
        dado.numero = 3
        dado.LanzarDado()
        println("Dado random:")
        var dadorandom = Dado()
        dadorandom.LanzarDado()
    }

    fun ejercicio1(){
        val trabajador = Trabajador("Roberto",10.00, 8,10)
        val valorHorasExtra: Int= (2*trabajador.horasExtra)
        var sueldo = trabajador.pagoHora*(trabajador.horasTrabajadas+valorHorasExtra)
        var totalHorasTrabajadas : Int = (trabajador.horasTrabajadas+trabajador.horasExtra)
        println("El nombre del empleado es: "+trabajador.nombre+", "+"Su sueldo es de: $ $sueldo"+
        ","+"Total de horas trabajadas: $totalHorasTrabajadas")
    }

    fun ejercicio2(Tabla:Int, Limite:Int? = null){
        var Final = 10
        if (Limite != null) {
            Final = Limite
        }
        for (num in 1..Final) {
            var resultado = num*Tabla
            println("$Tabla X $num = $resultado")
        }
    }

}