package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.constraintlayout.widget.C1137R;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
class zzgcu {

    /* JADX INFO: renamed from: h */
    public static final String f16994h = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a */
    public final String f16995a;

    /* JADX INFO: renamed from: b */
    public final String f16996b;

    /* JADX INFO: renamed from: c */
    public final String f16997c;

    /* JADX INFO: renamed from: d */
    public final String f16998d;

    /* JADX INFO: renamed from: e */
    public final String f16999e;

    /* JADX INFO: renamed from: f */
    public final zzgct f17000f;

    /* JADX INFO: renamed from: g */
    public final zzgcs f17001g;

    public zzgcu(Context context, String str, String str2, String str3) {
        if (zzgct.f16991c == null) {
            zzgct.f16991c = new zzgct(context);
        }
        this.f17000f = zzgct.f16991c;
        this.f17001g = zzgcs.m6881a(context);
        this.f16995a = str;
        this.f16996b = str.concat("_3p");
        this.f16997c = str2;
        this.f16998d = str2.concat("_3p");
        this.f16999e = str3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX INFO: renamed from: a */
    public final zzgcr m6885a(String str, String str2, long j2, boolean z) throws IOException {
        String str3 = this.f16996b;
        zzgct zzgctVar = this.f17000f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f16994h)) {
                    String string = zzgctVar.f16993b.getString(str3, null);
                    String string2 = zzgctVar.f16993b.getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null) {
                        if (!string.equals(m6889e(str, str2, string2))) {
                            return m6886b(str, str2);
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgcr();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f16999e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.f16997c;
        String str5 = this.f16998d;
        long j3 = zzgctVar.f16993b.getLong(z2 ? str5 : str4, -1L);
        if (j3 != -1) {
            if (jCurrentTimeMillis < j3) {
                zzgctVar.m6883a(z2 ? str5 : str4, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= j3 + j2) {
                return m6886b(str, str2);
            }
        }
        if (!z2) {
            str3 = this.f16995a;
        }
        String string3 = zzgctVar.f16993b.getString(str3, null);
        if (string3 == null && !z) {
            return m6886b(str, str2);
        }
        if (z2) {
            str4 = str5;
        }
        return new zzgcr(string3, zzgctVar.f16993b.getLong(str4, -1L));
    }

    /* JADX INFO: renamed from: b */
    public final zzgcr m6886b(String str, String str2) throws IOException {
        if (str == null) {
            return m6888d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f17000f.m6883a("paid_3p_hash_key", string);
        return m6888d(m6889e(str, str2, string), true);
    }

    /* JADX INFO: renamed from: c */
    public final void m6887c(boolean z) throws IOException {
        String str = z ? this.f16998d : this.f16997c;
        zzgct zzgctVar = this.f17000f;
        zzgctVar.m6884b(str);
        zzgctVar.m6884b(z ? this.f16996b : this.f16995a);
    }

    /* JADX INFO: renamed from: d */
    public final zzgcr m6888d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f16999e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z ? this.f16998d : this.f16997c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        zzgct zzgctVar = this.f17000f;
        zzgctVar.m6883a(str2, lValueOf);
        zzgctVar.m6883a(z ? this.f16996b : this.f16995a, str);
        return new zzgcr(str, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: e */
    public final String m6889e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(AbstractC1456a.m2450q(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        int length = str4.length();
        String str5 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str5.length() + length + C1137R.styleable.ConstraintSet_stateLabels);
        AbstractC0271e0.m413u(sb, this.f16999e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb.append(str5);
        throw new IllegalArgumentException(sb.toString());
    }
}
