package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfn {

    /* JADX INFO: renamed from: a */
    public final int f7740a;

    /* JADX INFO: renamed from: b */
    public final int f7741b;

    /* JADX INFO: renamed from: c */
    public final int f7742c;

    /* JADX INFO: renamed from: d */
    public final boolean f7743d;

    /* JADX INFO: renamed from: e */
    public final zzbgc f7744e;

    /* JADX INFO: renamed from: f */
    public final zzbgj f7745f;

    /* JADX INFO: renamed from: n */
    public int f7753n;

    /* JADX INFO: renamed from: g */
    public final Object f7746g = new Object();

    /* JADX INFO: renamed from: h */
    public final ArrayList f7747h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f7748i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f7749j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f7750k = 0;

    /* JADX INFO: renamed from: l */
    public int f7751l = 0;

    /* JADX INFO: renamed from: m */
    public int f7752m = 0;

    /* JADX INFO: renamed from: o */
    public String f7754o = "";

    /* JADX INFO: renamed from: p */
    public String f7755p = "";

    /* JADX INFO: renamed from: q */
    public String f7756q = "";

    public zzbfn(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.f7740a = i2;
        this.f7741b = i3;
        this.f7742c = i4;
        this.f7743d = z;
        this.f7744e = new zzbgc(i5);
        this.f7745f = new zzbgj(i6, i7, i8);
    }

    /* JADX INFO: renamed from: d */
    public static final String m4844d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    /* JADX INFO: renamed from: a */
    public final void m4845a(String str, boolean z, float f2, float f3, float f4, float f5) {
        m4847c(str, z, f2, f3, f4, f5);
        synchronized (this.f7746g) {
            try {
                if (this.f7752m < 0) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("ActivityContent: negative number of WebViews.");
                }
                m4846b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4846b() {
        synchronized (this.f7746g) {
            try {
                int i2 = this.f7750k;
                int i3 = this.f7751l;
                int i4 = this.f7741b;
                if (!this.f7743d) {
                    i4 = (i3 * i4) + (i2 * this.f7740a);
                }
                if (i4 > this.f7753n) {
                    this.f7753n = i4;
                    com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                    if (!zztVar.f3708h.m5387g().m3183i()) {
                        zzbgc zzbgcVar = this.f7744e;
                        this.f7754o = zzbgcVar.m4860a(this.f7747h);
                        this.f7755p = zzbgcVar.m4860a(this.f7748i);
                    }
                    if (!zztVar.f3708h.m5387g().m3184j()) {
                        this.f7756q = this.f7745f.m4869a(this.f7748i, this.f7749j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4847c(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str != null) {
            if (str.length() < this.f7742c) {
                return;
            }
            synchronized (this.f7746g) {
                try {
                    this.f7747h.add(str);
                    this.f7750k += str.length();
                    if (z) {
                        ArrayList arrayList = this.f7748i;
                        arrayList.add(str);
                        this.f7749j.add(new zzbfy(arrayList.size() - 1, f2, f3, f4, f5));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfn)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbfn) obj).f7754o;
        return str != null && str.equals(this.f7754o);
    }

    public final int hashCode() {
        return this.f7754o.hashCode();
    }

    public final String toString() {
        int i2 = this.f7751l;
        int i3 = this.f7753n;
        int i4 = this.f7750k;
        String strM4844d = m4844d(this.f7747h);
        String strM4844d2 = m4844d(this.f7748i);
        String str = this.f7754o;
        String str2 = this.f7755p;
        String str3 = this.f7756q;
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i4).length();
        int length4 = String.valueOf(strM4844d).length();
        int length5 = String.valueOf(strM4844d2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6, 20, String.valueOf(str2).length(), 32, String.valueOf(str3).length()));
        AbstractC1456a.m2455v(sb, "ActivityContent fetchId: ", i2, " score:", i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(strM4844d);
        AbstractC0271e0.m413u(sb, "\n viewableText", strM4844d2, "\n signture: ", str);
        return AbstractC1456a.m2451r(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
