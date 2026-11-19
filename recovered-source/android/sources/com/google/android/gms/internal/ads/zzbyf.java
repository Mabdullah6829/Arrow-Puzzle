package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyf implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbyh f9510s;

    public zzbyf(zzbyh zzbyhVar) {
        Objects.requireNonNull(zzbyhVar);
        this.f9510s = zzbyhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f9510s.m5259f(true);
    }
}
