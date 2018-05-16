package com.OO.inherit;

public abstract  class Cool {
	public abstract void shushu();
	private String name;//名字
	private String varl;//品种
	private String like;//喜欢
	
	public Cool(String name,String varl,String like){
		this.name=name;
		this.like=like;
		this.varl=varl;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVarl() {
		return varl;
	}

	public void setVarl(String varl) {
		this.varl = varl;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
	public static void main(String[] args) {
		Cool dool= new Dool("喔喔","芦花鸡","虫子");//new实例化,Dool子类的父类带参构造，然后子类给父类的带参构造增加参数
		dool.shushu();
		Cool eool = new Eool("嘎嘎","斑嘴鸭","鱼虾");//new实例化,Eool子类的父类带参构造，然后子类给父类的带参构造增加参数
		eool.shushu();
	}
	
	
}
