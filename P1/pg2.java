
package com.mycompany.triangulo;

/**
 *
 * @author Multipropósito2
 */
public class Triangulo {

//apartir de la clase triangulo crear sobrecarga al constructor y crear 2 objetos para cada una de las formas del constructor
private int Base;
private int Altura;


    public Triangulo(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

  

    public int getBase() {
        return Base;
    }

    public void setBase(int base) {
        this.Base = base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        this.Altura = altura;
    }

    public static void main(String[] args) {
    
     Triangulo triangulo1= new Triangulo( 3,5);
     Triangulo triangulo2= new Triangulo( 100000,22222222); 
    
        
    }
}
