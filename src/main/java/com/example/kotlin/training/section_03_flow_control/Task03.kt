package com.example.kotlin.training.section_03_flow_control

class Task03 {

    /**
     * Find the longest value in values list and return it length
     * Returns 0 if list is empty
     */
    fun lengthOfLongestString(values: List<String>): Int {
        if (!values.isEmpty()) {
            return values
                .map { it.length }
                .sortedDescending()
                .first()
        }
        return 0
    }

    /**
     * Return number of value occurrences in values list
     * Function should be case insensitive
     */
    fun numberOfOccurrences(values: List<String>, value: String?): Int {
        return values
                .filter {it.equals(value, ignoreCase = true)}
                .count()
    }

    /**
     * Return sum of odd numbers
     * Returns 0 if list is empty
     */
    fun sumOfOddNumbers(values: List<Int>?): Int {
        if (values != null) {
            return values
                    .filter { it % 2 == 1 }
                    .sum()
        }
        return 0
    }

    /**
     * Returned n smallest values from the list
     * Return list should be sorted in ascending order
     */
    fun takeNSortedSmallestValues(values: List<Int>, n: Int): List<Int> {
        return values
                .sorted()
                .take(n)
    }
}