import models.WritingRepository;
import utils.PostPagePanel;
import utils.WriteFrameGenerator;

import javax.swing.*;
import java.awt.*;

public class PostBoard {

  private JFrame frame;
  private JPanel contentPanel;

  private WritingRepository writing;
  private PostPagePanel postPagePanel;

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
    postPagePanel = new PostPagePanel(writing, contentPanel);

    frame.setVisible(true);
  }


  public void initMainPage() {
    JPanel panel = new JPanel();
    frame.add(panel, BorderLayout.PAGE_START);


    panel.add((createWritePage()));

  }


  public JButton createWritePage() {
    JButton button = new JButton("글쓰기");

    button.addActionListener(event -> {
      WriteFrameGenerator writeFrameGenerator = new WriteFrameGenerator(writing,postPagePanel,contentPanel);
      showContentPanel(postPagePanel);
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

