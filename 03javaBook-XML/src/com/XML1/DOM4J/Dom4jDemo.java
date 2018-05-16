package com.XML1.DOM4J;
/**
 * dom4j  作业
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;



public class Dom4jDemo {
	Document doc = null;

	/**
	 * 加载DOM树
	 */
	public void loadDociment() {
		SAXReader saxReader = new SAXReader();
		try {
			doc = saxReader.read("scoresTest.xml");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 显示所有信息
 */
public void showInfo() {
	Element root = doc.getRootElement();// 得到dom树根节点
	Iterator itScores = root.elementIterator();
	while (itScores.hasNext()) {
		Element studentEle = (Element) itScores.next();//意思是根节点下的本级节点   studentEle用于后面.
		String studentStr = studentEle.attributeValue("id");//本级节点的目录    id   赋值给 studentStr  输出即可
		Iterator itUesr = studentEle.elementIterator();//找到下一级节点   itUesr用于下一级菜单引用
		
		while (itUesr.hasNext()) {
			Element uesrEle = (Element) itUesr.next();//意思是根节点下的本级节点
			String uesrStr = uesrEle.attributeValue("name");//本级节点的目录
			Iterator itSubject = uesrEle.elementIterator();//找到下一级节点
			
			while (itSubject.hasNext()) {
				Element subjectEle = (Element) itSubject.next();//意思是根节点下的本级节点
				String subjectStr = subjectEle.attributeValue("course");//本级节点的目录
				Iterator itCount = subjectEle.elementIterator();//找到下一级节点
				
				while (itCount.hasNext()) {
					Element scoseEle = (Element) itCount.next();//意思是根节点下的本级节点
					String scosetStr = scoseEle.attributeValue("scose");//本级节点的目录
					System.out.println("学生ID:" + studentStr + "\n学生姓名:" + uesrStr+"\n学生科目:"+subjectStr+
							"\n学生成绩："+scosetStr);
				}
			}
		}
	}
}
public static void main(String[] args) {
	Dom4jDemo parse = new Dom4jDemo();
	parse.loadDociment();// 加载dom树的方法
	parse.showInfo();//显示所有信息的方法
}













}