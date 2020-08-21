package tool;

import java.nio.charset.StandardCharsets;

/**
 * (byte[]、int) 转 String
 */
public class Number2String
{
    /**
     * byte[]  转 String
     * @param b
     * @return
     */
    public static String byte2string(byte[] b)
    {
        return new String(b, StandardCharsets.UTF_8);
    }


    /**
     * int 转 String
     * @param i
     * @return
     */
    public static String int2string(int i)
    {
        return String.valueOf(i);
    }

}
