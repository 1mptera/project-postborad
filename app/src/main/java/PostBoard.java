import models.Writing;
import utils.WriteFrameGenerator;

import javax.swing.*;
import java.awt.*;

public class PostBoard {

  private JFrame frame;
  private JPanel contentPanel;
  private JPanel mainPage;
  private Writing writing;

  public static void main(String[] args) {
    PostBoard application = new PostBoard();
    application.run();
  }

  private void run() {
    writing = new Writing();

    frame = new JFrame("게시판");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(600, 500);

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
      WriteFrameGenerator writeFrameGenerator = new WriteFrameGenerator(writing);
      contentPanel.add(writeFrameGenerator);
      frame.setVisible(true);
    });

    return button;
  }


  public void initContentPanel() {
    contentPanel = new JPanel();
    frame.add(contentPanel);
  }
}

