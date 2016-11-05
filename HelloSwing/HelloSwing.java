import java.awt.EventQueue;
import javax.swing.JFrame;

public class HelloSwing extends JFrame {
	public HelloSwing() {
		initUI();
	}

	public void initUI() {
		setTitle("Simple Example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
				HelloSwing hs = new HelloSwing();
				hs.setVisible(true);
			});
	}
}
