// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MySolveNQueens.java

package backtrack;

import java.util.*;

public class MySolveNQueens
{

    public MySolveNQueens()
    {
        path = new ArrayList();
    }

    public List solveNQueues(int n)
    {
        char checkerboard[][] = new char[n][n];
        ArrayList rules = new ArrayList(n);
        nQueueHelper(n, rules);
        return path;
    }

    public void nQueueHelper(int n, List rules)
    {
        if(path.size() == n)
            return;
        for(int i = 0; i < n; i++)
        {
            char ch[] = new char[n];
            Arrays.fill(ch, '.');
            for(int j = 0; j < n && path.size() != i + 1; j++)
            {
                int column = -1;
                if(path != null && !path.isEmpty())
                    column = ((String)path.get(path.size() - 1)).indexOf("Q") - 1;
                if(column != j && !rules.contains(Integer.valueOf(column - i)))
                {
                    ch[j] = 'Q';
                    path.add(Arrays.toString(ch));
                    rules.add(Integer.valueOf(i - j));
                }
            }

        }

    }

    ArrayList path;
}
