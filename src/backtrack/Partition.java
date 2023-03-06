// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Partition.java

package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Partition
{

    public Partition()
    {
        path = new ArrayList();
        result = new ArrayList();
    }

    public List partition(String s)
    {
        backtrack(s, 0);
        return result;
    }

    public void backtrack(String s, int index)
    {
        if(index > s.length() - 1)
        {
            result.add(new ArrayList(path));
            return;
        }
        for(int i = index; i < s.length(); i++)
            if(isPalindrome(s, index, i))
            {
                path.add(s.substring(index, i + 1));
                backtrack(s, i + 1);
                path.remove(path.size() - 1);
            }

    }

    public boolean isPalindrome(String s, int begin, int end)
    {
        int i = begin;
        for(int j = end; i < j; j--)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
        }

        return true;
    }

    List path;
    List result;
}
