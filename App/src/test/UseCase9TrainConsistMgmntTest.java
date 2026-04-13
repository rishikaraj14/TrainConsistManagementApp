package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmntTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private List<Bogie> createBogies() {

        return List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );
    }

    @Test
    void testGrouping_BogiesGroupedByType() {

        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {

        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {

        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_EmptyBogieList() {

        Map<String, List<Bogie>> result =
                new ArrayList<Bogie>().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {

        List<Bogie> list =
                List.of(new Bogie("Sleeper", 72));

        Map<String, List<Bogie>> result =
                list.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, result.size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {

        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {

        Map<String, List<Bogie>> result =
                createBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {

        List<Bogie> original = new ArrayList<>(createBogies());

        Map<String, List<Bogie>> grouped =
                original.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(5, original.size());
        assertEquals(3, grouped.size());
    }
}