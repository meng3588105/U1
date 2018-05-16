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
	 * ����DOM��
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
	 * ����XML
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
	 * ��ʾ������Ϣ
	 */
	public void showInfo() {
		Element root = doc.getRootElement();// �õ�dom�����ڵ�
		Iterator itBrand = root.elementIterator();
		while (itBrand.hasNext()) {
			Element brandEle = (Element) itBrand.next();
			String brandStr = brandEle.attributeValue("name");
			Iterator itType = brandEle.elementIterator();
			while (itType.hasNext()) {
				Element typeEle = (Element) itType.next();
				String typeStr = typeEle.attributeValue("name");
				System.out.println("�ֻ�Ʒ�ƣ�" + brandStr + "�ͺţ�" + typeStr);
			}
		}
	}

	/**
	 * ���һ���ڵ� (����note4)
	 */
	public void addPhoneInfo() {
		Element root = doc.getRootElement();
		// ����һ��brand�ڵ�
		Element brandEle = root.addElement("Brand");
		// ��Brand�ڵ���������
		brandEle.addAttribute("name", "����");
		// ����Type
		Element typeEle = brandEle.addElement("Type");
		typeEle.addAttribute("name", "Note4");
		this.saveXML("Phone3.xml");
	}

	/**
	 * �޸Ľڵ���Ϣ (Ϊÿ�¸�brand�ڵ����һ��id����)
	 */
	public void modifyPhoneInfo() {
		Element rood = doc.getRootElement();
		int id = 0;
		Iterator itBrand = rood.elementIterator();
		//�������ȡÿ��brand�ڵ�
		while (itBrand.hasNext()) {
			id++;
			Element brandEle = (Element)itBrand.next();
			brandEle.addAttribute("id", id+"");
		}
		this.saveXML("Phone3.xml");
	}
	/**
	 * ɾ���ڵ���Ϣ
	 * (ɾ���ڵ�����)
	 */
	public void delPhoneInfo() {
		Element rood = doc.getRootElement();
		Iterator itBrand = rood.elementIterator();
		while (itBrand.hasNext()) {
			Element brandEle = (Element)itBrand.next();
			if (brandEle.attributeValue("name").equals("����")) {
				brandEle.getParent().remove(brandEle);
			}			
		}
		this.saveXML("Phone3.xml");
	}
	public static void main(String[] args) {
		Dom4jDemo parse = new Dom4jDemo();
		parse.loadDociment();// ����dom��
		parse.addPhoneInfo();// ���һ���ڵ�
		parse.showInfo();// ��ʾ������Ϣ
		parse.modifyPhoneInfo();//�޸Ľڵ���Ϣ�������һ����
		//parse.delPhoneInfo();//ɾ���ڵ㣨���ǣ�
		// parse.saveXML("Phone2.xml");
	}

}
