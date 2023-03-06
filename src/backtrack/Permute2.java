// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Permute2.java

package backtrack;

import java.util.*;

public class Permute2
{

    public Permute2()
    {
        result = new ArrayList();
        path = new ArrayList();
    }

    public List permuteUnique(int nums[])
    {
        boolean used[] = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backTrack(nums, used);
        return result;
    }

    private void backTrack(int nums[], boolean used[])
    {
        if(path.size() == nums.length)
        {
            result.add(new ArrayList(path));
            return;
        }
        for(int i = 0; i < nums.length; i++)
            if((i <= 0 || nums[i] != nums[i - 1] || used[i - 1]) && !used[i])
            {
                used[i] = true;
                path.add(Integer.valueOf(nums[i]));
                backTrack(nums, used);
                path.remove(path.size() - 1);
                used[i] = false;
            }

    }

    List result;
    List path;
}
