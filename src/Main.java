import javax.swing.*;

public class Main extends MovingEllipse
{
	public static void main(String[] args)
    {
		//����
		MovingEllipse face = new MovingEllipse();
        
		// ������� ����
		JFrame frame = new JFrame("������");
        frame.setSize(400, 330); //������� ����
        frame.setVisible(true); //��������� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��� ������� �� �������
        frame.add(face); //��������� ���� ���� � ����
    }
}