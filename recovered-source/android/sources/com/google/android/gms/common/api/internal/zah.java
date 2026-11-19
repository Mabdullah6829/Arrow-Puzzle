package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zah extends zad {

    /* JADX INFO: renamed from: c */
    public final ListenerHolder.ListenerKey f4356c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f4356c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo3519c(zaaa zaaaVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3514f(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f4301x.get(this.f4356c);
        if (zacdVar == null) {
            return null;
        }
        return zacdVar.f4331a.f4261b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: g */
    public final boolean mo3515g(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f4301x.get(this.f4356c);
        return zacdVar != null && zacdVar.f4331a.f4262c;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: h */
    public final int mo3516h(zabk zabkVar) {
        return ((zacd) zabkVar.f4301x.get(this.f4356c)) != null ? 0 : -1;
    }

    @Override // com.google.android.gms.common.api.internal.zad
    /* JADX INFO: renamed from: i */
    public final void mo3521i(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f4301x.remove(this.f4356c);
        if (zacdVar == null) {
            this.f4351b.m10770d(Boolean.FALSE);
            return;
        }
        ((zacf) zacdVar.f4332b).f4335b.f4267b.mo3483a(zabkVar.f4297t, this.f4351b);
        zacdVar.f4331a.f4260a.f4257b = null;
    }
}
