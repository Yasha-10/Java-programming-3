/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templat */
package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

    