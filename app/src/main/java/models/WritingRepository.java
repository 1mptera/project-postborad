package models;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WritingRepository extends JPanel {

  private List<String> postTitle = new ArrayList<>();
  private List<String> postContent = new ArrayList<>();
  private String contentText;
  private String titleText;
  private int index;


  public void addWrite(String titleText) {
    this.titleText = titleText;
    this.postTitle.add(titleText);

  }

  public void addContent(String contentText) {
    this.contentText = contentText;
    postContent.add(contentText);
  }

  public String getPostTitle(int index) {
    this.index = index;

    return postTitle.get(index);
  }

  public String getPostContent(int index) {
    this.index = index;
    return postContent.get(index);
  }


  public List<String> getPostTitleList() {

    return postTitle;
  }

  public List<String> getPostContentList() {
    return postContent;
  }

  public void deleteTitleandContent(int index) {
    postTitle.remove(index);
    postContent.remove(index);

  }

  public void modifyTitleandContent(int index, String receivedContentText, String receivedTitleText) {
    for (int i = 0; i < postTitle.size(); i += 1) {
      if (postTitle.get(i).equals(postTitle.get(index))) {
        postTitle.set(i, receivedTitleText);
      }
    }
    for (int i = 0; i < postContent.size(); i += 1) {
      if (postContent.get(i).equals(postContent.get(index))) {
        postContent.set(i, receivedContentText);
      }
    }
  }
}
