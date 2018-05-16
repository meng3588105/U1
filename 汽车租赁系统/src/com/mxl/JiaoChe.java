package com.mxl;

public final class JiaoChe extends QiChe{
	private String xinghao = "";//型号

	public String getXinghao() {
		return xinghao;
	}

	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}

	@Override
	public String toString() {
		return "JiaoChe [xinghao=" + xinghao + "]";
	}

	public JiaoChe(String cPhao, String pingpai, String xinghao) {
		super(cPhao, pingpai);
		this.xinghao = xinghao;
	}

	public JiaoChe() {
		super();
	}
	 public double zujin(int days,int Type){  
         
	        double money =0;        //租金  
	        switch (Type) {  
	        case 1:  
	            money=days*500;  
	            break;  
	        case 2:  
	            money=days*600;  
	            break;  
	        case 3:  
	            money =days*300;  
	        default:  
	            System.out.println("输入错误");  
	            break;  
	        }  
	        return money;  
	    }  

	
	
}
