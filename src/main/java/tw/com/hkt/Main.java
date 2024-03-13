package tw.com.hkt;


import javax.swing.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("請輸入體重");
//            double weight = sc.nextDouble();
//
//            System.out.print("請輸入身高");
//            double height = sc.nextDouble();

//        String dinner = JOptionPane.showInputDialog("晚餐想吃甚麼??");  產生一個輸入框
//        JOptionPane.showMessageDialog(null,dinner);                   將輸入的文字顯示出來


        //方式1
        String[] countries = {"Japan", "America", "China", "Korea", "Taiwan", "UK", "France" };
        System.out.println(Arrays.toString(countries));  //印出整個Array
        System.out.println(countries);  //印出Array在記憶體的位址


        //方式2
        String[] countries2 = new String[7];
        countries2[0] = "Japan";
        countries2[1] = "America";
        countries2[2] = "China";
        countries2[3] = "Korea";
        countries2[4] = "Taiwan";
        countries2[5] = "UK";
        countries2[6] = "France";
        System.out.println(Arrays.toString(countries2));


        //動態的陣列
        ArrayList<String> countries3 = new ArrayList<>();



    }
}
