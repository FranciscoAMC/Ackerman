import java.util.*;

public class Ackerman {

    public static int valorX;
    public static int valorY;
    public static String variable;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de X: ");
        valorX = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el valor de Y: ");
        valorY = Integer.parseInt(sc.nextLine());
        System.out.println(Ack.salida(valorX,valorY) + " = " + recursion(valorX,valorY)); 
        sc.close();
    }

    public static String recursion(int x, int y) {
        if (x == 0) {
            //System.out.println(Ack.salida(valorX,valorY) + " = " + Ack.CR2(x, String.valueOf(y+1)));
            return String.valueOf(y + 1);
        } else if (y == 0) {
            variable = Ack.salida(x-1, 1);
            System.out.println(Ack.salida(valorX,valorY) + " = " + variable);
            return recursion(x-1,1);                          
        } else { 
            System.out.println(Ack.salida(valorX,valorY) + " = " + Ack.CR2(x-1, recur2(x, y-1)));
            return recursion(x-1, Integer.parseInt((recursion(x, y-1))));
        }
    }

    public static String recur2(int x, int y) {
        return Ack.salida(x, y);
    }
}

class Ack {
    public int x;
    public int y;

    public Ack(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public static String salida(int x, int y) {
        return "A(" + x + "," + y + ")";
    }
    public static String CR2(int x, String y) {
        return "A(" + x + "," + y + ")";
    }
}