/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package katona_janos;

public class main {

    static String[] szinek = {"zőld", "piros", "makk", "tök"};
    static String[] figurak = {"A", "K", "Q", "J", "10", "9"};
    static String[] pakli = new String[21];
    static int random;

    public static void main(String[] args) {
        feltolt();
        kiir();
    }

    private static void feltolt() {
        for (String kartya : figurak) {
            for (int i = 0; i < 4; i++) {
                do {
                    random = (int) (Math.random() * (21 - 1) + 1);
                } while (!(pakli[random] == null));

                pakli[random] = "+";
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
}
