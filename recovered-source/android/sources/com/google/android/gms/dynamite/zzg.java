package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzg implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo3707a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iMo3708a = iVersions.mo3708a(context, str, true);
        selectionResult.f4733b = iMo3708a;
        if (iMo3708a != 0) {
            selectionResult.f4734c = 1;
            return selectionResult;
        }
        int iMo3709b = iVersions.mo3709b(context, str);
        selectionResult.f4732a = iMo3709b;
        if (iMo3709b != 0) {
            selectionResult.f4734c = -1;
        }
        return selectionResult;
    }
}
