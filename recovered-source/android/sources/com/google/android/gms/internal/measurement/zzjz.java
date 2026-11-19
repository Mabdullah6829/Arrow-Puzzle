package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.internal.ListenerHolder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzjz implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte[] f22568a;

    public zzjz(zzka zzkaVar, byte[] bArr) {
        this.f22568a = bArr;
        Objects.requireNonNull(zzkaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    /* JADX INFO: renamed from: a */
    public final void mo3455a(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        try {
            byte[] bArr = this.f22568a;
            zzadf zzadfVar = zzadf.f22012b;
            int i2 = zzacf.f21956a;
            zzpmVar.mo10585a(zzpl.m10583B(bArr, zzadf.f22013c));
        } catch (zzaeh unused) {
            zzpmVar.getClass();
        }
    }
}
