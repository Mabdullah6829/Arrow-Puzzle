package com.google.android.gms.internal.measurement;

import android.content.Context;
import p001B.InterfaceC0082h;
import p003C.AbstractC0120k;

/* JADX INFO: loaded from: classes2.dex */
final class zzon {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0082h f22698a;

    /* JADX INFO: renamed from: b */
    public final boolean f22699b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0120k f22700c;

    /* JADX INFO: renamed from: d */
    public volatile String f22701d = null;

    public zzon(InterfaceC0082h interfaceC0082h, boolean z, AbstractC0120k abstractC0120k) {
        this.f22698a = interfaceC0082h;
        this.f22699b = z;
        this.f22700c = abstractC0120k;
    }

    /* JADX INFO: renamed from: a */
    public final String m10578a(Context context) {
        String str = this.f22701d;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.f22698a.apply(context);
        this.f22701d = str2;
        return str2;
    }
}
