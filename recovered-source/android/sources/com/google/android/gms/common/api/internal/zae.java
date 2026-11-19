package com.google.android.gms.common.api.internal;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class zae extends zai {
    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: a */
    public final void mo3517a(Status status) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: b */
    public final void mo3518b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        new Status(10, AbstractC1456a.m2450q(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: c */
    public final void mo3519c(zaaa zaaaVar, boolean z) {
        zaaaVar.f4281a.put(null, Boolean.valueOf(z));
        new zay(zaaaVar, null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: d */
    public final void mo3520d(zabk zabkVar) {
        try {
            Api.Client client = zabkVar.f4297t;
            throw null;
        } catch (RuntimeException e) {
            mo3518b(e);
        }
    }
}
