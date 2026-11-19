package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzc implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo3707a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iMo3709b = iVersions.mo3709b(context, str);
        selectionResult.f4732a = iMo3709b;
        selectionResult.f4734c = iMo3709b != 0 ? -1 : 0;
        return selectionResult;
    }
}
