// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SubsetsWithDup.java

package backtrack;

import java.util.ArrayList;
import java.util.List;

public class SubsetsWithDup
{

    public SubsetsWithDup()
    {
        path = new ArrayList();
        result = new ArrayList();
    }

    public List subsetsWithDup(int nums[])
    {
        subsetsWithDupHelper(nums, 0);
        return result;
    }

    private void subsetsWithDupHelper(int nums[], int index)
    {
        result.add(new ArrayList(path));
        if(index > nums.length)
            return;
        for(int i = index; i < nums.length; i++)
            if(i <= index || nums[i] != nums[i - 1])
            {
                path.add(Integer.valueOf(nums[i]));
                subsetsWithDupHelper(nums, i + 1);
                path.remove(path.size() - 1);
            }

    }

    List path;
    List result;
}
