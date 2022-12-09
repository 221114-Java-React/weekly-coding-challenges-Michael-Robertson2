package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String result = "";
        Map<String, Integer> map = new HashMap();
        String[] words = sentence.split("\\s+");

        for (String w : words) {
            w = w.toLowerCase();
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }

        PriorityQueue<String> queue = new PriorityQueue<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                queue.add(entry.getKey());
        }

        for (String w : queue)
            result += w + ": " + map.get(w) + "\n";

        StringBuilder builder = new StringBuilder(result);
        builder.deleteCharAt(result.length()-1);

        return builder.toString();
    }
}
