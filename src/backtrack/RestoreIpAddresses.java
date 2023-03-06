// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RestoreIpAddresses.java

package backtrack;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses
{

    public RestoreIpAddresses()
    {
        result = new ArrayList();
        stringBuilder = new StringBuilder();
    }

    public List restoreIpAddresses(String s)
    {
        if(s.length() > 12 || s.length() < 4)
        {
            return null;
        } else
        {
            restoreIpAddressesHandler(s, 0, 0);
            return result;
        }
    }

    public void restoreIpAddressesHandler(String s, int start, int number)
    {
        if(start == s.length() && number == 4)
        {
            result.add(stringBuilder.toString());
            return;
        }
        if(start == s.length() || number == 4)
            return;
        for(int i = start; i < s.length() && i - start < 3 && Integer.parseInt(s.substring(start, i + 1)) >= 0 && Integer.parseInt(s.substring(start, i + 1)) <= 255; i++)
        {
            if((i + 1) - start > 1 && s.charAt(start) - 48 == 0)
                continue;
            stringBuilder.append(s.substring(start, i + 1));
            if(number < 3)
                stringBuilder.append(".");
            number++;
            restoreIpAddressesHandler(s, i + 1, number);
            number--;
            stringBuilder.delete(start + number, i + number + 2);
        }

    }

    List result;
    StringBuilder stringBuilder;
}
