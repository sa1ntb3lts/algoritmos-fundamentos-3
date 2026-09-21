public class TorresDeHanoi {
    public static void main(String[] args) {
        int discos = 5;

        System.out.println("Movimientos para " + discos + " discos:");
        hanoi(discos, "A", "B", "C");
    }

    public static void hanoi(int discos, String origen, String auxiliar, String destino) {

        // Caso base:
        // Si solo hay un disco, se mueve directamente de origen a destino.
        if (discos == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);

        } else {
            /*
            Paso 1:
            Mover los discos superiores desde la torre origen
            hasta la torre auxiliar.
            */
            hanoi(discos - 1, origen, destino, auxiliar);

            /*
            Paso 2:
            Mover el disco mas grande que queda en la torre origen
            hacia la torre destino.
            */
            System.out.println("Mover disco " + discos + " de " + origen + " a " + destino);

            /*
            Paso 3:
            Mover los discos que estaban en la torre auxiliar
            hacia la torre destino.
            */
            hanoi(discos - 1, auxiliar, origen, destino);
        }
    }
}

/*
Torres de Hanoi

El programa mueve una cantidad de discos desde la torre A hasta la torre C.
La torre B se utiliza como auxiliar.

Para resolver el problema con varios discos se hacen tres pasos:

1. Se mueven los discos superiores a la torre auxiliar.
2. Se mueve el disco mas grande a la torre destino.
3. Se mueven los discos superiores desde la torre auxiliar hasta el destino.

El caso base ocurre cuando solamente hay un disco.
En ese caso, ya no se necesita llamar otra vez al metodo:
el disco se puede mover directamente de una torre a otra.

Con 3 discos, la salida sera:

Mover disco 1 de A a C
Mover disco 2 de A a B
Mover disco 1 de C a B
Mover disco 3 de A a C
Mover disco 1 de B a A
Mover disco 2 de B a C
Mover disco 1 de A a C
*/