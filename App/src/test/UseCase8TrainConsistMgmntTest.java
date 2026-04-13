package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmntTest {

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
                new Bogie("General", 90)
        );
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Bogie> result =
                createBogies().stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertTrue(result.stream().anyMatch(b -> b.name.equals("Sleeper")));
        assertTrue(result.stream().anyMatch(b -> b.name.equals("General")));
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {

        List<Bogie> result =
                createBogies().stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertFalse(result.stream().anyMatch(b -> b.capacity == 70));
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {

        List<Bogie> result =
                createBogies().stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertFalse(result.stream().anyMatch(b -> b.name.equals("First Class")));
    }

    @Test
    void testFilter_MultipleBogiesMatching() {

        List<Bogie> result =
                createBogies().stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {

        List<Bogie> result =
                createBogies().stream()
                        .filter(b -> b.capacity > 200)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {

        List<Bogie> result =
                createBogies().stream()
                        .filter(b -> b.capacity > 10)
                        .collect(Collectors.toList());

        assertEquals(4, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {

        List<Bogie> result =
                new ArrayList<Bogie>().stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {

        List<Bogie> original = new ArrayList<>(createBogies());

        List<Bogie> filtered =
                original.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertEquals(4, original.size());
        assertEquals(2, filtered.size());
    }
}