package tool;

/**
 * 二进制、十进制、十六进制互转
 */
public class NumberTransform
{
    /**
     * 二进制 转 十进制
     * @param bin
     * @return
     */
    public static int bin2decimal(String bin)
    {
        return Integer.parseInt(bin, 2);
    }


    /**
     * 二进制 转 十六进制
     * @param bin
     * @return
     */
    public static String bin2hex(String bin)
    {
        // 二进制转十进制
        int dec = bin2decimal(bin);
        // 十进制转十六进制
        return decimal2hex(dec);
    }


    /**
     * 十进制 转 二进制
     * @param decimal
     * @return
     */
    public static String decimal2bin(int decimal)
    {
        return Integer.toBinaryString(decimal);
    }


    /**
     * 十进制 转 十六进制
     * @param decimal
     * @return
     */
    public static String decimal2hex(int decimal)
    {
        //StringBuffer s = new StringBuffer();
        StringBuilder s = new StringBuilder(8);
        String a;
        char []b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal != 0){
            s = s.append(b[decimal % 16]);
            decimal = decimal / 16;
        }
        a = s.reverse().toString();
        return a;
    }


    /**
     * 十六进制 转 二进制
     * @param hex
     * @return
     */
    public static String hex2bin(String hex)
    {
        // 转为十进制
        int i = hex2decimal(hex);
        // 十进制转二进制
        return decimal2bin(i);
    }


    /**
     * 十六进制 转 十进制
     * @param hex
     * @return
     */
    public static int hex2decimal(String hex)
    {
        return Integer.valueOf(hex, 16);
    }

}
