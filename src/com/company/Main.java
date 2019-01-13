package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
// String Str = in.nextLine();

        StringBuffer sb = new StringBuffer( in.nextLine());
        int ind = sb.indexOf(" ");
        if (ind == -1)
        {
            System.out.println("В введенной строке нет пробелов!");
        }
        else {
            while (ind!=-1){
                sb.delete(ind,ind+1);
                ind = sb.indexOf(" ");
            }
            System.out.println("Строка без пробелов: " + sb);

        }
    }
}