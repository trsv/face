import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class MovingEllipse extends JPanel implements ActionListener
{
	//таймер, скорость анимации
	Timer tm = new Timer(50, this);
	
	int eyesX = 110; //положение глаз по ’
	int mouthY = 5; //положение рта по Y
	int step = 1; //шаг анимации
	
	Graphics2D draw; //объект рисовани€
	
	//отрисовываем рожицу
	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw = (Graphics2D)g;
        
        //лицо
        draw.setColor(Color.YELLOW);
        draw.fill(new Ellipse2D.Float(10, 10, 360, 260));
        
        //глаза
        draw.setColor(Color.WHITE);
        draw.fill(new Ellipse2D.Float(100, 50, 60, 60));
        draw.fill(new Ellipse2D.Float(230, 50, 60, 60));
        
        //зрачки
        draw.setColor(Color.BLACK);
        draw.fill(new Ellipse2D.Float(eyesX, 70, 10, 10));
        draw.fill(new Ellipse2D.Float(eyesX + 130, 70, 10, 10));
        
        //рот
        draw.setColor(Color.RED);
        draw.fill(new Ellipse2D.Float(165, 180, 60, mouthY)); 
        
        //старт анимации
        tm.start();
    }
	
	//изменение координаты ’, обработка выхода за границы
	public void actionPerformed (ActionEvent e)
	{
		if (eyesX < 110 || eyesX > 140)
			step = -step;
		
		eyesX += step;
		mouthY += step;
		repaint();
	}
}
