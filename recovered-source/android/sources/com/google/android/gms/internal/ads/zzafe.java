package com.google.android.gms.internal.ads;

import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafe {

    /* JADX INFO: renamed from: a */
    public final int f5158a;

    /* JADX INFO: renamed from: b */
    public final int f5159b;

    /* JADX INFO: renamed from: c */
    public final int f5160c;

    /* JADX INFO: renamed from: d */
    public final int f5161d;

    /* JADX INFO: renamed from: e */
    public final String f5162e;

    public zzafe(String str, int i2, int i3, int i4, int i5) {
        this.f5158a = i2;
        this.f5162e = str;
        this.f5159b = i3;
        this.f5160c = i4;
        this.f5161d = i5;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x020c A[Catch: RuntimeException -> 0x0251, TryCatch #0 {RuntimeException -> 0x0251, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:18:0x0083, B:20:0x00c9, B:22:0x00d7, B:24:0x00e5, B:26:0x010d, B:28:0x0113, B:30:0x0124, B:32:0x012d, B:34:0x0135, B:36:0x0146, B:38:0x0153, B:40:0x0164, B:42:0x016a, B:44:0x017b, B:46:0x0181, B:48:0x0192, B:50:0x019a, B:52:0x01a4, B:53:0x01a7, B:54:0x01aa, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:61:0x01d2, B:66:0x01df, B:68:0x01e5, B:70:0x01ea, B:71:0x01ed, B:74:0x01f8, B:77:0x01ff, B:80:0x0206, B:82:0x020c, B:84:0x0218, B:96:0x023c, B:100:0x0247, B:95:0x0238, B:64:0x01d9), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0218 A[Catch: RuntimeException -> 0x0251, TryCatch #0 {RuntimeException -> 0x0251, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:18:0x0083, B:20:0x00c9, B:22:0x00d7, B:24:0x00e5, B:26:0x010d, B:28:0x0113, B:30:0x0124, B:32:0x012d, B:34:0x0135, B:36:0x0146, B:38:0x0153, B:40:0x0164, B:42:0x016a, B:44:0x017b, B:46:0x0181, B:48:0x0192, B:50:0x019a, B:52:0x01a4, B:53:0x01a7, B:54:0x01aa, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:61:0x01d2, B:66:0x01df, B:68:0x01e5, B:70:0x01ea, B:71:0x01ed, B:74:0x01f8, B:77:0x01ff, B:80:0x0206, B:82:0x020c, B:84:0x0218, B:96:0x023c, B:100:0x0247, B:95:0x0238, B:64:0x01d9), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    /* JADX INFO: renamed from: a */
    public static zzafe m4062a(byte[] bArr) throws zzat {
        int i2;
        int iM6345h;
        int i3;
        int iM6345h2;
        int i4;
        try {
            zzet zzetVar = new zzet(bArr, bArr.length);
            zzetVar.m6342e();
            int iM6345h3 = zzetVar.m6345h(7);
            if (iM6345h3 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(iM6345h3).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(iM6345h3);
                zzeh.m6211c("Av1Config", sb.toString());
                return null;
            }
            int iM6345h4 = zzetVar.m6345h(3);
            int iM6345h5 = zzetVar.m6345h(5);
            boolean zM6344g = zzetVar.m6344g();
            int i5 = zzetVar.m6344g() ? true != zzetVar.m6344g() ? 10 : 12 : 8;
            zzetVar.m6343f(13);
            Object[] objArr = {Integer.valueOf(iM6345h5)};
            String str = zzfm.f16091a;
            Locale locale = Locale.US;
            String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, objArr);
            String str3 = true != zM6344g ? "M" : "H";
            String str4 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i5));
            StringBuilder sb2 = new StringBuilder(String.valueOf(iM6345h4).length() + 6 + str2.length() + 2 + str4.length());
            sb2.append("av01.");
            sb2.append(iM6345h4);
            sb2.append(".");
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(".");
            sb2.append(str4);
            String string = sb2.toString();
            if (zzetVar.m6339b() <= 0) {
                return new zzafe(string, i5, -1, -1, -1);
            }
            zzetVar.m6342e();
            int iM6345h6 = zzetVar.m6345h(4);
            if (iM6345h6 != 1) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iM6345h6).length() + 22);
                sb3.append("Unsupported obu_type: ");
                sb3.append(iM6345h6);
                zzeh.m6210b("Av1Config", sb3.toString());
                return new zzafe(string, i5, -1, -1, -1);
            }
            if (zzetVar.m6344g()) {
                zzeh.m6210b("Av1Config", "Unsupported obu_extension_flag");
                return new zzafe(string, i5, -1, -1, -1);
            }
            boolean zM6344g2 = zzetVar.m6344g();
            zzetVar.m6342e();
            if (zM6344g2 && zzetVar.m6345h(8) > 127) {
                zzeh.m6210b("Av1Config", "Excessive obu_size");
                return new zzafe(string, i5, -1, -1, -1);
            }
            int iM6345h7 = zzetVar.m6345h(3);
            zzetVar.m6342e();
            if (zzetVar.m6344g()) {
                zzeh.m6210b("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafe(string, i5, -1, -1, -1);
            }
            if (zzetVar.m6344g()) {
                zzeh.m6210b("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafe(string, i5, -1, -1, -1);
            }
            if (zzetVar.m6344g()) {
                zzeh.m6210b("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafe(string, i5, -1, -1, -1);
            }
            int iM6345h8 = zzetVar.m6345h(5);
            boolean z = false;
            for (int i6 = 0; i6 <= iM6345h8; i6++) {
                zzetVar.m6343f(12);
                if (zzetVar.m6345h(5) > 7) {
                    zzetVar.m6342e();
                }
            }
            int iM6345h9 = zzetVar.m6345h(4);
            int iM6345h10 = zzetVar.m6345h(4);
            zzetVar.m6343f(iM6345h9 + 1);
            zzetVar.m6343f(iM6345h10 + 1);
            if (zzetVar.m6344g()) {
                i2 = 7;
                zzetVar.m6343f(7);
            } else {
                i2 = 7;
            }
            zzetVar.m6343f(i2);
            boolean zM6344g3 = zzetVar.m6344g();
            if (zM6344g3) {
                zzetVar.m6343f(2);
            }
            if (zzetVar.m6344g() || zzetVar.m6345h(1) > 0) {
                if (!zzetVar.m6344g()) {
                    zzetVar.m6343f(1);
                }
            }
            if (zM6344g3) {
                zzetVar.m6343f(3);
            }
            zzetVar.m6343f(3);
            boolean zM6344g4 = zzetVar.m6344g();
            if (iM6345h7 != 2) {
                if (iM6345h7 == 1) {
                }
                if (!zzetVar.m6344g()) {
                    return new zzafe(string, i5, -1, -1, -1);
                }
                int iM6345h11 = zzetVar.m6345h(8);
                iM6345h = zzetVar.m6345h(8);
                int iM6345h12 = zzetVar.m6345h(8);
                if (z && iM6345h11 == 1) {
                    if (iM6345h == 13) {
                        if (iM6345h12 == 0) {
                            i3 = 13;
                            iM6345h11 = 1;
                            iM6345h2 = 1;
                        } else {
                            i3 = 13;
                        }
                        int iM8028b = zzi.m8028b(iM6345h11);
                        if (iM6345h2 == 1) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        return new zzafe(string, i5, iM8028b, i4, zzi.m8029c(i3));
                    }
                    i3 = iM6345h;
                    iM6345h11 = 1;
                } else {
                    i3 = iM6345h;
                }
                iM6345h2 = zzetVar.m6345h(1);
                int iM8028b2 = zzi.m8028b(iM6345h11);
                if (iM6345h2 == 1) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                return new zzafe(string, i5, iM8028b2, i4, zzi.m8029c(i3));
            }
            if (zM6344g4) {
                zzetVar.m6342e();
            }
            if (zzetVar.m6344g()) {
                z = true;
            }
            if (!zzetVar.m6344g()) {
                return new zzafe(string, i5, -1, -1, -1);
            }
            int iM6345h13 = zzetVar.m6345h(8);
            iM6345h = zzetVar.m6345h(8);
            int iM6345h14 = zzetVar.m6345h(8);
            if (z) {
                i3 = iM6345h;
                iM6345h2 = zzetVar.m6345h(1);
            } else {
                i3 = iM6345h;
                iM6345h2 = zzetVar.m6345h(1);
            }
            int iM8028b3 = zzi.m8028b(iM6345h13);
            if (iM6345h2 == 1) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            return new zzafe(string, i5, iM8028b3, i4, zzi.m8029c(i3));
        } catch (RuntimeException e) {
            throw zzat.m4383a(e, "Error parsing AV1 config");
        }
    }
}
