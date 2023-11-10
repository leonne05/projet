/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author User
 */
public class Rectangle implements Figure {
private float Long;
private float Larg;
 
Rectangle(float Long,float Larg){
    this.Long =Long;
    this.Larg=Larg;
}

    public float getLong() {
        return Long;
    }

    public void setLong(float Long) {
        this.Long = Long;
    }

    public float getLarg() {
        return Larg;
    }

    public void setLarg(float Larg) {
        this.Larg = Larg;
    }

    @Override
    public float surface(){
        return Long*Larg;
        
    }

    @Override
    public float perimetre() {
       return (Long+Larg)*2;
    }

    @Override
    public String affiche() {
        System.out.println("Je suis un rectangle de longueur:"+Long+" et de largeur:"+Larg);
    return null;
    } 
}
