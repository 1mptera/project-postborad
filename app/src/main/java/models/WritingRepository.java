package models;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WritingRepository extends JPanel {

  private List<String> postTitle = new ArrayList<>();
  private List<String> postContent = new ArrayList<>();

  public void addWrite(String titleText) {

    this.postTitle.add(titleText);

  }
  public List<String> getPostTitle() {
    return postTitle;
  }

  public void addContent(String contentText) {
    postContent.add(contentText);
  }

  public List<String> getPostContent() {
    return postContent;
  }
}
