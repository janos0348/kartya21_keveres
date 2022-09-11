/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package katona_janos;

public class main {

    static String[] szinek = {"zold", "piros", "makk", "tok"};
    static String[] figurak = {"A", "K", "Q", "J", "10", "9"};
    static String[] pakli = new String[21];
    static int random;

    public static void main(String[] args) {
        System.out.println(pakli.length);
        feltolt();
        kiir();
    }

    private static void feltolt() {
        for (String kartya : figurak) {
            for (int i = 0; i < 4; i++) {
                do {
                    random = (int) (Math.random() * (20 - 0) + 0);
                } while (!(pakli[random] == null) && !(pakliTele()));
                
                pakli[random] = (kartya + " " +szinek[i]);
                System.out.println(kartya);
            }

        }
    }

    private static void kiir() {
        int count = 0;
        for (String string :pakli) {
            System.out.print(string + " ");
            count++;
            if (count%7 == 0){
                System.out.println("");
            }
        }
    }

    private static boolean pakliTele() {
        int i = 0;
        while(i<pakli.length && (pakli[i] != null)){
            i++;
        }
            return i == pakli.length-1;
    }
}
