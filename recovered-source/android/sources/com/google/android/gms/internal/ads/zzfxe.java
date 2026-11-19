package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfxe extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public zzfxf f16749a;

    /* JADX INFO: renamed from: b */
    public final zzfww f16750b;

    public zzfxe(zzfww zzfwwVar) {
        this.f16750b = zzfwwVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfxf zzfxfVar = this.f16749a;
        if (zzfxfVar != null) {
            zzfxfVar.f16753c = null;
            zzfxe zzfxeVar = (zzfxe) zzfxfVar.f16752b.poll();
            zzfxfVar.f16753c = zzfxeVar;
            if (zzfxeVar != null) {
                zzfxeVar.executeOnExecutor(zzfxfVar.f16751a, new Object[0]);
            }
        }
    }
}
