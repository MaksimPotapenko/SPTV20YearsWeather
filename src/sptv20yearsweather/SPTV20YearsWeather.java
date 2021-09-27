/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20yearsweather;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20YearsWeather {
        public static enum month{
            Январь, Февраль, Март, Апрель, Май, Июнь, 
            Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int min=-20, max=25, dayInMonth = 0;
        
        //зубчатый массив
        
        int[][] yearsWeather =  new int[12][];
        System.out.print("        ");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%4d",i+1);
        }
        System.out.println("");
        for (int i = 0; i < 159; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
        for (int i = 0; i < yearsWeather.length; i++) {
            switch (i) {
                case 0: min=-20;max=-5; dayInMonth=31; break;
                case 1: min=-15;max=-0; dayInMonth=28; break;
                case 2: min=-10;max=-5; dayInMonth=31; break;
                case 3: min=-5;max=10; dayInMonth=30; break;
                case 4: min=0;max=15; dayInMonth=31; break;
                case 5: min=10;max=20; dayInMonth=30; break;
                case 6: min=15;max=25; dayInMonth=31; break;
                case 7: min=10;max=20; dayInMonth=31; break;
                case 8: min=5;max=15; dayInMonth=30; break;
                case 9: min=-5;max=10; dayInMonth=31; break;
                case 10: min=-10;max=5; dayInMonth=30; break;
                case 11: min=-15;max=0; dayInMonth=31; break;
            }
            
            yearsWeather[i] = new int[dayInMonth];
            double sum = 0.0;
            System.out.printf("%8s:", month.values()[i]);
            for (int j = 0; j < yearsWeather[i].length; j++) {
                yearsWeather[i][j]=random.nextInt(max-min+1)+min;
                sum += yearsWeather[i][j];
                System.out.printf("%4d",yearsWeather[i][j]);
                
                
            }
            if(dayInMonth > 28 && dayInMonth < 31){
                System.out.printf("     | ср. температура: %6.2f",sum/dayInMonth);
            }else if(dayInMonth < 30){
                System.out.printf("             | ср. температура: %6.2f",sum/dayInMonth);
            }else {
                System.out.printf(" | ср. температура: %6.2f",sum/dayInMonth);
            }
            System.out.println();  
        }
    System.out.println("");
        for (int i = 0; i < 159; i++) {
            System.out.print("-");
        }
    System.out.println();
    
    System.out.print("Введите месяц: ");
    int findMonth = scanner.nextInt();
    System.out.print("Введите день: ");
    int findDay = scanner.nextInt();
    
    System.out.println();
    
    int maxInt=0,minInt=0;
        for (int j = 0; j < yearsWeather[findMonth-1].length; j++) {    
            if(maxInt<yearsWeather[findMonth-1][j]){
                maxInt=yearsWeather[findMonth-1][j];
                }
            }
            for (int j = 0; j < yearsWeather[findMonth-1].length; j++) {    
                if(minInt>yearsWeather[findMonth-1][j]){
                    minInt=yearsWeather[findMonth-1][j];
                }
            }
        for(int i = 0; i < yearsWeather.length; i++) {
            for (int j = 0; j < yearsWeather[i].length; j++) {
                
            }
        }
        System.out.printf("В этот день была температура: %2d%n",yearsWeather[findMonth-1][findDay-1]);
        System.out.printf("Максимальная температура в этом месяце была: %2d%n",maxInt);
        System.out.printf("Минимальная температура в этом месяце была: %2d%n",minInt);
        
        System.out.println("");
        for (int i = 0; i < 159; i++) {
            System.out.print("-");
        }
        
        System.out.println("");
        
        int max_number = 0;
        for (int i = 0; i < yearsWeather.length; i++) {
            for (int j = 0; j < yearsWeather.length; j++) {
                int[] is = yearsWeather[j];
                if (yearsWeather[i][j] > max_number) {
                max_number = yearsWeather[i][j];
            }
        }
            }
            
        System.out.println("максимальная температура в году: " + max_number);
        
        int min_number = 0;
        for (int i = 0; i < yearsWeather.length; i++) {
            for (int j = 0; j < yearsWeather.length; j++) {
                int[] is = yearsWeather[j];
                if (yearsWeather[i][j] < min_number) {
                min_number = yearsWeather[i][j];
            }
        }
            }
            
        System.out.println("минимальная температура в году: " + min_number);
    }
    
}