// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Permute.java

package backtrack;

import java.util.*;

public class Permute
{

    public Permute()
    {
        result = new ArrayList();
        path = new LinkedList();
    }

    public List permute(int nums[])
    {
        if(nums.length == 0)
        {
            return result;
        } else
        {
            used = new boolean[nums.length];
            permuteHelper(nums);
            return result;
        }
    }

    private void permuteHelper(int nums[])
    {
        if(path.size() == nums.length)
        {
            result.add(new ArrayList(path));
            return;
        }
        for(int i = 0; i < nums.length; i++)
            if(!used[i])
            {
                used[i] = true;
                path.add(Integer.valueOf(nums[i]));
                permuteHelper(nums);
                path.removeLast();
                used[i] = false;
            }

    }

    List result;
    LinkedList path;
    boolean used[];
}
