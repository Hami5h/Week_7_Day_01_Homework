package example.codeclan.com.dependencyinversion;

/**
 * Created by user on 27/06/2017.
 */

import junit.framework.Assert;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

    Bear bear;
    Diary diary;


//   @Test
//    public void testWriteToDiary(){
//       Diary diary = new Diary();
//        diary.write("Dear diary, mood: apathetic...");
//        assertEquals("Dear diary, mood: apathetic...", diary.readLast());
//    }

    @Test
    public void hasSomethingToWriteOn() {
        Bear bear = new Bear(diary);
        assertEquals(diary, bear.getInstrumentToWriteOn());
    }

    @Test
    public  void testBearWritesToDiary() {
        Diary diary = new Diary();
        Bear bear = new Bear(diary);
        bear.write("I can write");
        assertEquals("I can write", diary.readLast());
    }


}