package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        //Encender la tv

        redRemote.turnOn();
        System.out.println("La television está encendida: " + redRemote.turnOn());
        blackRemote.turnOn();
        System.out.println("La television está encendida: " + blackRemote.turnOn());

        //Subir un canal
        redRemote.channelUp();
        System.out.println("El nuevo canal es: " + redRemote.channel);
        blackRemote.channelUp();
        System.out.println("El nuevo canal es: " + blackRemote.channel);

        //Bajar un canal
        redRemote.channelDown();
        System.out.println("El nuevo canal es: " + redRemote.channel);
        blackRemote.channelDown();
        System.out.println("El nuevo canal es: " + blackRemote.channel);


        //Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede

        System.out.println("intentar bajar un canal y comprobar que no se puede");
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        System.out.println("intentar bajar un canal y comprobar que no se puede");
        blackRemote.channelDown();
        System.out.println(blackRemote.channel);

        //Subir el volumen
        redRemote.volumeUp();
        System.out.println("El nuevo volumen es: "+ redRemote.volume);
        blackRemote.volumeUp();
        System.out.println("El nuevo volumen es: "+ blackRemote.volume);

        //Bajar el volumen
        redRemote.volumeDown();
        System.out.println("El nuevo volumen es: "+ redRemote.volume);
        blackRemote.volumeDown();
        System.out.println("El nuevo volumen es: "+ blackRemote.volume);

        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede

        redRemote.volume = 0;
        blackRemote.volume =0;

        System.out.println("intentar bajar el volumen y comprobar que no se puede");
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        System.out.println("intentar bajar el volumen y comprobar que no se puede");
        blackRemote.volumeDown();
        System.out.println(blackRemote.volume);


        //Obtener el color del mando a distancia y mostrarlo por pantalla

        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Apagar la TV
        redRemote.turnOff();
        blackRemote.turnOff();
    }

}