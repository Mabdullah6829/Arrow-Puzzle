package com.google.android.gms.internal.ads;

import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftu {

    /* JADX INFO: renamed from: a */
    public final String f16520a;

    /* JADX INFO: renamed from: b */
    public final AdFormat f16521b;

    /* JADX INFO: renamed from: c */
    public final String f16522c;

    public /* synthetic */ zzftu(zzftt zzfttVar) {
        this.f16520a = zzfttVar.f16517a;
        this.f16521b = zzfttVar.f16518b;
        this.f16522c = zzfttVar.f16519c;
    }

    /* JADX INFO: renamed from: a */
    public final String m6694a() {
        AdFormat adFormat = this.f16521b;
        return adFormat == null ? EnvironmentCompat.MEDIA_UNKNOWN : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzftu) {
            zzftu zzftuVar = (zzftu) obj;
            if (this.f16520a.equals(zzftuVar.f16520a) && (adFormat = this.f16521b) != null && (adFormat2 = zzftuVar.f16521b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16520a, this.f16521b);
    }
}
