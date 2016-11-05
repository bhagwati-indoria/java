public class HelloSwing1 {
	private static void createAndShowGui() {
		javax.swing.JFrame frame = new javax.swing.JFrame("HelloSwing1");
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

		javax.swing.JLabel label = new javax.swing.JLabel("Hello World");
		frame.getContentPane().add(label);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGui();
			}
		});
	}
}
