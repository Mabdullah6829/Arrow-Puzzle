package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zaf extends zad {

    /* JADX INFO: renamed from: c */
    public final zacd f4352c;

    public zaf(zacd zacdVar, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f4352c = zacdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo3519c(zaaa zaaaVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3514f(zabk zabkVar) {
        return this.f4352c.f4331a.f4261b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: g */
    public final boolean mo3515g(zabk zabkVar) {
        return this.f4352c.f4331a.f4262c;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: h */
    public final int mo3516h(zabk zabkVar) {
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.zad
    /* JADX INFO: renamed from: i */
    public final void mo3521i(zabk zabkVar) {
        zacd zacdVar = this.f4352c;
        RegisterListenerMethod registerListenerMethod = zacdVar.f4331a;
        registerListenerMethod.mo3480a(zabkVar.f4297t, this.f4351b);
        ListenerHolder.ListenerKey listenerKey = registerListenerMethod.f4260a.f4257b;
        if (listenerKey != null) {
            zabkVar.f4301x.put(listenerKey, zacdVar);
        }
    }
}
