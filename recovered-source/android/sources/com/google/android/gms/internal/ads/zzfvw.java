package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvw {

    /* JADX INFO: renamed from: b */
    public static final Pattern f16681b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    public final ArrayList f16682a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m6733a(View view, zzfvb zzfvbVar) {
        zzfvv zzfvvVar;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f16681b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f16682a;
        int size = arrayList.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                zzfvvVar = null;
                break;
            } else {
                Object obj = arrayList.get(i2);
                i2++;
                zzfvvVar = (zzfvv) obj;
            }
        } while (zzfvvVar.f16677a.get() != view);
        if (zzfvvVar == null) {
            arrayList.add(new zzfvv(view, zzfvbVar));
        }
    }
}
