package shuzu;

import java.util.Scanner;

public class ZuoYe05 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		String[]yinyue=new String[]{"Island","Ocean","Pretty","Sun"};//定义插入前一个数组
		String[]yinyue2= new String[yinyue.length+1];				//定义一个要插入的新数组，在插入前的数组长度+1长度
		int index=0;				//数组下标
		String xin ="";				//Srting类型新插入数组
		System.out.println("插入前的数组为：");
	for (int i = 0; i < yinyue.length; i++) {			//插入前的数组，我把定义的原有数组赋值给了新数组输出。这个时候新数组比原有数组长度多1个下标
		yinyue2[i]=yinyue[i];  //赋值数组
		System.out.print(yinyue2[i]+"\t");
	}
		System.out.println("\n请输入新的歌名:");				
		xin=meng00.next();				//要插入的新的歌名单词
	for (int i = 0; i < yinyue.length; i++) {
		if (yinyue2[i].compareToIgnoreCase(xin)>0) {		//书上提供的字符串比较大小的方法，找到插入的位置，解释看书第165页。
			index=i;										//附加：我也是按照书打的，不明白！！！！！
			break;											//这么长的单词 sorry！！我记不住！记不住！！
		}else {
			index=yinyue2.length-1;
		}		
	}
		
	for(int i=yinyue2.length-1;i>index;i--){	//可以解释成元素后移吗？
		 yinyue2[i]=yinyue2[i-1];				//是的 ！可以。
		}
	
		yinyue2[index]=xin;					//输入的歌曲名  赋值给比较好的数组下标找到新插入歌曲名称的下标位置
		System.out.print("插入后的数组:");			
	for(int i=0;i<yinyue2.length;i++){			//输出插入后数组
		System.out.print(yinyue2[i]+" ");  
	}
  }
		
}
/*String[] nummusics=new String[musics.length+1];
int index=0;
String music="";
System.out.print("插入前的数组:");
for(int i=0;i<musics.length;i++){
 nummusics[i]=musics[i];//
}
for(int i=0;i<musics.length;i++){//
 System.out.print(musics[i]+" ");//
}
System.out.println("");
System.out.print("请输入新的单词");
music=meng00.nextLine();
System.out.print("插入前新单词的下标:");
for(int i=0;i<nummusics.length;i++){
 if(nummusics[i].compareToIgnoreCase(music)>0){
  index=i;
  break;
 }
}
System.out.println(index);
for(int i=nummusics.length-1;i>index;i--){
 nummusics[i]=nummusics[i-1];
}
nummusics[index]=music;
System.out.print("插入后的数组:");
for(int i=0;i<nummusics.length;i++){
 System.out.print(nummusics[i]+" ");  
}
*/
