package utils;

import models.WritingRepository;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PostPagePanel extends JPanel {
  private WritingRepository writingRepository;
  private JPanel contentPanel;

  public PostPagePanel(WritingRepository writingRepository , JPanel contentPanel) {
    this.writingRepository = writingRepository;
    this.contentPanel = contentPanel;
    postTitleLabel(writingRepository);
  }

  public void postTitleLabel(WritingRepository writingRepository) {
    for(int i = 0; i<writingRepository.getPostTitleList().size(); i+=1) {
      JLabel titleLabel = new JLabel(writingRepository.getPostTitle(i));
        this.add(titleLabel);

      int finalI = i;
      titleLabel.addMouseListener(new MouseAdapter() {
          public void mouseClicked(MouseEvent e) {
            JFrame detailPage = new DetailPage(writingRepository, finalI);
          }
        });
      }
  }
}
