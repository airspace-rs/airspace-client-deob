// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

public class Class29
{

    public void method325(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        anInt540 = class30_sub2_sub2.method408();
        if(!flag)
        {
            throw new NullPointerException();
        } else
        {
            anInt538 = class30_sub2_sub2.method413();
            anInt539 = class30_sub2_sub2.method413();
            method326((byte)-112, class30_sub2_sub2);
            return;
        }
    }

    public void method326(byte byte0, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(byte0 != aByte532)
            aBoolean533 = !aBoolean533;
        anInt535 = class30_sub2_sub2.method408();
        anIntArray536 = new int[anInt535];
        anIntArray537 = new int[anInt535];
        for(int i = 0; i < anInt535; i++)
        {
            anIntArray536[i] = class30_sub2_sub2.method410();
            anIntArray537[i] = class30_sub2_sub2.method410();
        }

    }

    public void method327(byte byte0)
    {
        anInt541 = 0;
        if(byte0 == 8)
            byte0 = 0;
        else
            aBoolean534 = !aBoolean534;
        anInt542 = 0;
        anInt543 = 0;
        anInt544 = 0;
        anInt545 = 0;
    }

    public int method328(boolean flag, int i)
    {
        if(!flag)
            aBoolean531 = !aBoolean531;
        if(anInt545 >= anInt541)
        {
            anInt544 = anIntArray537[anInt542++] << 15;
            if(anInt542 >= anInt535)
                anInt542 = anInt535 - 1;
            anInt541 = (int)(((double)anIntArray536[anInt542] / 65536D) * (double)i);
            if(anInt541 > anInt545)
                anInt543 = ((anIntArray537[anInt542] << 15) - anInt544) / (anInt541 - anInt545);
        }
        anInt544 += anInt543;
        anInt545++;
        return anInt544 - anInt543 >> 15;
    }

    public Class29()
    {
        aBoolean531 = false;
        aByte532 = -112;
        aBoolean533 = false;
        aBoolean534 = true;
    }

    public boolean aBoolean531;
    public byte aByte532;
    public boolean aBoolean533;
    public boolean aBoolean534;
    public int anInt535;
    public int anIntArray536[];
    public int anIntArray537[];
    public int anInt538;
    public int anInt539;
    public int anInt540;
    public int anInt541;
    public int anInt542;
    public int anInt543;
    public int anInt544;
    public int anInt545;
    public static int anInt546;
}
