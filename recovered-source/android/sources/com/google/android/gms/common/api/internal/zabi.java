package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class zabi implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zabj f4289s;

    public zabi(zabj zabjVar) {
        this.f4289s = zabjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabk zabkVar = this.f4289s.f4290a;
        zabkVar.f4297t.disconnect(zabkVar.f4297t.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
