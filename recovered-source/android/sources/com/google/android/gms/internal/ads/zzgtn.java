package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtn {

    /* JADX INFO: renamed from: a */
    public final String f18177a;

    /* JADX INFO: renamed from: b */
    public final zzgtm f18178b;

    /* JADX INFO: renamed from: c */
    public zzgtm f18179c;

    public /* synthetic */ zzgtn(String str) {
        zzgtm zzgtmVar = new zzgtm();
        this.f18178b = zzgtmVar;
        this.f18179c = zzgtmVar;
        this.f18177a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f18177a);
        sb.append('{');
        zzgtm zzgtmVar = this.f18178b.f18176b;
        String str = "";
        while (zzgtmVar != null) {
            Object obj = zzgtmVar.f18175a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgtmVar = zzgtmVar.f18176b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
