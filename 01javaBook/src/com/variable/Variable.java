package com.variable;

public class Variable {

	public static void main(String[] args) {
		String brand="爱国者F928";
		double weight=12.4;
		String type="内置锂电池";
		int price =499;
		System.out.println("品牌(brand)："+brand);
		System.out.println("重量(weight)："+weight);
		System.out.println("电池类型(type)："+type);
		System.out.println("价格(price)："+price);
		
		int a = 5;
		int b =++a;
		System.out.println(a++);
		System.out.println(++b + a);
		

		    /** 
		     *  总数据               页大小（每页显示多少条数据）                     页数
		     * counts         pageSize                pageCount
		     *   100             10                    10
		     *   101             10                    11
		     * 
		     *   120             11                    ?
		     * 
		     * 01.总数据  % 页大小 ==0        页数=总数据 / 页大小
		     * 02.总数据  % 页大小 !=0        页数=总数据 / 页大小+1
		     * 
		     */

		    int counts = 120;
		    int pageSize = 11;
		    int pageCount = (counts % pageSize == 0) ? (counts / pageSize) : (counts / pageSize + 1);
		    System.out.println(pageCount);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
