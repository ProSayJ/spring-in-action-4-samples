package prosayj.thinking.spring4.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;
import prosayj.thinking.spring4.knights.service.Task;
import prosayj.thinking.spring4.knights.service.impl.BraveKnight;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Task mockQuest = mock(Task.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.find();
        verify(mockQuest, times(1)).doTask();
    }

}
