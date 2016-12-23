package com.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class Test {
    public static final byte[] TempSalt_WIPE = {0x33, 0x11, 0x11, 0x77, 0x69,
            0x70, 0x65, 0x2C, 0x30, 0x2C, 0x0D};
    public static final byte[] need = {0x77};

    public static void main(String[] args) {

        int i = ByteIndexOf(TempSalt_WIPE, need, 2);
        System.out.println(i);
    }

    public static int ByteIndexOf(byte[] searched, byte[] find, int start) {
        boolean matched = false;
        int end = find.length - 1;
        int skip = 0;
        for (int index = start; index <= searched.length - find.length; ++index) {
            matched = true;
            if (find[0] != searched[index] || find[end] != searched[index + end]) continue;
            else skip++;
            if (end > 10)
                if (find[skip] != searched[index + skip] || find[end - skip] != searched[index + end - skip])
                    continue;
                else skip++;
            for (int subIndex = skip; subIndex < find.length - skip; ++subIndex) {
                if (find[subIndex] != searched[index + subIndex]) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                return index;
            }
        }
        return -1;
    }
}
