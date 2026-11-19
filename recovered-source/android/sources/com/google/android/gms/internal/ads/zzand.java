package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzand extends zzang {

    /* JADX INFO: renamed from: o */
    public static final byte[] f6107o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f6108p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f6109n;

    /* JADX INFO: renamed from: e */
    public static boolean m4238e(zzeu zzeuVar, byte[] bArr) {
        if (zzeuVar.m6360B() < 8) {
            return false;
        }
        int i2 = zzeuVar.f14888b;
        byte[] bArr2 = new byte[8];
        zzeuVar.m6366H(bArr2, 0, 8);
        zzeuVar.m6363E(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: a */
    public final void mo4229a(boolean z) {
        super.mo4229a(z);
        if (z) {
            this.f6109n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: b */
    public final long mo4230b(zzeu zzeuVar) {
        byte[] bArr = zzeuVar.f14887a;
        return (((long) this.f6120i) * zzgx.m7234b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: c */
    public final boolean mo4231c(zzeu zzeuVar, long j2, zzane zzaneVar) {
        if (m4238e(zzeuVar, f6107o)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzeuVar.f14887a, zzeuVar.f14889c);
            int i2 = bArrCopyOf[9] & 255;
            ArrayList arrayListM7233a = zzgx.m7233a(bArrCopyOf);
            if (zzaneVar.f6110a == null) {
                zzt zztVar = new zzt();
                zztVar.m8852d("audio/ogg");
                zztVar.m8853e("audio/opus");
                zztVar.f20780F = i2;
                zztVar.f20782H = 48000;
                zztVar.f20805q = arrayListM7233a;
                zzaneVar.f6110a = new zzv(zztVar);
                return true;
            }
        } else {
            if (!m4238e(zzeuVar, f6108p)) {
                zzaneVar.f6110a.getClass();
                return false;
            }
            zzaneVar.f6110a.getClass();
            if (!this.f6109n) {
                this.f6109n = true;
                zzeuVar.m6365G(8);
                zzap zzapVarM4132a = zzaho.m4132a(zzgwt.m7221u(zzhg.m7443b(zzeuVar, false, false).f18534a));
                if (zzapVarM4132a != null) {
                    zzv zzvVar = zzaneVar.f6110a;
                    zzvVar.getClass();
                    zzt zztVar2 = new zzt(zzvVar);
                    zztVar2.f20799k = zzapVarM4132a.m4288c(zzaneVar.f6110a.f21058l);
                    zzaneVar.f6110a = new zzv(zztVar2);
                    return true;
                }
            }
        }
        return true;
    }
}
