import models.TasksPanel;

import javax.swing.*;
import java.awt.*;

public class PostBoard {
  private JFrame frame;
  private JTextField textField;
  private JPanel contentPanel;

  public static void main(String[] args) {
    PostBoard application = new PostBoard();
    application.run();
  }

  private void run() {
    frame = new JFrame("게시판");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(600,500);

    mainPage();
    initContentPanel();


    frame.setVisible(true);
  }

  public void mainPage() {
    JPanel panel = new JPanel();
    frame.add(panel, BorderLayout.PAGE_START);

    textField = new JTextField(10);

    panel.add(textField);
    panel.add(createTask());



  }

  public JButton createTask() {
    JButton button = new JButton("create");
    button.addActionListener(event -> {
      TasksPanel tasksPanel = new TasksPanel(textField);
      contentPanel.add(tasksPanel);
      frame.setVisible(true);
    });

    return button;
  }

  public void initContentPanel() {
    contentPanel = new JPanel();
    frame.add(contentPanel);
  }
}
