package com.XML.DOM;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomDemo {
	
	/**
	 * 输出所有xml信息
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public void A() throws ParserConfigurationException, SAXException,NullPointerException, IOException{
		//得到dom解析器的工厂实例
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//从dom工厂获得dom解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		//解析xml文档，得到一个document对象，既dom树
		Document doc = db.parse("DomTest.xml");
		//得到所有student节点列表信息
		NodeList studentList = doc.getElementsByTagName("student");
		//循环student信息
		for (int i = 0; i < studentList.getLength(); i++) {
			//获取第i个student元素信息
			Node student = studentList.item(i);
			//获取第i个student元素的name信息
			Element element = (Element)student;
			String attrValue = element.getAttribute("id");
			//获取student元素下的元素的属性
			NodeList uesrList =element.getChildNodes();
			System.out.println("学生学号："+attrValue);
			System.out.println("学生姓名: "+ element.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
            System.out.println("学生科目: "+ element.getElementsByTagName("course").item(0).getFirstChild().getNodeValue());
            System.out.println("学生成绩: "+ element.getElementsByTagName("scose").item(0).getFirstChild().getNodeValue());
	
			}
		}
	/**
	 * 删除ID为1的成绩
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public void B() throws ParserConfigurationException, SAXException, IOException{
		//得到dom解析器的工厂实例
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//从dom工厂获得dom解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		//解析xml文档，得到一个document对象，既dom树
		Document doc = db.parse("DomTest.xml");
		NodeList list = doc.getElementsByTagName("student");
		for (int i = 0; i < list.getLength(); i++) {
			Element brandElement = (Element)list.item(i);
			String brandName= brandElement.getAttribute("id");
			if (brandName.equals("1")) {
				brandElement.getParentNode().removeChild(brandElement);
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DomDemo a = new DomDemo();
		a.A();
		a.B();
		//System.out.println("学生学号："+attrValue);
	}
}
