package com.instagram.common.viewpoint.core;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC3815Vf {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC3815Vf[] A02;
    public static final EnumC3815Vf A03;
    public static final EnumC3815Vf A04;
    public static final EnumC3815Vf A05;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{88, 89, 90, 93, 73, 80, 72, 98, 107, 107, 2, 3};
    }

    static {
        A02();
        A03 = new EnumC3815Vf(A01(0, 7, 61), 0);
        A05 = new EnumC3815Vf(A01(10, 2, 108), 1);
        A04 = new EnumC3815Vf(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC3815Vf(String str, int i2) {
        super(str, i2);
    }

    public static VideoAutoplayBehavior A00(@Nullable EnumC3815Vf enumC3815Vf) {
        if (enumC3815Vf == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (enumC3815Vf.ordinal()) {
            case 0:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 1:
                return VideoAutoplayBehavior.ON;
            case 2:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ EnumC3815Vf[] A03() {
        EnumC3815Vf[] enumC3815VfArr = new EnumC3815Vf[3];
        enumC3815VfArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC3815VfArr[1] = A05;
        enumC3815VfArr[2] = A04;
        return enumC3815VfArr;
    }

    public static EnumC3815Vf valueOf(String str) {
        return (EnumC3815Vf) Enum.valueOf(EnumC3815Vf.class, str);
    }

    public static EnumC3815Vf[] values() {
        return (EnumC3815Vf[]) A02.clone();
    }
}
