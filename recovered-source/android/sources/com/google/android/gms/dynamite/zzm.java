package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzm implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo3707a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iMo3708a;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iMo3709b = iVersions.mo3709b(context, str);
        selectionResult.f4732a = iMo3709b;
        int i2 = 1;
        int i3 = 0;
        if (iMo3709b != 0) {
            iMo3708a = iVersions.mo3708a(context, str, false);
            selectionResult.f4733b = iMo3708a;
        } else {
            iMo3708a = iVersions.mo3708a(context, str, true);
            selectionResult.f4733b = iMo3708a;
        }
        int i4 = selectionResult.f4732a;
        if (i4 == 0) {
            if (iMo3708a == 0) {
                i2 = 0;
            }
            selectionResult.f4734c = i2;
            return selectionResult;
        }
        i3 = i4;
        if (iMo3708a < i3) {
            i2 = -1;
        }
        selectionResult.f4734c = i2;
        return selectionResult;
    }
}
