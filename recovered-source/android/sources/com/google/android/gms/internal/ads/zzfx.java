package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfx implements zzao {

    /* JADX INFO: renamed from: a */
    public final String f16731a;

    /* JADX INFO: renamed from: b */
    public final byte[] f16732b;

    /* JADX INFO: renamed from: c */
    public final int f16733c;

    /* JADX INFO: renamed from: d */
    public final int f16734d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzfx(String str, byte[] bArr, int i2, int i3) {
        byte b;
        byte b2;
        boolean z = true;
        switch (str) {
            case "com.android.capture.fps":
                b = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b = 4;
                break;
            case "auxiliary.tracks.length":
                b = 2;
                break;
            case "auxiliary.tracks.offset":
                b = 1;
                break;
            case "auxiliary.tracks.map":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            if (i3 != 23) {
                z = false;
            } else if (bArr.length == 4) {
                i3 = 23;
            } else {
                i3 = 23;
                z = false;
            }
            zzgtr.m7128a(z);
        } else if (b == 1 || b == 2) {
            if (i3 != 78) {
                z = false;
            } else if (bArr.length == 8) {
                i3 = 78;
            } else {
                i3 = 78;
                z = false;
            }
            zzgtr.m7128a(z);
        } else if (b == 3) {
            zzgtr.m7128a(i3 == 0);
        } else if (b == 4) {
            if (i3 != 75) {
                z = false;
            } else if (bArr.length == 1 && ((b2 = bArr[0]) == 0 || b2 == 1)) {
                i3 = 75;
            } else {
                i3 = 75;
                z = false;
            }
            zzgtr.m7128a(z);
        }
        this.f16731a = str;
        this.f16732b = bArr;
        this.f16733c = i2;
        this.f16734d = i3;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m6754b() {
        zzgtr.m7134g("Metadata is not an auxiliary tracks map", this.f16731a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f16732b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(Integer.valueOf(bArr[i2 + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfx.class == obj.getClass()) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.f16731a.equals(zzfxVar.f16731a) && Arrays.equals(this.f16732b, zzfxVar.f16732b) && this.f16733c == zzfxVar.f16733c && this.f16734d == zzfxVar.f16734d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f16732b) + ((this.f16731a.hashCode() + 527) * 31)) * 31) + this.f16733c) * 31) + this.f16734d;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    public final String toString() {
        String string;
        String str = this.f16731a;
        byte[] bArr = this.f16732b;
        int i2 = this.f16734d;
        if (i2 != 0) {
            if (i2 == 1) {
                String str2 = zzfm.f16091a;
                string = new String(bArr, StandardCharsets.UTF_8);
            } else if (i2 == 23) {
                int length = bArr.length;
                if (!(length >= 4)) {
                    throw new IllegalArgumentException(zzgui.m7149b("array too small: %s < %s", Integer.valueOf(length), 4));
                }
                string = String.valueOf(Float.intBitsToFloat(zzhaq.m7306c(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i2 == 67) {
                int length2 = bArr.length;
                if (!(length2 >= 4)) {
                    throw new IllegalArgumentException(zzgui.m7149b("array too small: %s < %s", Integer.valueOf(length2), 4));
                }
                string = String.valueOf(zzhaq.m7306c(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i2 == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i2 != 78) {
                String str3 = zzfm.f16091a;
                string = zzgzo.f18403c.mo7280f().m7282g(bArr.length, bArr);
            } else {
                string = String.valueOf(new zzeu(bArr).m6384j());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM6754b = m6754b();
            StringBuilder sbM408p = AbstractC0271e0.m408p("track types = ");
            zzgtl.m7126a(sbM408p, arrayListM6754b.iterator(), ",");
            string = sbM408p.toString();
        } else {
            String str4 = zzfm.f16091a;
            string = zzgzo.f18403c.mo7280f().m7282g(bArr.length, bArr);
        }
        return AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(string).length()), "mdta: key=", str, ", value=", string);
    }
}
