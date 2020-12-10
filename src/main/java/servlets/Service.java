package servlets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

class Service {
    public String equation(int[] Arr) {

        StringBuffer stringBuffer=new StringBuffer();

        int startYear = Arr[0];
        int endYear = Arr[1];
        


            stringBuffer.append(endYear-startYear);


        return ("Пройшло "+stringBuffer.toString()+" повних років");
    }
}



