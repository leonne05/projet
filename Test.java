/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args){
    System.out.println("entrer la longueur:");
    Scanner sc= new Scanner (System.in);
    float Long = sc.nextFloat();
    System.out.println("entrer la largeur:");
    float Larg = sc.nextFloat();
    Rectangle r= new Rectangle(Long,Larg);
    r.affiche();
    System.out.println("la surface est:" +r.surface()+"le perimetre est :" +r.perimetre());
    System.out.println("entrer le rayon:");
    float Rayon= sc.nextFloat();
    System.out.println("entrer la largeur:");
    Cercle c = new Cercle(Rayon);
    c.affiche();
    System.out.println("la surface est:"+c.surface()+"le perimetre est: " +c.perimetre());
}
}