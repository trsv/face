import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class MovingEllipse extends JPanel implements ActionListener
{
	//������, �������� ��������
	Timer tm = new Timer(50, this);
	
	int eyesX = 110; //��������� ���� �� �
	int mouthY = 5; //��������� ��� �� Y
	int step = 1; //��� ��������
	
	Graphics2D draw; //������ ���������
	
	//������������ ������
	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw = (Graphics2D)g;
        
        //����
        draw.setColor(Color.YELLOW);
        draw.fill(new Ellipse2D.Float(10, 10, 360, 260));
        
        //�����
        draw.setColor(Color.WHITE);
        draw.fill(new Ellipse2D.Float(100, 50, 60, 60));
        draw.fill(new Ellipse2D.Float(230, 50, 60, 60));
        
        //������
        draw.setColor(Color.BLACK);
        draw.fill(new Ellipse2D.Float(eyesX, 70, 10, 10));
        draw.fill(new Ellipse2D.Float(eyesX + 130, 70, 10, 10));
        
        //���
        draw.setColor(Color.RED);
        draw.fill(new Ellipse2D.Float(165, 180, 60, mouthY)); 
        
        //����� ��������
        tm.start();
    }
	
	//��������� ���������� �, ��������� ������ �� �������
	public void actionPerformed (ActionEvent e)
	{
		if (eyesX < 110 || eyesX > 140)
			step = -step;
		
		eyesX += step;
		mouthY += step;
		repaint();
	}
}
