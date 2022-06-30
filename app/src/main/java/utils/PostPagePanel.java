package utils;

import models.WritingRepository;

import javax.swing.*;

public class PostPagePanel extends JPanel {
  private WritingRepository writingRepository;
  private JPanel contentPanel;

  public PostPagePanel(WritingRepository writingRepository , JPanel contentPanel) {
    this.writingRepository = writingRepository;
    this.contentPanel = contentPanel;
    postTitleLabel(writingRepository);
  }

  public void postTitleLabel(WritingRepository writingRepository) {
    for (String title : writingRepository.getPostTitle()) {
      JLabel titleLabel = new JLabel(title);
        this.add(titleLabel);
      }
  }
}
