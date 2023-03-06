// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CombineSum1.java

package backtrack;

import java.util.*;

public class CombineSum1
{

    public CombineSum1()
    {
        result = new ArrayList();
        path = new LinkedList();
    }

    public List combineSum1(int candidates[], int target)
    {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0);
        return result;
    }

    public void backtrack(int candidates[], int target, int sum, int index)
    {
        if(sum == target)
        {
            result.add(new ArrayList(path));
            return;
        }
        for(int i = index; i < candidates.length && sum + candidates[i] <= target; i++)
        {
            sum += candidates[i];
            path.add(Integer.valueOf(candidates[i]));
            backtrack(candidates, target, sum, i);
            Integer last = (Integer)path.removeLast();
            sum -= last.intValue();
        }

    }

    public List result;
    public LinkedList path;
}
