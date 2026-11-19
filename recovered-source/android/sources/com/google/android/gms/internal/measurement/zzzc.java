package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzc implements zzyk {

    /* JADX INFO: renamed from: c */
    public static final HashSet f23143c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: a */
    public final StringBuilder f23144a;

    /* JADX INFO: renamed from: b */
    public boolean f23145b = false;

    public zzzc(StringBuilder sb) {
        this.f23144a = sb;
    }

    /* JADX INFO: renamed from: b */
    public static int m10744b(int i2, String str) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzyk
    /* JADX INFO: renamed from: a */
    public final void mo10735a(Object obj, String str) {
        boolean z = this.f23145b;
        StringBuilder sb = this.f23144a;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append("[CONTEXT ");
            this.f23145b = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (f23143c.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String string = obj.toString();
        int i2 = 0;
        while (true) {
            int iM10744b = m10744b(i2, string);
            if (iM10744b == -1) {
                sb.append((CharSequence) string, i2, string.length());
                sb.append('\"');
                return;
            }
            sb.append((CharSequence) string, i2, iM10744b);
            i2 = iM10744b + 1;
            char cCharAt = string.charAt(iM10744b);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb.append((char) 65533);
            }
            sb.append("\\");
            sb.append(cCharAt);
        }
    }
}
