package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;

/* JADX INFO: loaded from: classes2.dex */
public class zzqj<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzoz<MessageType, BuilderType> {

    /* JADX INFO: renamed from: s */
    public final zzqm f21741s;

    /* JADX INFO: renamed from: t */
    public zzqm f21742t;

    public zzqj(zzqm zzqmVar) {
        this.f21741s = zzqmVar;
        if (zzqmVar.m9223d()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f21742t = (zzqm) zzqmVar.mo9141e(4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    /* JADX INFO: renamed from: b */
    public final zzqj clone() {
        zzqj zzqjVar = (zzqj) this.f21741s.mo9141e(5);
        zzqjVar.f21742t = m9217c();
        return zzqjVar;
    }

    /* JADX INFO: renamed from: c */
    public final zzqm m9217c() {
        if (!this.f21742t.m9223d()) {
            return this.f21742t;
        }
        this.f21742t.m9225i();
        return this.f21742t;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    public final Object clone() {
        zzqj zzqjVar = (zzqj) this.f21741s.mo9141e(5);
        zzqjVar.f21742t = m9217c();
        return zzqjVar;
    }
}
