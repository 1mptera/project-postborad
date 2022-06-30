package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WritingRepositoryTest {
  @Test
   void addTitle() {
    WritingRepository writingRepository = new WritingRepository();

    writingRepository.addWrite("2");
    writingRepository.addWrite("1");
    assertEquals(2 , writingRepository.getPostTitle().size());
  }




}