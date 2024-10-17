/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes input from user 
 * and calls method to print the 
 * name of the day using enum.
 * It avoids using String input and uses enums to represent the days.
 *
 * @author sivagamasrinivasan
 */
public class Days {
    enum WeekdaysEnum {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN
    }

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN):");
        String input = in.next().toUpperCase();
        WeekdaysEnum code = WeekdaysEnum.valueOf(input);
        Weekdays t = new Weekdays();
        t.nameOfDay(code); 
    }
}
