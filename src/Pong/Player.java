package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	public boolean right,left;
	public int x,y,WIDTH,HEIGTH;
	
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.WIDTH = 40;
		this.HEIGTH = 10;
	}
	public void tick() {
		if(right) {
			x++;
		}else if (left) {
			x--;
		}
		
		if (x+WIDTH > Game.WIDTH) {
			x = Game.WIDTH - WIDTH;
		}else if (x < 0) {
			x =0;
		}
		
	}
	
	public void render(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(x,y,WIDTH,HEIGTH);
		
		
	}

}
