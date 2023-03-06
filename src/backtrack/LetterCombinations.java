// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LetterCombinations.java

package backtrack;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations
{

    public LetterCombinations()
    {
        result = new ArrayList();
        sb = new StringBuilder();
    }

    public List letterCombinations(String digits)
    {
        if(digits == null || digits.length() == 0)
        {
            return null;
        } else
        {
            backTracking(digits, 0);
            return result;
        }
    }

    public void backTracking(String digits, int num)
    {
        if(num == digits.length())
        {
            result.add(sb.toString());
            return;
        }
        String str = numString[digits.charAt(num) - 48];
        for(int i = 0; i < str.length(); i++)
        {
            sb.append(str.charAt(i));
            backTracking(digits, num + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

    List result;
    String numString[] = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    StringBuilder sb;
}
