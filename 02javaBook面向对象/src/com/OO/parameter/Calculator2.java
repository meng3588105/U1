package com.OO.parameter;

public class Calculator2 {
	
	public int ope(int op,int num1,int num2){
		if (op==1) {			//判断输入的是1 返回num1+num2
			return num1+num2;
		}else if (op==2) {		//判断输入的是2 返回num1-num2
			return num1-num2;
		}else if (op==3) {		//判断输入的是3 返回num1*num2
			return num1*num2;
		}else if (op==4) {		//判断输入的是4 返回num1/num2
			return num1/num2;
		}

		return 0;		
	}
}
