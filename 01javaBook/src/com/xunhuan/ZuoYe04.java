package com.xunhuan;

import java.util.Scanner;

public class ZuoYe04 {

	public static void main(String[] args) {
		
            Scanner meng00 = new Scanner(System.in);
            int num=0;			//定义int变量
            String day="" ;		//定义day变量
            
            	//do... wuhile循环
            do{
                System.out.println("请输入0-7的数字:"); //输入
                num = meng00.nextInt();
                //if判断
                if (num>7||num<0) {
                    System.out.println("输入有误!");// 输入大于7 或 小于0 输入有误
                   break;
                }else if(num==0){
                	System.out.println("结束");// 输入0结束
                	break;
                	
                }else{
                		//if判断 否则else
                switch(num){
                    case 1: 
                    	day="今天是MON";

                    	break;
                    case 2: 
                    	day="今天是TUE";
                       
                    	break;
                    case 3: 
                    	day="今天是WED";
                       
                    	break;
                    case 4: 
                    	day="今天是THU";
                       
                    	break;
                    case 5: 
                    	day="今天是FRI";
                    	break;
                    case 6: 
                    	day="今天是SAT";
                    	break;
                    case 7: 
                    	day="今天是SUN";
                    	break;
                
                }
                System.out.println(day);
                }
                
                }while(num!=0);//不等于0

	
	}

}
