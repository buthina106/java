import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollText extends JPanel {

    private String text;
    private int scrollOffset = 0;
    private Timer timer;
    private int period;
    private int pixelsPerMove;

    public ScrollText(String text, int period, int pixelsPerMove) {
        this.text = text;
        this.period = period;
        this.pixelsPerMove = pixelsPerMove;

        timer = new Timer(period, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scrollOffset += pixelsPerMove;
                if (scrollOffset >= getWidth())
                    scrollOffset = 0;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(text, getWidth() - scrollOffset, getHeight() / 2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Scrolling Text");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 100);
                ScrollText scrollText = new ScrollText("Java World", 40, 2);
                frame.add(scrollText);
                frame.setVisible(true);
            }
        });
    }
}
