// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Subsets.java

package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Subsets
{

    public Subsets()
    {
        set = new ArrayList();
        result = new ArrayList();
    }

    public List subsets(int nums[])
    {
        backstack(nums, 0);
        return result;
    }

    public void backstack(int nums[], int index)
    {
        result.add(new ArrayList(set));
        if(index > nums.length)
            return;
        for(int i = index; i < nums.length; i++)
        {
            set.add(Integer.valueOf(nums[i]));
            backstack(nums, i + 1);
            set.remove(set.size() - 1);
        }

    }

    public List set;
    public List result;
}
