package utils;

import models.WritingRepository;

import javax.swing.*;
import java.awt.*;

public class DetailPage extends JFrame {
  private JFrame detailPageFrame;
  private WritingRepository writingRepository;
  private int index;
  private JTextField postTitle;
  private JTextArea postContent;

  public DetailPage(WritingRepository writingRepository, int index) {
    this.writingRepository = writingRepository;
    this.index = index;


    detailPageFrame = new JFrame("상세 페이지");
    detailPageFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    detailPageFrame.setSize(700 , 700);

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
    System.out.println(writingRepository.getPostTitle(index));
    postTitle.setBounds(50,10,600,30);

    return postTitle;
  }

  public JTextArea content() {
    postContent = new JTextArea(writingRepository.getPostContent(index));
    System.out.println(writingRepository.getPostContent(index));
    postContent.setBounds(50,50,600,550);
    postContent.setLineWrap(true);

    return postContent;
  }

  public JButton modifyButton() {
    JButton modifyButton = new JButton("수정하기");
    modifyButton.setBounds(550, 605, 100, 50);
    modifyButton.addActionListener(event -> {
      // 어떤일이 일어나야하나 리스트에서 삭제를 해준다.
      //todo 내용을 수정할 수있음
    });
    return modifyButton;
  }

  public JButton deleteButton() {
    JButton deleteButton = new JButton("삭제하기");
    deleteButton.setBounds(450, 605, 100, 50);
    deleteButton.addActionListener(event -> {
      //todo
    });
    return deleteButton;
  }
}
