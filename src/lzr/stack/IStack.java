/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lzr.stack;

/**
 *
 * @author lab656
 */
public interface IStack {
        void push(char value);
	char pop();
	char peek();
	boolean voidStack();
	boolean fullStack();
        int size();
} 

