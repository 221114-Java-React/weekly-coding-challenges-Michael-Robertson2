package com.revature.problem2;

import java.util.*;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        PriorityQueue<String> result = new PriorityQueue<>();
        String query = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            String cur = list.get(i);
            if (cur.indexOf(query) == 0)
                result.add(cur);
        }

        return new ArrayList<>(result);
    }
}
