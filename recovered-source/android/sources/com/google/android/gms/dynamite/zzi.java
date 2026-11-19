package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzi implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo3707a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iMo3708a = iVersions.mo3708a(context, str, false);
        selectionResult.f4733b = iMo3708a;
        selectionResult.f4734c = iMo3708a != 0 ? 1 : 0;
        return selectionResult;
    }
}
