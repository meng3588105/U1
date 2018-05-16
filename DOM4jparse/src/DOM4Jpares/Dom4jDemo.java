package DOM4Jpares;

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
			doc = saxReader.read("Phone.xml");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 保存XML
	 */
	public void saveXML(String path) {
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		try {
			XMLWriter writer = new XMLWriter(new FileWriter(path), format);
			writer.write(doc);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 显示所有信息
	 */
	public void showInfo() {
		Element root = doc.getRootElement();// 得到dom树根节点
		Iterator itBrand = root.elementIterator();
		while (itBrand.hasNext()) {
			Element brandEle = (Element) itBrand.next();
			String brandStr = brandEle.attributeValue("name");
			Iterator itType = brandEle.elementIterator();
			while (itType.hasNext()) {
				Element typeEle = (Element) itType.next();
				String typeStr = typeEle.attributeValue("name");
				System.out.println("手机品牌：" + brandStr + "型号：" + typeStr);
			}
		}
	}

	/**
	 * 添加一个节点 (三星note4)
	 */
	public void addPhoneInfo() {
		Element root = doc.getRootElement();
		// 创建一个brand节点
		Element brandEle = root.addElement("Brand");
		// 给Brand节点设置属性
		brandEle.addAttribute("name", "三星");
		// 创建Type
		Element typeEle = brandEle.addElement("Type");
		typeEle.addAttribute("name", "Note4");
		this.saveXML("Phone3.xml");
	}

	/**
	 * 修改节点信息 (为每下个brand节点添加一个id属性)
	 */
	public void modifyPhoneInfo() {
		Element rood = doc.getRootElement();
		int id = 0;
		Iterator itBrand = rood.elementIterator();
		//遍历后获取每个brand节点
		while (itBrand.hasNext()) {
			id++;
			Element brandEle = (Element)itBrand.next();
			brandEle.addAttribute("id", id+"");
		}
		this.saveXML("Phone3.xml");
	}
	/**
	 * 删除节点信息
	 * (删除节点三星)
	 */
	public void delPhoneInfo() {
		Element rood = doc.getRootElement();
		Iterator itBrand = rood.elementIterator();
		while (itBrand.hasNext()) {
			Element brandEle = (Element)itBrand.next();
			if (brandEle.attributeValue("name").equals("三星")) {
				brandEle.getParent().remove(brandEle);
			}			
		}
		this.saveXML("Phone3.xml");
	}
	public static void main(String[] args) {
		Dom4jDemo parse = new Dom4jDemo();
		parse.loadDociment();// 加载dom树
		parse.addPhoneInfo();// 添加一个节点
		parse.showInfo();// 显示所有信息
		parse.modifyPhoneInfo();//修改节点信息，（添加一个）
		//parse.delPhoneInfo();//删除节点（三星）
		// parse.saveXML("Phone2.xml");
	}

}
