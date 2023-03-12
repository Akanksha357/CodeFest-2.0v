package com.companys;

import java.util.*;

    class Problem_6 {

        static int cafe(int b, int c, int d, int customer[])
        {
            int j=0;
            int total = 0;
            while(j<9){
                total = total+customer[j];
                j++;
            }
            int own = total/9;
            int expense;
            if ((b*c) >= b*d){
                expense = own*b*d;
                return expense;
            }
            else
                expense = own*b*c;
            return expense;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0; i<t; i++){
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int Customer[] = new int[9];
                int j = 0;
                while(j<9){
                    Customer[j] = sc.nextInt();
                    j++;
                }
                int j=0;
                int total = 0;
                while(j<9){
                    total = total+Customer[j];
                    j++;
                }
                int own = total/9;
                System.out.println(own, cafe(b, c, d, Customer[]));
            }
        }
    }
