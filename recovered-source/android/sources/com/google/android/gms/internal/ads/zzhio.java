package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhio extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final zzhin f18805a;

    /* JADX INFO: renamed from: b */
    public final int f18806b;

    public zzhio(zzhin zzhinVar, int i2) {
        this.f18805a = zzhinVar;
        this.f18806b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static zzhio m7466b(zzhin zzhinVar, int i2) throws GeneralSecurityException {
        if (i2 < 8 || i2 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhio(zzhinVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18805a != zzhin.f18803c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhio)) {
            return false;
        }
        zzhio zzhioVar = (zzhio) obj;
        return zzhioVar.f18805a == this.f18805a && zzhioVar.f18806b == this.f18806b;
    }

    public final int hashCode() {
        return Objects.hash(zzhio.class, this.f18805a, Integer.valueOf(this.f18806b));
    }

    public final String toString() {
        String string = this.f18805a.toString();
        int length = string.length();
        int i2 = this.f18806b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i2).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
