package com.练习.LLL;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class FileDemo {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.println("************欢迎进入稳健操作系统*************8");
		System.out.println("1.创建文件");
		System.out.println("2.删除文件");
		System.out.println("3.创建多级文件架");
		System.out.println("4.修改文件名称");
		System.out.println("5.查询目录下面所有文件");
		// 调用一级菜单
		showFirsMenu();
	}

	/**
	 * 一级菜单
	 * 
	 * @param input输入流
	 * @param choose用户选择
	 * @throws IOException
	 */
	private static void showFirsMenu()
			throws IOException {
		
		System.out.println("请您选择");
		int choose = input.nextInt();// 获取用户选择
		switch (choose) {
		case 1:
			// 创建文件
			System.out.println("请您输入文件的名称：默认在E:/");
			String fileName = input.next();
			createFile(fileName);
			break;
		case 2:// 删除文件
			System.out.println("请您输入文件的名称：默认在E:/");
			String deleteFileName = input.next();
			deleteFile(deleteFileName);

			break;
		case 3://创建文件夹
			creatDir();
			break;
		case 4://修改文件名称
			renameFile();
			break;
		case 5://查询目录下所有的文件列表
			showFiles();
			break;
		default:
			break;
		}
	}
	
	/**
	 * 查询目录下所有的文件列表
	 * @throws IOException 
	 */
	private static void showFiles() throws IOException {
		System.out.println("请输入目录的名称：默认E：/");
		String dirName =input.next();
		//创建文件对象
		File file = new File("E:/"+dirName);
		File[] files=file.listFiles();
		for (File f : files) {
			System.out.println(f);
		}
		showFirsMenu();
	}

	/**
	 * 修改文件名称
	 */
	private static void renameFile() {
		System.out.println("请输入原文件名称");
		String oldName =input.next();
		System.out.println("请输入新文件的名称");
		String newName =input.next();
		//创建文件对象
		File oldfile = new File("E:/"+oldName+".txt");
		File newfile = new File("E:/"+newName+".txt");
		if (oldfile.renameTo(newfile)) {
			System.out.println("重命名成功");
		}else {
			System.out.println("重命名失败");
		}
	}

	/**
	 * 创建一级目录
	 * @throws IOException 
	 */
	private static void creatDir() throws IOException {
		System.out.println("请您输入创建的目录名称:默认在E：");
		String dir = input.next();
		//创建文件对象
		File file = new File("E:/"+dir);
		boolean flag  = file.mkdirs();
		if (flag) {
			System.out.println("创建成功");
		}else {
			System.out.println("创建失败");
		}
		showFirsMenu();
	}

	/**
	 * 删除指定的文件
	 * 
	 * @param deleteFileName
	 * @throws IOException 
	 */
	private static void deleteFile(String deleteFileName) throws IOException {
		//创建文件对象
	File file=new File("E:/"+deleteFileName+".txt");
		if (file.exists()) {//文件存在就删除
			boolean flag = file.delete();
			if (flag) {
				System.out.println("删除成功====！");
				
			}else {
				System.out.println("删除失败====！");
			}
		}else {
			System.out.println("您要删除的文件不存在");
			showFirsMenu();
		}
	}

	/**
	 * 创建一个文件
	 * 
	 * @throws IOException
	 */
	@Test
	public static void createFile(String fileName) throws IOException {
		// 创建一个文件对象
		File file = new File("E:/" + fileName + ".txt");// 创建文件
		// 判断未见是否存在
		if (file.exists()) {
			System.out.println("该文件已经存在");
		} else {
			boolean flag = file.createNewFile();// 创建文件
			if (flag) {
				System.out.println("创建成功！");
				// 显示文件的详情
				showFile("E:/" + fileName + ".txt");
			} else {
				System.out.println("创建失败！");
				{

				}
			}
		}
	}

	private static void showFile(String fileName) throws IOException {
		File file = new File(fileName);
		System.out.println("文件的名字" + file.getName());
		System.out.println("文件的大小" + file.length());
		System.out.println("文件的路径" + file.getAbsolutePath());
		showFirsMenu();
	}
}
