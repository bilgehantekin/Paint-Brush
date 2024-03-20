import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import java.util.ArrayList;

class UpperPanel extends JPanel implements MouseInputListener {

    private JPanel blue = new JPanel();
    private JPanel red = new JPanel();
    private JPanel green = new JPanel();
    private JPanel yellow = new JPanel();
    private JPanel orange = new JPanel();
    private JPanel magenta = new JPanel();
    private JPanel black = new JPanel();
    private JPanel colors = new JPanel();
    private JPanel buttons = new JPanel();
    private JPanel space1 = new JPanel();

    private JButton button1 = new JButton("Dikdörtgen Çiz");
    private JButton button2 = new JButton("Oval Çiz");
    private JButton button3 = new JButton("Kalemle Çiz");
    private JButton button4 = new JButton("Taşı");

    public UpperPanel() {
        GridLayout gridLayout = new GridLayout(3, 1, 0, 15);
        setLayout(gridLayout);


        design();
        colors();
        buttons();
        add(colors);
        add(buttons);
        add(space1);
        setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLUE));

    }

    public void colors() {

        blue.setBackground(Color.BLUE);
        blue.addMouseListener(this);

        red.setBackground(Color.RED);
        red.addMouseListener(this);

        green.setBackground(Color.GREEN);
        green.addMouseListener(this);

        yellow.setBackground(Color.YELLOW);
        yellow.addMouseListener(this);

        orange.setBackground(Color.ORANGE);
        orange.addMouseListener(this);

        magenta.setBackground(Color.MAGENTA);
        magenta.addMouseListener(this);

        black.setBackground(Color.BLACK);
        black.addMouseListener(this);
    }
    public void buttons() {
        button1.addActionListener(e -> PainterPanel.selectedButton = 1);
        button1.setBackground(Color.LIGHT_GRAY);
        button2.addActionListener(e -> PainterPanel.selectedButton = 2);
        button2.setBackground(Color.LIGHT_GRAY);
        button3.addActionListener(e -> PainterPanel.selectedButton = 3);
        button3.setBackground(Color.LIGHT_GRAY);
        button4.addActionListener(e -> PainterPanel.selectedButton = 4);
        button4.setBackground(Color.LIGHT_GRAY);
    }
    public void design() {

        colors.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));

        blue.setPreferredSize(new Dimension(120, 45));
        red.setPreferredSize(new Dimension(120, 45));
        green.setPreferredSize(new Dimension(120, 45));
        yellow.setPreferredSize(new Dimension(120, 45));
        orange.setPreferredSize(new Dimension(120, 45));
        magenta.setPreferredSize(new Dimension(120, 45));
        black.setPreferredSize(new Dimension(120, 45));

        blue.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));
        red.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));
        green.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));
        yellow.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));
        orange.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));
        magenta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));
        black.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.PINK));

        colors.add(blue);
        colors.add(red);
        colors.add(green);
        colors.add(yellow);
        colors.add(orange);
        colors.add(magenta);
        colors.add(black);

        colors.setPreferredSize(new Dimension(120, 45));

        buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));

        button1.setPreferredSize(new Dimension(195, 65));
        button2.setPreferredSize(new Dimension(195, 65));
        button3.setPreferredSize(new Dimension(195, 65));
        button4.setPreferredSize(new Dimension(195, 65));

        button1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        button2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        button3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        button4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Font font1 = button1.getFont();
        Font font2 = button2.getFont();
        Font font3 = button3.getFont();
        Font font4 = button4.getFont();
        Font fonted1 = new Font(font1.getName(), Font.BOLD, font1.getSize() + 4);
        Font fonted2 = new Font(font2.getName(), Font.BOLD, font2.getSize() + 4);
        Font fonted3 = new Font(font3.getName(), Font.BOLD, font3.getSize() + 4);
        Font fonted4 = new Font(font4.getName(), Font.BOLD, font4.getSize() + 4);
        button1.setFont(fonted1);
        button2.setFont(fonted2);
        button3.setFont(fonted3);
        button4.setFont(fonted4);

        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);

        buttons.setPreferredSize(new Dimension(195, 65));


    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == blue) {
            PainterPanel.chosenColor = Color.BLUE;
        }
        else if(e.getSource() == red) {
            PainterPanel.chosenColor = Color.RED;
        }
        else if(e.getSource() == green) {
            PainterPanel.chosenColor = Color.GREEN;
        }
        else if(e.getSource() == yellow) {
            PainterPanel.chosenColor = Color.YELLOW;
        }
        else if(e.getSource() == orange) {
            PainterPanel.chosenColor = Color.ORANGE;
        }
        else if(e.getSource() == magenta) {
            PainterPanel.chosenColor = Color.MAGENTA;
        }
        else if(e.getSource() == black) {
            PainterPanel.chosenColor = Color.BLACK;
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

class PainterPanel extends JPanel implements MouseInputListener {

    private ArrayList<Object> shapes = new ArrayList<>();
    private ArrayList<Color> colors = new ArrayList<>();
    static Color chosenColor = Color.BLACK;
    static int selectedButton = 0;
    private int [] firstPoints = new int[2];
    private int [] lastPoints = new int[2];
    private int [] termPoints = new int[2];
    private boolean within_shape = false;
    private int x;
    private int y;
    private int width;
    private int height;
    private int index;
    private Color movedColor;
    private Object movedShape;

    public PainterPanel() {
        setPreferredSize(new Dimension(500, 450));
        addMouseListener(this);
        addMouseMotionListener(this);

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i) instanceof Rectangle) {
                g.setColor(colors.get(i));
                g.fillRect(((Rectangle) shapes.get(i)).x, ((Rectangle) shapes.get(i)).y, ((Rectangle) shapes.get(i)).width, ((Rectangle) shapes.get(i)).height);
            }
            if(shapes.get(i) instanceof Oval) {
                g.setColor(colors.get(i));
                g.fillOval(((Oval) shapes.get(i)).getX(), ((Oval) shapes.get(i)).getY(), ((Oval) shapes.get(i)).getW(), ((Oval) shapes.get(i)).getH());
            }
            if(shapes.get(i) instanceof ArrayList<?>) {
                Graphics2D g2d = (Graphics2D) g;
                g.setColor(colors.get(i));
                g2d.setStroke(new BasicStroke(3));
                g.drawLine(((ArrayList<Integer>) shapes.get(i)).get(0), ((ArrayList<Integer>) shapes.get(i)).get(1), ((ArrayList<Integer>) shapes.get(i)).get(2), ((ArrayList<Integer>) shapes.get(i)).get(3));
            }
        }



        if(selectedButton == 1) {
            g.setColor(chosenColor);
            g.fillRect(Math.min(firstPoints[0], lastPoints[0]), Math.min(firstPoints[1], lastPoints[1]), Math.abs(firstPoints[0] - lastPoints[0]), Math.abs(firstPoints[1] - lastPoints[1]));
        }
        if(selectedButton == 2) {
            g.setColor(chosenColor);
            g.fillOval(Math.min(firstPoints[0], lastPoints[0]), Math.min(firstPoints[1], lastPoints[1]), Math.abs(firstPoints[0] - lastPoints[0]), Math.abs(firstPoints[1] - lastPoints[1]));
        }
        if(selectedButton == 3) {
            g.drawLine(firstPoints[0], firstPoints[1], lastPoints[0], lastPoints[1]);
        }
        if(selectedButton == 4) {

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(selectedButton == 1 || selectedButton == 2) {
            firstPoints[0] = e.getX();
            firstPoints[1] = e.getY();
        }
        if(selectedButton == 3) {
            firstPoints[0] = e.getX();
            firstPoints[1] = e.getY();
        }
        if(selectedButton == 4) {
            for(int i = 0; i < shapes.size(); i++) {
                if(shapes.get(i) instanceof Rectangle) {
                    if(e.getX() >= ((Rectangle) shapes.get(i)).x && e.getX() <= (((Rectangle) shapes.get(i)).x + ((Rectangle) shapes.get(i)).width) && e.getY() >= ((Rectangle) shapes.get(i)).y && e.getY() <= (((Rectangle) shapes.get(i)).y + ((Rectangle) shapes.get(i)).height)) {
                        index = i;
                        movedShape = shapes.get(i);
                        movedColor = colors.get(i);
                        x = ((Rectangle) shapes.get(i)).x;
                        y = ((Rectangle) shapes.get(i)).y;
                        width = ((Rectangle) shapes.get(i)).width;
                        height = ((Rectangle) shapes.get(i)).height;
                        termPoints[0] = e.getX();
                        termPoints[1] = e.getY();
                        within_shape = true;
                    }
                }
                if(shapes.get(i) instanceof Oval) {
                    if(((Oval) shapes.get(i)).isInside(e.getX(), e.getY())) {
                        index = i;
                        movedShape = shapes.get(i);
                        movedColor = colors.get(i);
                        x = ((Oval) shapes.get(i)).getX();
                        y = ((Oval) shapes.get(i)).getY();
                        width = ((Oval) shapes.get(i)).getW();
                        height = ((Oval) shapes.get(i)).getH();
                        termPoints[0] = e.getX();
                        termPoints[1] = e.getY();
                        within_shape = true;
                    }
                }
            }
            if(within_shape) {
                shapes.remove(index);
                colors.remove(index);
                shapes.add(movedShape);
                colors.add(movedColor);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(selectedButton == 1) {
            lastPoints[0] = e.getX();
            lastPoints[1] = e.getY();
            colors.add(chosenColor);
            shapes.add(new Rectangle(Math.min(firstPoints[0], lastPoints[0]), Math.min(firstPoints[1], lastPoints[1]),
                    Math.abs(firstPoints[0] - lastPoints[0]), Math.abs(firstPoints[1] - lastPoints[1])));
            repaint();
        }
        if(selectedButton == 2) {
            lastPoints[0] = e.getX();
            lastPoints[1] = e.getY();
            colors.add(chosenColor);
            shapes.add(new Oval(Math.min(firstPoints[0], lastPoints[0]), Math.min(firstPoints[1], lastPoints[1]),
                    Math.abs(firstPoints[0] - lastPoints[0]), Math.abs(firstPoints[1] - lastPoints[1])));
            repaint();
        }
        if(selectedButton == 4) {
            within_shape = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(selectedButton == 1 || selectedButton == 2) {
            lastPoints[0] = e.getX();
            lastPoints[1] = e.getY();
            repaint();
        }
        if(selectedButton == 3) {
            Graphics g = getGraphics();
            Graphics2D g2d = (Graphics2D) g;
            g.setColor(chosenColor);
            g2d.setStroke(new BasicStroke(3));
            int lastX = e.getX();
            int lastY = e.getY();
            ArrayList<Integer> lines = new ArrayList<>();
            ArrayList<Color> lineColors = new ArrayList<>();
            lines.add(firstPoints[0]);
            lines.add(firstPoints[1]);
            lines.add(lastX);
            lines.add(lastY);
            lineColors.add(chosenColor);
            lineColors.add(chosenColor);
            lineColors.add(chosenColor);
            lineColors.add(chosenColor);
            shapes.add(lines);
            colors.add(chosenColor);
            g.drawLine(firstPoints[0], firstPoints[1], lastX, lastY);
            firstPoints[0] = lastX;
            firstPoints[1] = lastY;
        }
        if(selectedButton == 4) {
            if(within_shape) {
                int termX = e.getX() - termPoints[0];
                int termY = e.getY() - termPoints[1];
                x += termX;
                y += termY;
                termPoints[0] = e.getX();
                termPoints[1] = e.getY();
                shapes.remove(shapes.size() - 1);
                colors.remove(colors.size() - 1);
                if(movedShape instanceof Rectangle) {
                    shapes.add(new Rectangle(x, y, width, height));
                    colors.add(movedColor);
                }
                else if(movedShape instanceof Oval) {
                    shapes.add(new Oval(x, y, width, height));
                    colors.add(movedColor);
                }
                repaint();
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(selectedButton == 3) {
            firstPoints[0] = e.getX();
            firstPoints[1] = e.getY();
        }
    }

}
class Oval {
    private int x;
    private int y;
    private int w;
    private int h;

    public Oval(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
    public boolean isInside(int a, int b) {
        int centerX = x + (w / 2);
        int centerY = y + (h / 2);
        double rX = w / 2;
        double rY = h / 2;
        double axisX = ((double)(a - centerX)) / rX;
        double axisY = ((double)(b - centerY)) / rY;
        if(Math.pow(axisX, 2) + Math.pow(axisY, 2) <= 1) {
            return true;
        }
        return false;
    }
}

class Frame extends JFrame {
    JPanel upper = new UpperPanel();
    JPanel painter = new PainterPanel();

    public Frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 800);
        getContentPane().add(upper, BorderLayout.NORTH);
        getContentPane().add(painter, BorderLayout.CENTER);
        setVisible(true);
    }
}

public class PaintBrush {
    public static void main(String[] args) {
        new Frame();
    }
}
