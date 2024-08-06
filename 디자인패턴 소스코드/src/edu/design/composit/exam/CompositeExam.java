package edu.design.composit.exam;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	
	public Entry add(Entry entry) {
		return null;
	}

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}

class MyFile extends Entry {
	private String name;
	private int size;

	public MyFile(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}
}

class MyDirectory extends Entry {
	private String name;
	private ArrayList<Entry> directory = new ArrayList<Entry>();

	public MyDirectory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}

public class CompositeExam {
	public static void main(String[] args) {

		System.out.println("root entries 생성하기...");
		MyDirectory rootdir = new MyDirectory("root");
		MyDirectory bindir = new MyDirectory("bin");
		MyDirectory tmpdir = new MyDirectory("tmp");
		MyDirectory usrdir = new MyDirectory("usr");
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
		bindir.add(new MyFile("vi", 10000));
		bindir.add(new MyFile("latex", 20000));
		rootdir.printList();

		System.out.println("");
		System.out.println("user entries 생성하기...");
		MyDirectory kim = new MyDirectory("김성근");
		MyDirectory lee = new MyDirectory("이승엽");
		MyDirectory park = new MyDirectory("박찬호");
		usrdir.add(kim);
		usrdir.add(lee);
		usrdir.add(park);
		kim.add(new MyFile("index.html", 100));
		kim.add(new MyFile("CompositeExam.java", 200));
		lee.add(new MyFile("메모.txt", 300));
		park.add(new MyFile("메이져리그 진출법.doc", 400));
		park.add(new MyFile("내 가족.gif", 500));
		rootdir.printList();
	}
}
