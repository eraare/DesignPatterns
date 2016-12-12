package com.dp.facade;

public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer() {
		this.cpu = new CPU();
		this.disk = new Disk();
		this.memory = new Memory();
	}
	
	public void powerOn() {
		System.out.println("Computer starting");
		this.cpu.start();
		this.disk.start();
		this.memory.start();
		System.out.println("Computer started");
	}
	
	public void powerOff() {
		System.out.println("Computer stopping");
		this.cpu.stop();
		this.disk.stop();
		this.memory.stop();
		System.out.println("Computer stoped");
	}
}
