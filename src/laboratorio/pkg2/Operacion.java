/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

/**
 *
 * @author diego
 */
public class Operacion {
    public Operacion(){
        
    }
    public Operacion(float Elemento1, float Elemento2){
        this.Elemento1 = Elemento1;
        this.Elemento2 = Elemento2;
    }
    public float sumar(){
return this.Elemento1 + this.Elemento2;
}
  public float restar(){
return this.Elemento1 - this.Elemento2;
} 
  public float multiplicar(){
return this.Elemento1 * this.Elemento2;
}
public float dividir(){
return this.Elemento1 / this.Elemento2;
}
    /**
     * @return the Elemento1
     */
    public float getElemento1() {
        return Elemento1;
    }

    /**
     * @param Elemento1 the Elemento1 to set
     */
    public void setElemento1(float Elemento1) {
        this.Elemento1 = Elemento1;
    }

    /**
     * @return the Elemento2
     */
    public float getElemento2() {
        return Elemento2;
    }

    /**
     * @param Elemento2 the Elemento2 to set
     */
    public void setElemento2(float Elemento2) {
        this.Elemento2 = Elemento2;
    }
    private float Elemento1;
    private float Elemento2;
    
        
}
