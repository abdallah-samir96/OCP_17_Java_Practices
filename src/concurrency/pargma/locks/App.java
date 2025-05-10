package concurrency.pargma.locks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static final int ENGLISH_CHARACTERS = 26;

    public static void main(String[] args) throws InterruptedException {
        anagram("aabb");

    }

    private static int anagram(String data) {
        if(data.isBlank() || data.length() % 2  == 1) { return -1;}
        int changes = 0;
        int mid = data.length();
        String part1 = data.substring(0, mid / 2);
        String part2 = data.substring(mid / 2);
        byte [] sequence1 = new byte[ENGLISH_CHARACTERS];
        byte [] sequence2 = new byte[ENGLISH_CHARACTERS];
        for (int i = 0; i < part1.length(); ++i) {
            int sequence1Index = (part1.charAt(i) % ENGLISH_CHARACTERS);
            int sequence2Index = (part2.charAt(i) % 26);
            sequence1[sequence1Index] = sequence1[sequence1Index] == 0? 1: ++sequence1[sequence1Index];
            sequence2[sequence2Index] = sequence2[sequence2Index] == 0? 1: ++sequence2[sequence2Index];
        }
        for (int i = 0; i < 26; i++) {
            if(sequence1[i] != 0 && sequence2[i] == 0) {
                changes += sequence1[i];
            }
        }
        System.out.println(Arrays.toString(sequence1));
        System.out.println(Arrays.toString(sequence2));
        return changes;
    }
    static void locksExample1() throws InterruptedException {
        var lockApp = new ReentrantLocks();
        var thread1 = new Thread(lockApp::calculate);
        var thread2 = new Thread(lockApp::calculate);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(ReentrantLocks.count);
    }
}
