package com.mxl;

public final class KeChe extends QiChe{
	private String zuoweishu = "";

	public String getZuoweishu() {
		return zuoweishu;
	}

	public void setZuoweishu(String zuoweishu) {
		this.zuoweishu = zuoweishu;
	}

	@Override
	public String toString() {
		return "KeChe [zuoweishu=" + zuoweishu + "]";
	}

	public KeChe() {
		super();
	}

	public KeChe(String cPhao, String pingpai) {
		super(cPhao, pingpai);
	}

	public KeChe(String cPhao, String pingpai, String zuoweishu) {
		super(cPhao, pingpai);
		this.zuoweishu = zuoweishu;
	}
    public double zujin(int days,int Type)  
    {  
        double money=0;  
          
        if (Type>16) {  
            money=days*1000;  
        }  
        else {  
            money=days*500;  
        }  
        return money;  
    }  
}
