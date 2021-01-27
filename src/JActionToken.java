import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JActionToken extends JButton {
	public JActionToken(ImageIcon imageIcon) {
        super(imageIcon);
        setBorder(BorderFactory.createEmptyBorder());
        setContentAreaFilled(false);
    }


}