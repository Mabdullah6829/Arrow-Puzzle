package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzepk {

    /* JADX INFO: renamed from: a */
    public final String f14529a;

    /* JADX INFO: renamed from: b */
    public final String f14530b;

    /* JADX INFO: renamed from: c */
    public int f14531c;

    /* JADX INFO: renamed from: d */
    public long f14532d;

    /* JADX INFO: renamed from: e */
    public final Integer f14533e;

    public zzepk(String str, String str2, int i2, long j2, Integer num) {
        this.f14529a = str;
        this.f14530b = str2;
        this.f14531c = i2;
        this.f14532d = j2;
        this.f14533e = num;
    }

    public final String toString() {
        Integer num;
        int i2 = this.f14531c;
        long j2 = this.f14532d;
        String str = this.f14529a;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(String.valueOf(str).length(), 1, String.valueOf(i2).length(), 1, String.valueOf(j2).length()));
        sb.append(str);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(j2);
        String string = sb.toString();
        String str2 = this.f14530b;
        if (!TextUtils.isEmpty(str2)) {
            string = AbstractC1456a.m2450q(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8591j2)).booleanValue() || (num = this.f14533e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb2.append(string);
        sb2.append(".");
        sb2.append(num);
        return sb2.toString();
    }
}
