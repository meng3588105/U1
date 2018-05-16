package com.mxl;

public abstract class QiChe {

	private  String CPhao = "";//车牌号
	private String  pingpai= "";//品牌
	public String getCPhao() {
		return CPhao;
	}
	public void setCPhao(String cPhao) {
		CPhao = cPhao;
	}
	public String getPingpai() {
		return pingpai;
	}
	public void setPingpai(String pingpai) {
		this.pingpai = pingpai;
	}
	@Override
	public String toString() {
		return "QiChe [CPhao=" + CPhao + ", pingpai=" + pingpai + "]";
	}
    /** 
     * 无参方法给默认值 
     * */  
    public QiChe()  
    {  
    	CPhao="京AU8769";  
    	pingpai="宝马";  
    }  
    /** 
     * 有参方法 
     * @param no 
     * @param brand 
     */  
    public QiChe(String CPhao,String pingpai){  
        this.CPhao=CPhao;             //车牌号  
        this.pingpai=pingpai;           //品牌号  
    }  
    public abstract double zujin(int days,int Type);  
	
	
}
