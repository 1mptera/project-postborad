package models;

import javax.swing.*;
import java.awt.*;

public class TasksPanel extends JPanel {

  public TasksPanel(JTextField textField) {

    JLabel label = new JLabel();
    label.setText(textField.getText());
    this.add(label);
    JButton button = new JButton("X");
    button.addActionListener(event -> { remove(label); remove(button);
      this.setVisible(false);
      this.setVisible(true);
    });
    this.add(button);
    JFrame frame = new JFrame("글쓰기");


  }

}



