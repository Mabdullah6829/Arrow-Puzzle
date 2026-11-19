package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz {

    /* JADX INFO: renamed from: a */
    public String f21433a;

    /* JADX INFO: renamed from: b */
    public Uri f21434b;

    /* JADX INFO: renamed from: c */
    public final List f21435c;

    /* JADX INFO: renamed from: d */
    public final zzgwt f21436d;

    /* JADX INFO: renamed from: e */
    public final zzai f21437e;

    public zzz() {
        new zzaa();
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwt zzgwtVar = zzgyo.f18355w;
        this.f21435c = Collections.EMPTY_LIST;
        this.f21436d = zzgyo.f18355w;
        new zzae();
        this.f21437e = zzai.f5403a;
    }

    /* JADX INFO: renamed from: a */
    public final zzak m9054a() {
        Uri uri = this.f21434b;
        zzag zzagVar = uri != null ? new zzag(uri, this.f21435c, this.f21436d) : null;
        String str = this.f21433a;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(), zzagVar, new zzaf(), zzan.f6067B, this.f21437e);
    }
}
