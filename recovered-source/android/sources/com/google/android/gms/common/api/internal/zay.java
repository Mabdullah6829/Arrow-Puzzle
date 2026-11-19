package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zay implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasePendingResult f4366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zaaa f4367b;

    public zay(zaaa zaaaVar, BasePendingResult basePendingResult) {
        this.f4366a = basePendingResult;
        Objects.requireNonNull(zaaaVar);
        this.f4367b = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    /* JADX INFO: renamed from: a */
    public final void mo3428a(Status status) {
        this.f4367b.f4281a.remove(this.f4366a);
    }
}
