/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulo;

/**
 *
 * @author Multipropósito2
 */
public class Triangulo {


    
    // crear 2 metodos puros que me permitan obtener area y perimetro del triangulo asumiendo que todos son triangulos rectangulos 
private int Base;
private int Altura;
public double hallarperimetro(int a, int b){

return (a+b)+Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
}
public double  hallararea(int a, int b){

return (a*b)/2;
}


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
    
     Triangulo triangulo1= new Triangulo( 10,5);
     Triangulo triangulo2= new Triangulo( 100000,22222222); 
    
       
        
    }
}
