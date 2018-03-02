/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lzr.stack;

import java.util.Scanner;

/**
 *
 * @author lzrCampos
 */
public class LzrStack {

    public static void main(String[] args) {
        Scanner inputChar = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        
        Stack s1 = new Stack(inputInt.nextInt());
        
        s1.push(inputChar.next().charAt(0));
        
        System.out.println(s1.peek());
        
    }
    
}
