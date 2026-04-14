package org.howard.edu.lsp.assignment6;

// Assignment 5 - IntegerSet.java

import java.util.ArrayList;
import java.util.Collections;

/**
 * IntegerSet class models a mathematical set of integers.
 * Duplicates aren't allowed.
 */

public class IntegerSet {
    private ArrayList<Integer> set;

    /**
     * Default constructor initializes an empty set.
     */
    public IntegerSet() {
        set = new ArrayList<>();
    }

    /**
     * Clears the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * @return number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if sets are equal.
     * @param b another IntegerSet
     * @return true if both sets contain same elements
     */
    public boolean equals(IntegerSet b) {
        if (b == null) {
            return false;
        }

        if (this.length() != b.length()) {
            return false;
        }

        for (int val : this.set) {
            if (!b.set.contains(val)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if value exists in the set.
     * @param value integer to check
     * @return true if value exists
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns largest value in set.
     * @return largest integer
     * @throws IllegalStateException if set is empty
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return Collections.max(set);
    }

    /**
     * Returns smallest value in set.
     * @return smallest integer
     * @throws IllegalStateException if set is empty
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return Collections.min(set);
    }

    /**
     * Adds item to set if not already present.
     * @param item integer to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes item from set.
     * @param item integer to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Returns union of two sets.
     * @param b another IntegerSet
     * @return new set containing all elements from both sets
     */
    public IntegerSet union(IntegerSet b) {
        IntegerSet result = new IntegerSet();
        result.set.addAll(this.set);

        for (int val : b.set) {
            if (!result.set.contains(val)) {
                result.set.add(val);
            }
        }
        return result;
    }

    /**
     * Returns intersection of two sets.
     * @param b another IntegerSet
     * @return new set containing common elements
     */
    public IntegerSet intersect(IntegerSet b) {
        IntegerSet result = new IntegerSet();

        for (int val : this.set) {
            if (b.set.contains(val)) {
                result.add(val);
            }
        }
        return result;
    }

    /**
     * Returns difference (this - b).
     * @param b another IntegerSet
     * @return new set containing elements in this but not in b
     */
    public IntegerSet diff(IntegerSet b) {
        IntegerSet result = new IntegerSet();

        for (int val : this.set) {
            if (!b.set.contains(val)) {
                result.add(val);
            }
        }
        return result;
    }

    /**
     * Returns complement (b - this).
     * @param b another IntegerSet
     * @return new set containing elements in b but not in this
     */
    public IntegerSet complement(IntegerSet b) {
        IntegerSet result = new IntegerSet();

        for (int val : b.set) {
            if (!this.set.contains(val)) {
                result.add(val);
            }
        }
        return result;
    }

    /**
     * Checks if set is empty.
     * @return true if set is empty
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns string representation of set in ascending order.
     * @return formatted string
     */
    @Override
    public String toString() {
        ArrayList<Integer> temp = new ArrayList<>(set);
        Collections.sort(temp);
        return temp.toString();
    }
}

