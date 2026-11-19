package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwx implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzfxc f16730s;

    public zzfwx(zzfxc zzfxcVar) {
        Objects.requireNonNull(zzfxcVar);
        this.f16730s = zzfxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfww zzfwwVar = this.f16730s.f16744e;
        zzfwwVar.getClass();
        zzfxg zzfxgVar = new zzfxg(zzfwwVar);
        zzfxf zzfxfVar = zzfwwVar.f16729b;
        zzfxgVar.f16749a = zzfxfVar;
        ArrayDeque arrayDeque = zzfxfVar.f16752b;
        arrayDeque.add(zzfxgVar);
        if (zzfxfVar.f16753c == null) {
            zzfxe zzfxeVar = (zzfxe) arrayDeque.poll();
            zzfxfVar.f16753c = zzfxeVar;
            if (zzfxeVar != null) {
                zzfxeVar.executeOnExecutor(zzfxfVar.f16751a, new Object[0]);
            }
        }
    }
}
