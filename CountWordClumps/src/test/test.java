package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import sqa.main.CountWordClumps;

public class test {

    @Test
    @DisplayName("TC1: Should return 0 for a null array to cover C1.1=True")
    void testCountClumps_NullArray_ShouldReturnZero() {
        int expected = 0;
        int actual = CountWordClumps.countClumps(null);
        assertEquals(expected, actual, "A null array should result in 0 clumps.");
    }

    @Test
    @DisplayName("TC2: Should return 0 for an empty array to cover C1.2=True")
    void testCountClumps_EmptyArray_ShouldReturnZero() {
        int[] nums = {};
        int expected = 0;
        int actual = CountWordClumps.countClumps(nums);
        assertEquals(expected, actual, "An empty array should result in 0 clumps.");
    }

    @Test
    @DisplayName("TC3: Should return 1 for {1,1,1,2,3} to cover all remaining conditions")
    void testCountClumps_ComplexCase_CoversAllConditions() {
        int[] nums = {1, 1, 1, 2, 3};
        int expected = 1;
        int actual = CountWordClumps.countClumps(nums);
        assertEquals(expected, actual, "The array {1,1,1,2,3} should have 1 clump.");
    }
}