package com.google.android.gms.internal.ads;

import android.graphics.Color;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzaol {

    /* JADX INFO: renamed from: a */
    public final String f6246a;

    /* JADX INFO: renamed from: b */
    public final int f6247b;

    /* JADX INFO: renamed from: c */
    public final Integer f6248c;

    /* JADX INFO: renamed from: d */
    public final Integer f6249d;

    /* JADX INFO: renamed from: e */
    public final float f6250e;

    /* JADX INFO: renamed from: f */
    public final boolean f6251f;

    /* JADX INFO: renamed from: g */
    public final boolean f6252g;

    /* JADX INFO: renamed from: h */
    public final boolean f6253h;

    /* JADX INFO: renamed from: i */
    public final boolean f6254i;

    /* JADX INFO: renamed from: j */
    public final int f6255j;

    public zzaol(String str, int i2, Integer num, Integer num2, float f2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        this.f6246a = str;
        this.f6247b = i2;
        this.f6248c = num;
        this.f6249d = num2;
        this.f6250e = f2;
        this.f6251f = z;
        this.f6252g = z2;
        this.f6253h = z3;
        this.f6254i = z4;
        this.f6255j = i3;
    }

    /* JADX INFO: renamed from: a */
    public static Integer m4259a(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgtr.m7128a(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzhaq.m7304a(((j2 >> 24) & 255) ^ 255), zzhaq.m7304a(j2 & 255), zzhaq.m7304a((j2 >> 8) & 255), zzhaq.m7304a((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzeh.m6212d("SsaStyle", AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4260b(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e) {
            zzeh.m6212d("SsaStyle", AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }
}
