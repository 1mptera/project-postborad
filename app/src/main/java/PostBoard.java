import models.WritingRepository;
import utils.WriteFrameGenerator;

import javax.swing.*;
import java.awt.*;

public class PostBoard {

  private JFrame frame;
  private JPanel contentPanel;
  private JPanel mainPage;
  private WritingRepository writing;

  public static void main(String[] args) {
    PostBoard application = new PostBoard();
    application.run();
  }

  private void run() {
    writing = new WritingRepository();
    frame = new JFrame("게시판");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(600, 500);
    frame.setLocation(700, 0);
    initMainPage();
    initContentPanel();


    frame.setVisible(true);
  }


  public void initMainPage() {
    mainPage = new JPanel();
    frame.add(mainPage, BorderLayout.PAGE_START);


    mainPage.add((createWritePage()));
  }


  public JButton createWritePage() {
    JButton button = new JButton("글쓰기");

    button.addActionListener(event -> {
      WriteFrameGenerator writeFrameGenerator = new WriteFrameGenerator(writing , mainPage);
      showContentPanel(writeFrameGenerator);
//      mainPage.add(button);
//
//      for (String title : writing.getPostTitle()) {
//        JLabel titleLabel = new JLabel(title);
//        mainPage.add(titleLabel);
//      }
//      frame.setVisible(true);
    });

    return button;
  }


  public void initContentPanel() {
    contentPanel = new JPanel();
    frame.add(contentPanel);
  }
  public void showContentPanel(JPanel panel) {
    contentPanel.removeAll();
    contentPanel.add(panel);
    contentPanel.setVisible(false);
    contentPanel.setVisible(true);
    frame.setVisible(true);
  }
}

