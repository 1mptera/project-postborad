package utils;

import models.WritingRepository;

import javax.swing.*;

public class DetailPage extends JFrame {
  private JFrame detailPageFrame;
  private WritingRepository writingRepository;
  private JLabel postTitle;

  public DetailPage(WritingRepository writingRepository) {
    this.writingRepository = writingRepository;
    detailPageFrame = new JFrame("상세 페이지");
    detailPageFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    detailPageFrame.setSize(600, 600);

    showContent();
    initButton();

    detailPageFrame.setVisible(true);

  }

  private void showContent() {

    JPanel contentPanel = new JPanel();
    detailPageFrame.add(contentPanel);
    contentPanel.setLayout(null);

    contentPanel.add(content());
    contentPanel.setEnabled(false);

  }

  private void initButton() {
    JPanel buttonPanel = new JPanel();
    detailPageFrame.add(buttonPanel);
    buttonPanel.setLayout(null);

    buttonPanel.add(deleteButton());
    buttonPanel.add(modifyButton());
  }

  public JLabel content() {
    for (String post : writingRepository.getPostTitle()) {
      postTitle = new JLabel(post);
      this.add(postTitle);
    }
      postTitle.setBounds(10,10,500,400);


    return postTitle;
  }

  public JButton modifyButton() {
    JButton modifyButton = new JButton("수정하기");
    modifyButton.setBounds(530,700,100,40);
    modifyButton.addActionListener(event -> {

    });
    return modifyButton;
  }

  public JButton deleteButton() {
    JButton deleteButton = new JButton();
    deleteButton.addActionListener(event -> {

    });
    return deleteButton;
  }
}
