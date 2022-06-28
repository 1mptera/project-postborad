package utils;

import javax.swing.*;

public class WriteFrameGenerator extends JPanel {



 private final JPanel mainPage;


 public WriteFrameGenerator(JPanel mainPage) {
  this.mainPage = mainPage;

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
   JLabel label = new JLabel(titleText);
   mainPage.add(label);
   setVisible(false);
   setVisible(true);

   //todo textfield의 내용이 메인페이지에 출력
  });
  register.setBounds(550, 605, 100, 50);
  panel.add(register);


  writeFrame.setVisible(true);

 }

  public WriteFrameGenerator() {
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



      //todo textfield의 내용이 메인페이지에 출력
    });
    register.setBounds(550, 605, 100, 50);
    panel.add(register);


    writeFrame.setVisible(true);


  }


}
