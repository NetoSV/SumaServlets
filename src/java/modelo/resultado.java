/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alumno
 */
public class resultado implements java.io.Serializable{
    private int num1;
    private int num2;
    private char op;
    private double res;
    
    
    public resultado (){
        
    }
    public void setOp(char op){
        this.op=op;
    }
    
    public char getOp(){
        return this.op;
        
    }
    
    public double getResultado(){
        operaciones op = new operaciones();
        res = op.hacer(this.num1, this.num2, this.op);
        return res;
    }
    
    public void setNum1(int num1){
        this.num1=num1;
        
    }
    public void setNum2(int num2){
        this.num2= num2;
    }
    
    public int getNum1(){
        return this.num1;
    }
    
    public int getNum2(){
        return this.num2;
    }
    
}
