// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CombineSum3.java

package backtrack;

import java.util.*;

public class CombineSum3
{

    public CombineSum3()
    {
        res = new ArrayList();
        path = new LinkedList();
    }

    public List combineSum3(int k, int n)
    {
        backTracking(n, k, 1, 0);
        return res;
    }

    private void backTracking(int targetSum, int k, int startIndex, int sum)
    {
        if(sum > targetSum)
            return;
        if(path.size() == k)
        {
            if(sum == targetSum)
                res.add(new ArrayList(path));
            return;
        }
        for(int i = startIndex; i <= (9 - (k - path.size())) + 1; i++)
        {
            path.add(Integer.valueOf(i));
            sum += i;
            backTracking(targetSum, k, i + 1, sum);
            path.removeLast();
            sum -= i;
        }

    }

    List res;
    LinkedList path;
}
