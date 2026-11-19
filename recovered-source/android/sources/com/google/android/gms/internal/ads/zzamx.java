package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzamx extends zzang {

    /* JADX INFO: renamed from: n */
    public zzagn f6061n;

    /* JADX INFO: renamed from: o */
    public zzamw f6062o;

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: a */
    public final void mo4229a(boolean z) {
        super.mo4229a(z);
        if (z) {
            this.f6061n = null;
            this.f6062o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: b */
    public final long mo4230b(zzeu zzeuVar) {
        byte[] bArr = zzeuVar.f14887a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i2 = (bArr[2] & 255) >> 4;
        if (i2 == 6) {
            zzeuVar.m6365G(4);
            zzeuVar.m6389o();
        } else if (i2 == 7) {
            i2 = 7;
            zzeuVar.m6365G(4);
            zzeuVar.m6389o();
        }
        int iM4114b = zzagi.m4114b(i2, zzeuVar);
        zzeuVar.m6363E(0);
        return iM4114b;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: c */
    public final boolean mo4231c(zzeu zzeuVar, long j2, zzane zzaneVar) {
        byte[] bArr = zzeuVar.f14887a;
        zzagn zzagnVar = this.f6061n;
        if (zzagnVar == null) {
            zzagn zzagnVar2 = new zzagn(bArr, 17);
            this.f6061n = zzagnVar2;
            zzt zztVar = new zzt(zzagnVar2.m4120b(Arrays.copyOfRange(bArr, 9, zzeuVar.f14889c), null));
            zztVar.m8852d("audio/ogg");
            zzaneVar.f6110a = new zzv(zztVar);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) == 3) {
            zzagm zzagmVarM4116a = zzagk.m4116a(zzeuVar);
            zzagn zzagnVar3 = new zzagn(zzagnVar.f5250a, zzagnVar.f5251b, zzagnVar.f5252c, zzagnVar.f5253d, zzagnVar.f5254e, zzagnVar.f5256g, zzagnVar.f5257h, zzagnVar.f5259j, zzagmVarM4116a, zzagnVar.f5261l);
            this.f6061n = zzagnVar3;
            this.f6062o = new zzamw(zzagnVar3, zzagmVarM4116a);
            return true;
        }
        if (b != -1) {
            return true;
        }
        zzamw zzamwVar = this.f6062o;
        if (zzamwVar != null) {
            zzamwVar.f6059c = j2;
            zzaneVar.f6111b = zzamwVar;
        }
        zzaneVar.f6110a.getClass();
        return false;
    }
}
