# Ejercicios Barcos Examen DAW
Este ejercicio consiste en mostrar los mensajes de alarma y socorro de las clases Crucero, Pesquero y Portaaviones.
## Clase Barco
Clase abstracta de la cual heredan las clases Crucero, Pesquero y Portaaviones. Contiene los métodos alrama que muestra un mensaje por pantalla y mensajeSocorro que muestra por pantalla "S.O.S". Éstos métodos serán sobreescritos en cada una de sus clases hijas mostrando además que tipo de barco emite esos mensajes.
## Clase Crucero 
La clase crucero tiene los atributos eslora y camasOcupadas, que muestran respectivamente los metros de eslora del barco y la cantidad de camas que están ocupadas.
También tiene dos constructores, uno vacío y otro al que le pasan los valores por parámetro, además de los métodos getters y setters, el método toString y los métodos alarma y mensajeSocorro.
## Clase Pesqeuro 
La clase Pesquero tiene los atributos eslora, potencia y numeroPescadores, que muestran respectivamente los metros de eslora del barco, la potencia del motor del barco y el número de pescadores que lleva.
También tiene dos constructores, uno vacío y otro al que le pasan los valores por parámetro, además de los métodos getters y setters, el método toString y los métodos alarma y mensajeSocorro.
## Clase Portaaviones
La clase crucero tiene los atributos numAviones y numMarineros, que muestran respectivamente el número de aviones que transporta y el número de marineros que lleva.
También tiene dos constructores, uno vacío y otro al que le pasan los valores por parámetro, además de los métodos getters y setters, el método toString y los métodos alarma y mensajeSocorro.
## Clase Principal
Creo un objeto para cada clase (Crucero, Pesquero y Portaaviones) y muestra los métodos alarma y mensajeSocorro de cada uno de ellos.