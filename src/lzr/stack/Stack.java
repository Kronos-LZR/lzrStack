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
public class Stack implements IStack{
    private char[] _stack;
    private int _count;
    
    public Stack(int lenth){
        this._stack = new char[lenth];
        this._count = 0;
    }

    @Override
    public void push(char value) {
        this._count ++;
        this._stack[_count] = value;
    }

    @Override
    public char pop() {
        this._count --;    
        return this._stack[_count+1];
    }

    @Override
    public char peek() {
        return this._stack[_count];
    }

    @Override
    public boolean voidStack() {
        if(this._count < 1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean fullStack() {
        if(this._stack.length == this._count){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return this._stack.length;
    }
    
}
