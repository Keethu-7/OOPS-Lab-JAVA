import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

enum TrafficLightState {
    RED, YELLOW, GREEN
}

public class trafficLight extends JFrame implements ItemListener {
    private TrafficLightState currentState;

    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup buttonGroup;
    private JPanel radioPanel, lightPanel;

    public trafficLight() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentState = null;

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addItemListener(this);
        yellowButton.addItemListener(this);
        greenButton.addItemListener(this);

        radioPanel = new JPanel();
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        lightPanel = new JPanel();
        lightPanel.setPreferredSize(new Dimension(100, 300));

        setLayout(new BorderLayout());
        add(radioPanel, BorderLayout.NORTH);
        add(lightPanel, BorderLayout.CENTER);

        updateLights();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateLights() {
        lightPanel.removeAll();

        if (currentState != null) {
            switch (currentState) {
                case RED:
                    lightPanel.add(createLight(Color.RED));
                    break;
                case YELLOW:
                    lightPanel.add(createLight(Color.YELLOW));
                    break;
                case GREEN:
                    lightPanel.add(createLight(Color.GREEN));
                    break;
            }
        }

        revalidate();
        repaint();
    }

    private JPanel createLight(Color color) {
        JPanel light = new JPanel();
        light.setBackground(color);
        light.setPreferredSize(new Dimension(80, 80));
        return light;
    }


    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == redButton && redButton.isSelected()) {
            currentState = TrafficLightState.RED;
        } else if (e.getSource() == yellowButton && yellowButton.isSelected()) {
            currentState = TrafficLightState.YELLOW;
        } else if (e.getSource() == greenButton && greenButton.isSelected()) {
            currentState = TrafficLightState.GREEN;
        }

        updateLights();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new trafficLight());
    }
}




/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

enum TrafficLightState {
    RED, YELLOW, GREEN
}

public class TrafficLightSimulator extends JFrame implements ItemListener {
    private TrafficLightState currentState;

    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup buttonGroup;
    private JPanel radioPanel, lightPanel;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentState = TrafficLightState.RED;

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addItemListener(this);
        yellowButton.addItemListener(this);
        greenButton.addItemListener(this);

        radioPanel = new JPanel();
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        lightPanel = new JPanel();
        lightPanel.setPreferredSize(new Dimension(100, 300));

        setLayout(new BorderLayout());
        add(radioPanel, BorderLayout.NORTH);
        add(lightPanel, BorderLayout.CENTER);

        updateLights();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateLights() {
        lightPanel.removeAll();

        switch (currentState) {
            case RED:
                lightPanel.add(createLight(Color.RED));
                break;
            case YELLOW:
                lightPanel.add(createLight(Color.YELLOW));
                break;
            case GREEN:
                lightPanel.add(createLight(Color.GREEN));
                break;
        }

        revalidate();
        repaint();
    }

    private JPanel createLight(Color color) {
        JPanel light = new JPanel();
        light.setBackground(color);
        light.setPreferredSize(new Dimension(80, 80));
        return light;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == redButton && redButton.isSelected()) {
            currentState = TrafficLightState.RED;
        } else if (e.getSource() == yellowButton && yellowButton.isSelected()) {
            currentState = TrafficLightState.YELLOW;
        } else if (e.getSource() == greenButton && greenButton.isSelected()) {
            currentState = TrafficLightState.GREEN;
        }

        updateLights();
    }
*/
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TrafficLightSimulator());
    }
}
