package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapa implements zzans {

    /* JADX INFO: renamed from: a */
    public final zzeu f6356a = new zzeu();

    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        zzcy zzcyVarM5860b;
        zzeu zzeuVar = this.f6356a;
        zzeuVar.m6397z(i2 + i3, bArr);
        zzeuVar.m6363E(i2);
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.m6360B() > 0) {
            zzgtr.m7129b("Incomplete Mp4Webvtt Top Level box header found.", zzeuVar.m6360B() >= 8);
            int iM6376b = zzeuVar.m6376b() - 8;
            if (zzeuVar.m6376b() == 1987343459) {
                CharSequence charSequenceM4295a = null;
                zzcx zzcxVarM4294a = null;
                while (iM6376b > 0) {
                    zzgtr.m7129b("Incomplete vtt cue box header found.", iM6376b >= 8);
                    int iM6376b2 = zzeuVar.m6376b();
                    int iM6376b3 = zzeuVar.m6376b();
                    int i4 = iM6376b - 8;
                    int i5 = iM6376b2 - 8;
                    byte[] bArr2 = zzeuVar.f14887a;
                    int i6 = zzeuVar.f14888b;
                    String str = zzfm.f16091a;
                    String str2 = new String(bArr2, i6, i5, StandardCharsets.UTF_8);
                    zzeuVar.m6365G(i5);
                    if (iM6376b3 == 1937011815) {
                        Pattern pattern = zzapj.f6401a;
                        zzapi zzapiVar = new zzapi();
                        zzapj.m4297c(str2, zzapiVar);
                        zzcxVarM4294a = zzapiVar.m4294a();
                    } else if (iM6376b3 == 1885436268) {
                        charSequenceM4295a = zzapj.m4295a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    iM6376b = i4 - i5;
                }
                if (charSequenceM4295a == null) {
                    charSequenceM4295a = "";
                }
                if (zzcxVarM4294a != null) {
                    zzcxVarM4294a.m5859a(charSequenceM4295a);
                    zzcyVarM5860b = zzcxVarM4294a.m5860b();
                } else {
                    Pattern pattern2 = zzapj.f6401a;
                    zzapi zzapiVar2 = new zzapi();
                    zzapiVar2.f6392c = charSequenceM4295a;
                    zzcyVarM5860b = zzapiVar2.m4294a().m5860b();
                }
                arrayList.add(zzcyVarM5860b);
            } else {
                zzeuVar.m6365G(iM6376b);
            }
        }
        ((zzanu) zzduVar).mo3942b(new zzank(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
