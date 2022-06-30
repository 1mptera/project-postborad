package models;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WritingRepository extends JPanel {

  private List<String> postTitle = new ArrayList<>();
  private List<String> postContent = new ArrayList<>();

  public String getPostTitleKey(String post) {
    return null;
  }

  public void addWrite(String titleText) {

    this.postTitle.add(titleText);

  }

  public void addContent(String contentText) {
    postContent.add(contentText);
  }

  public String getPostTitle(int i) {

    return postTitle.get(i);
  }

  public String getPostContent(int i){
    return postContent.get(i);
  }


  public List<String> getPostTitleList() {

    return postTitle;
  }

  public List<String> getPostContentList() {
    return postContent;
  }
}
