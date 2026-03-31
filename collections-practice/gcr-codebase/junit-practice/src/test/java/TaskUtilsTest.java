import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class TaskUtilsTest {

    TaskUtils utils = new TaskUtils();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        utils.longRunningTask(); // This will fail because task sleeps 3s
    }
}
