package utils;

import models.Writing;

import javax.swing.*;
import java.awt.*;

public class WriteFrameGenerator extends JFrame {

  private final JFrame writeFrame;
  private Writing writing;


  public WriteFrameGenerator(Writing writing) {
    this.writing = writing;

    writeFrame = new JFrame("글쓰기");
    writeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    writeFrame.setSize(700, 700);
    writeFrame.setLocation(700,0);

    write();


    writeFrame.setVisible(true);

  }

  private void write() {
    JPanel panel = new JPanel();
    writeFrame.add(panel);
    panel.setLayout(null);

    JTextField title = new JTextField(15);
    title.setBounds(50, 10, 600, 30);
    panel.add(title);

    JTextArea content = new JTextArea();
    content.setBounds(50, 50, 600, 550);
    panel.add(content);


    JButton register = new JButton("등록");
    register.addActionListener(event -> {
      String titleText = title.getText();
      writing.getWriting(titleText);

      String contentText = content.getText();
      writing.getContent(contentText);

      setVisible(false);
      setVisible(true);
    });
    register.setBounds(550, 605, 100, 50);
    panel.add(register);

    JButton delete = new JButton("삭제하기");
    delete.addActionListener(event -> {

    });
    panel.add(delete);
    delete.setBounds(50 , 605 , 100 , 50);
  }
}
