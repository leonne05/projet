/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author User
 */
public class Cercle implements Figure{
      static final float PI=(float) 3.14;
    private float r;

    public Cercle(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    

    @Override
    public float surface() {
        return PI*r*r;
        
    }

    @Override
    public float perimetre() {
       return 2*PI*r; 
    }

    @Override
    public String affiche() {
        System.out.println("Je suis un cercle de rayon:+r");
        return null;
    }
  
    
}
