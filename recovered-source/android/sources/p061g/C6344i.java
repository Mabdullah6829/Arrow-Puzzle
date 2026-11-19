package p061g;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6344i {

    /* JADX INFO: renamed from: a */
    public AppOpenAd f24398a;

    /* JADX INFO: renamed from: b */
    public boolean f24399b;

    /* JADX INFO: renamed from: c */
    public boolean f24400c;

    /* JADX INFO: renamed from: d */
    public long f24401d;

    /* JADX INFO: renamed from: a */
    public final void m12154a(Context context) {
        if (this.f24399b) {
            return;
        }
        if (this.f24398a == null || new Date().getTime() - this.f24401d >= 14400000) {
            this.f24399b = true;
            AppOpenAd.m2765b(context, AbstractC0355G.f694F, new AdRequest(new AdRequest.Builder()), new C6342g(this));
        }
    }
}
