package com.kct.bluetooth_demo;


public class Utils {

    public static boolean versionCompare(String usingVer,String serverVer){
        boolean result = false;
        if(usingVer != null && serverVer != null && !usingVer.equals("") && !serverVer.equals("")
                && (usingVer.substring(0,1).equals("V") || usingVer.substring(0,1).equals("v"))
                && (serverVer.substring(0,1).equals("V") || serverVer.substring(0,1).equals("v"))){   //判断两个版本号是否为标准版本号

            String beforeStr = usingVer.substring(1, usingVer.length());
            String nowStr = serverVer.substring(1, serverVer.length());

            String beforeStrs[] = beforeStr.split("\\.");
            String nowStrs[] = nowStr.split("\\.");

            StringBuffer sbBefore = new StringBuffer();
            StringBuffer sbNow = new StringBuffer();
            for (int i = 0; i < beforeStrs.length; i++) {
                sbBefore.append(beforeStrs[i]);
            }
            for (int i = 0; i < nowStrs.length; i++) {
                sbNow.append(nowStrs[i]);
            }
            result = Integer.parseInt(String.valueOf(sbBefore)) < Integer.parseInt(String.valueOf(sbNow));
        }
        return result;
    }


    public static String getNewMac(String address) {
        String front = address.substring(0,address.length()-2);
        String back = address.substring(address.length()-2);
        int next = Integer.parseInt(back, 16)+1;
        back = Integer.toHexString(next).toUpperCase();
        if(back.length() == 3){
            back = back.substring(1,3);
        }else {
            back = back.length() == 1?"0"+back:back;
        }
        return front + back;
    }
}
