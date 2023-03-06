// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   backtrackTest.java

import backtrack.*;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

public class backtrackTest
{


    @Test
    public void TestCombine()
    {
        CombineSum1 c = new CombineSum1();
        List combine = c.combineSum1(new int[]{4,2}, 2);
        System.out.println(combine);
    }
    @Test
    public void TestCombineSum3()
    {
        CombineSum3 c = new CombineSum3();
        List combine = c.combineSum3(3, 7);
        System.out.println(combine);
    }
    @Test
    public void TestLetterCombinations()
    {
        LetterCombinations letterCombinations = new LetterCombinations();
        List strings = letterCombinations.letterCombinations("3456");
        System.out.println(strings);
    }
    @Test
    public void TestCombineSum1()
    {
        CombineSum1 c = new CombineSum1();
        List combine = c.combineSum1(new int[] {
            2, 4, 3, 7
        }, 7);
        System.out.println(combine);
    }
    @Test
    public void TestCombineSum2()
    {
        CombineSum2 c = new CombineSum2();
        List combine = c.combineSum2(new int[] {
            10, 1, 2, 7, 6, 1, 5
        }, 8);
        System.out.println(combine);
    }
    @Test
    public void TestPartition()
    {
        Partition c = new Partition();
        List combine = c.partition("aab");
        System.out.println(combine);
    }
    @Test
    public void TestRestoreIpAddresses()
    {
        RestoreIpAddresses c = new RestoreIpAddresses();
        List combine = c.restoreIpAddresses("101023");
        System.out.println(combine);
    }
    @Test
    public void TestSubSet()
    {
        Subsets c = new Subsets();
        List combine = c.subsets(new int[] {
            1, 2, 3
        });
        System.out.println(combine);
    }
    @Test
    public void TestSubSetsWithDup()
    {
        SubsetsWithDup c = new SubsetsWithDup();
        List combine = c.subsetsWithDup(new int[] {
            1, 2, 2
        });
        System.out.println(combine);
    }
    @Test
    public void TestFindSubSequence()
    {
        FindSubSequence c = new FindSubSequence();
        List subsequences = c.findSubsequences(new int[] {
            4, 7, 6, 7
        });
        System.out.println(subsequences);
    }
    @Test
    public void TestPermute()
    {
        Permute c = new Permute();
        List subsequences = c.permute(new int[] {
            1, 2, 3
        });
        System.out.println(subsequences);
    }
    @Test
    public void TestPermute2()
    {
        Permute2 c = new Permute2();
        List subsequences = c.permuteUnique(new int[] {
            1, 2, 2
        });
        System.out.println(subsequences);
    }
    @Test
    public void TestSolveNQueues()
    {
        MySolveNQueens s = new MySolveNQueens();
        List queues = s.solveNQueues(4);
        int i = 1;
        for(Iterator iterator = queues.iterator(); iterator.hasNext();)
        {
            String queue = (String)iterator.next();
            System.out.println((new StringBuilder()).append("\u7B2C").append(i).append("\u884C:").append(queue).toString());
            i++;
        }

    }
}
