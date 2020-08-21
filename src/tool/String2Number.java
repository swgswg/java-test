package tool;


import java.nio.charset.StandardCharsets;

/**
 * String 转 (int、long、float、double、byte[])
 * @author
 */
public class String2Number
{
    /**
     * string 转 byte
     * @param s
     * @return
     */
   public static byte[] string2byte(String s)
   {
       return s.getBytes(StandardCharsets.UTF_8);
   }


    /**
     * string 转 int
     * @param s
     * @return
     */
    public static int string2int(String s)
    {
        return Integer.parseInt(s);
    }


    /**
     * string 转 long
     * @param s
     * @return
     */
    public static long string2long(String s)
    {
        return Long.parseLong(s);
    }


    /**
     * string 转 float
     * @param s
     * @return
     */
    public static float string2float(String s)
    {
        return Float.parseFloat(s);
    }


    /**
     * string 转 double
     * @param s
     * @return
     */
    public static double string2double(String s)
    {
        return Double.parseDouble(s);
    }

}
