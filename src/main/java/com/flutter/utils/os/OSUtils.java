package com.flutter.utils.os;

public class OSUtils {

    private OSUtils() {
    }

    public static boolean isWindows() {
        return getOSName().startsWith("Windows");
    }

    public static boolean isMacOS() {
        return getOSName().startsWith("Mac");
    }

    public static boolean isLinux() {
        return !isMacOS() && !isWindows();
    }

    private static String getOSName() {
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        return osName;
    }
}
