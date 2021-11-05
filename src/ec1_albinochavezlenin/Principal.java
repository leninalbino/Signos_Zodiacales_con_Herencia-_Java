/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec1_albinochavezlenin;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia en numero (1-31)"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes en numero (1-12)"));
        
        if ((dia >= 21 && dia <= 31 && mes ==1)||(dia >=1 && dia <=20 && mes ==2)){
            Acuario acuario = new Acuario("Acuario");
            System.out.println(acuario.toString());
        }else if ((dia >= 21 && dia <= 29 && mes ==2)||(dia >=1 && dia <=20 && mes ==3)){
            Piscis piscis = new Piscis("Piscis");
             System.out.println(piscis.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==12)||(dia >=1 && dia <=20 && mes ==1)){
        Capricornio capricornio = new Capricornio("Capricornio");
         System.out.println(capricornio.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==11)||(dia >=1 && dia <=20 && mes ==12)){
        Sagitario sagitario = new Sagitario("Sagitario");
         System.out.println(sagitario.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==10)||(dia >=1 && dia <=20 && mes ==11)){
        Escorpio escorpio = new Escorpio("Escorpio");
         System.out.println(escorpio.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==9)||(dia >=1 && dia <=20 && mes ==10)){
        Libra libra = new Libra("Libra");
         System.out.println(libra.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==8)||(dia >=1 && dia <=20 && mes ==9)){
        Virgo virgo = new Virgo("Virgo");
         System.out.println(virgo.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==7)||(dia >=1 && dia <=20 && mes ==8)){
        Leo leo = new Leo("Leo");
         System.out.println(leo.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==6)||(dia >=1 && dia <=20 && mes ==7)){
        Cancer cancer= new Cancer("Cancer");
         System.out.println(cancer.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==5)||(dia >=1 && dia <=20 && mes ==6)){
        Geminis geminis = new Geminis("Geminis");
         System.out.println(geminis.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==4)||(dia >=1 && dia <=20 && mes ==5)){
        Tauro tauro = new Tauro("Tauro");
         System.out.println(tauro.toString());
        }else if ((dia >= 21 && dia <= 31 && mes ==3)||(dia >=1 && dia <=20 && mes ==4)){
        Aries aries = new Aries("Aries");
         System.out.println(aries.toString());
        }else System.out.println("datos ingresado es incorrecto!!!! ");
    }
}
