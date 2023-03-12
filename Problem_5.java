package com.companys;

import java.util.*;

class Problem_5 {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int orchid(int n, int d)
    {
        int fru[] = { ((400/5)*150), ((280/7)*250), ((2200/8)*100), ((1500/10)*50), ((75/15)*1600)};
        int day[] = { 10, 6, 15, 5, 15};
        if (d == 0 || n == 0)
            return 0;
        if (day[d - 1] > n)
            return orchid(n, d - 1);

        else
            return max(fru[d - 1] + orchid(d - day[n - 1], d - 1),
                    orchid(n, d - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(orchid(n, d));
        }
    }
}
