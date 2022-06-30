package utils;

import models.WritingRepository;

import javax.swing.*;

public class WriteFrameGenerator extends JPanel {

  private final PostPagePanel postPagePanel;
  private final JPanel contentPanel;
  private  JLabel label;
  private WritingRepository writingRepository ;

  public WriteFrameGenerator(WritingRepository writingRepository, PostPagePanel postPagePanel, JPanel contentPanel) {
    this.writingRepository = writingRepository;
    this.postPagePanel = postPagePanel;
    this.contentPanel = contentPanel;

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
    content.setLineWrap(true);
    panel.add(content);

    JButton register = new JButton("등록");
    register.addActionListener(event -> {
      String titleText = title.getText();
      writingRepository.addWrite(titleText);

      String contentText = content.getText();
      writingRepository.addContent(contentText);

      postPagePanel.removeAll();

      postPagePanel.postTitleLabel(writingRepository);

      contentPanel.setVisible(false);
      contentPanel.setVisible(true);

      writeFrame.setVisible(false);

    });
    register.setBounds(550, 605, 100, 50);
    panel.add(register);


    writeFrame.setVisible(true);

  }



}
