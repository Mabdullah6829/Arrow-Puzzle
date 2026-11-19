package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo3707a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f4732a = iVersions.mo3709b(context, str);
        int i2 = 1;
        int iMo3708a = iVersions.mo3708a(context, str, true);
        selectionResult.f4733b = iMo3708a;
        int i3 = selectionResult.f4732a;
        if (i3 == 0) {
            i3 = 0;
            if (iMo3708a == 0) {
                i2 = 0;
            } else if (i3 >= iMo3708a) {
                i2 = -1;
            }
        } else if (i3 >= iMo3708a) {
            i2 = -1;
        }
        selectionResult.f4734c = i2;
        return selectionResult;
    }
}
