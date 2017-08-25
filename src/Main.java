import javax.swing.*;

public class Main extends MovingEllipse
{
	public static void main(String[] args)
    {
		//лицо
		MovingEllipse face = new MovingEllipse();
        
		// создаем окно
		JFrame frame = new JFrame("Рожица");
        frame.setSize(400, 330); //размеры окна
        frame.setVisible(true); //видимость окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //при нажатии на крестик
        frame.add(face); //добавляем наше лицо в окно
    }
}