package p039W;

import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: W.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0867g {

    /* JADX INFO: renamed from: a */
    public static final String[] f2429a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: b */
    public static final String[] f2430b = new String[64];

    /* JADX INFO: renamed from: c */
    public static final String[] f2431c = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f2431c;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f2430b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = AbstractC0271e0.m403k(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = f2430b;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i7]);
            sb.append('|');
            strArr3[i8 | 8] = AbstractC0271e0.m403k(sb, strArr3[i6], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f2430b;
            if (i2 >= strArr4.length) {
                return;
            }
            if (strArr4[i2] == null) {
                strArr4[i2] = f2431c[i2];
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX INFO: renamed from: a */
    public static String m1781a(boolean z, int i2, int i3, byte b, byte b2) {
        String strReplace;
        String str = b < 10 ? f2429a[b] : String.format("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            strReplace = "";
        } else {
            String[] strArr = f2431c;
            if (b == 2 || b == 3) {
                strReplace = strArr[b2];
            } else if (b == 4 || b == 6) {
                strReplace = b2 == 1 ? "ACK" : strArr[b2];
            } else if (b == 7 || b == 8) {
                strReplace = strArr[b2];
            } else {
                String str2 = b2 < 64 ? f2430b[b2] : strArr[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    strReplace = (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                } else {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), str, strReplace);
    }
}
