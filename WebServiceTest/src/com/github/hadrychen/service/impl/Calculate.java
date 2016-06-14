package com.github.hadrychen.service.impl;

import javax.jws.WebService;

@WebService
public class Calculate {

	private int x;
	private int y;
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult(){
		x = (int)(Math.random() * 100 - 1);
		y = (int)(Math.random() * 100 - 1);
		System.out.println("x:" + x + "--- y:" + y);
		return x + y;
	}
}
