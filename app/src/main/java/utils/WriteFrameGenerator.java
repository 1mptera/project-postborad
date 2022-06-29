package utils;

import models.WritingRepository;

import javax.swing.*;

public class WriteFrameGenerator extends JPanel {

  private  JLabel label;
  private WritingRepository writing ;

  public WriteFrameGenerator(WritingRepository writing, JPanel mainPage) {
    this.writing = writing;



    JFrame writeFrame = new JFrame("글쓰기");
    writeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    writeFrame.setSize(700, 700);

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
      writing.addWrite(titleText);

      String contentText = content.getText();
      writing.addContent(contentText);
      setVisible(false);

    });
    register.setBounds(550, 605, 100, 50);
    panel.add(register);


    writeFrame.setVisible(true);

  }



}
