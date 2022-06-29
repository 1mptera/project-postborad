package models;

import java.util.ArrayList;
import java.util.List;

public class Writing {

  private List<String> titleList = new ArrayList<>();
  private List<String> contentList = new ArrayList<>();

  public void getWriting(String titleText) {
    titleList.add(titleText);
  }

  public List<String> postTitleText() {
    return titleList;
  }

  public void getContent(String contentText) {
    contentList.add(contentText);
  }

  public List<String> postContentList() {
    return contentList;
  }


}
