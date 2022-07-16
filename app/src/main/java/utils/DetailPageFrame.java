package utils;

import models.WritingRepository;

import javax.swing.*;

public class DetailPageFrame extends JFrame {
  private JFrame detailPageFrame;
  private WritingRepository writingRepository;
  private int index;
  private JPanel contentPanel;
  private PostPagePanel postPagePanel;
  private JTextField postTitle;
  private JTextArea postContent;


  public DetailPageFrame(WritingRepository writingRepository, int index, JPanel contentPanel, PostPagePanel postPagePanel) {
    this.writingRepository = writingRepository;
    this.index = index;
    this.contentPanel = contentPanel;
    this.postPagePanel = postPagePanel;


    detailPageFrame = new JFrame("상세 페이지");
    detailPageFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    detailPageFrame.setSize(700, 700);

    showContent();


    detailPageFrame.setVisible(true);

  }


  private void showContent() {

    JPanel contentPanel = new JPanel();
    detailPageFrame.add(contentPanel);
    contentPanel.setLayout(null);

    contentPanel.add(title());
    contentPanel.add(content());
    contentPanel.add(deleteButton());
    contentPanel.add(modifyButton());

  }

  public JTextField title() {
    postTitle = new JTextField(writingRepository.getPostTitle(index));
    postTitle.setBounds(50, 10, 600, 30);


    return postTitle;
  }

  public JTextArea content() {
    postContent = new JTextArea(writingRepository.getPostContent(index));
    postContent.setBounds(50, 50, 600, 550);
    postContent.setLineWrap(true);


    return postContent;
  }

  public JButton modifyButton() {
    JButton modifyButton = new JButton("수정하기");
    modifyButton.setBounds(550, 605, 100, 50);
    modifyButton.addActionListener(event -> {
      writingRepository.modifyTitleandContent(index, postContent.getText()
          , postTitle.getText());


      contentPanel.setVisible(false);
      contentPanel.setVisible(true);
      detailPageFrame.setVisible(false);

    });
    return modifyButton;
  }

  public JButton deleteButton() {
    JButton deleteButton = new JButton("삭제하기");
    deleteButton.setBounds(450, 605, 100, 50);
    deleteButton.addActionListener(event -> {

      writingRepository.deleteTitleandContent(index);

      contentPanel.removeAll();
      contentPanel.setVisible(false);
      contentPanel.setVisible(true);
      contentPanel.add(postPagePanel);
      detailPageFrame.setVisible(false);

    });
    return deleteButton;
  }
}
