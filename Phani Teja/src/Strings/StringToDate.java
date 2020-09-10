package Strings;

import java.text.SimpleDateFormate;
import java.util.Date;

import src.String.SimpleDateFormat;
public class StringToDate {
    public static void main(String[] args){
        String s1="02/03/2002";
        Date  d=new SimpleDateFormat("dd/mm/yyyy").parse(s1);
        System.out.println(s1+"\t"+d);
      }
}