package com.xunhuan;

public class ZuoYe004 {

	public static void main(String[] args) {
		int men;
		int women;
		int kids;
		//男人人数小于等于十，在这基础上自加
		for(men=0;men<=10;men++){
			for(women=0;women<=30;women++){		//女人小于等于30人
				if(30-men-women >= 0){			//如果用30总人数-男人人数-女人人数结果大于等于0，就是孩子的人数
					int count = 3*men + 2*women + (30-men-women) ; //求出总花费的钱数
					if(count == 50){				//如果花费总钱数等于50的情况下进入if
						kids=(30-men-women);		//孩子的总人数
						System.out.println("男人:" + men +"女人:"+women+"小孩:"+kids ) ;
					}
				}
			}
		}
			
		}
	}


