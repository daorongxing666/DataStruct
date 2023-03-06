// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CombineSum2.java

package backtrack;

import java.util.*;

public class CombineSum2
{

    public CombineSum2()
    {
        path = new ArrayList();
        result = new ArrayList();
    }

    public List combineSum2(int candidates[], int target)
    {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return result;
    }

    public void backtrack(int candidates[], int target, int index)
    {
        if(target == 0)
        {
            result.add(new ArrayList(path));
            return;
        }
        for(int i = index; i < candidates.length && target >= 0; i++)
            if(i <= index || candidates[i] != candidates[i - 1])
            {
                target -= candidates[i];
                path.add(Integer.valueOf(candidates[i]));
                backtrack(candidates, target, i + 1);
                Integer tag = (Integer)path.remove(path.size() - 1);
                target += tag.intValue();
            }

    }

    List path;
    List result;
}
