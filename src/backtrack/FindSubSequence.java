// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FindSubSequence.java

package backtrack;

import java.util.ArrayList;
import java.util.List;

public class FindSubSequence
{

    public FindSubSequence()
    {
        path = new ArrayList();
        res = new ArrayList();
    }

    public List findSubsequences(int nums[])
    {
        backtracking(nums, 0);
        return res;
    }

    public void backtracking(int nums[], int index)
    {
        if(path.size() > 1)
            res.add(new ArrayList(path));
        int used[] = new int[201];
        for(int i = index; i < nums.length; i++)
            if((path.isEmpty() || nums[i] >= ((Integer)path.get(path.size() - 1)).intValue()) && used[nums[i]] != 1)
            {
                used[nums[i]] = 1;
                path.add(Integer.valueOf(nums[i]));
                backtracking(nums, i + 1);
                path.remove(path.size() - 1);
            }

    }

    private List path;
    private List res;
}
