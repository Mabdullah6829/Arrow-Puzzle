package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public class AdLoader {

    /* JADX INFO: renamed from: a */
    public final zzq f2940a;

    /* JADX INFO: renamed from: b */
    public final Context f2941b;

    /* JADX INFO: renamed from: c */
    public final zzbn f2942c;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final Context f2943a;

        /* JADX INFO: renamed from: b */
        public final zzbq f2944b;

        public Builder(Context context, String str) {
            Preconditions.m3545i(context, "context cannot be null");
            zzbq zzbqVarM2803c = zzay.f3085g.f3087b.m2803c(context, str, new zzbvf());
            this.f2943a = context;
            this.f2944b = zzbqVarM2803c;
        }

        /* JADX INFO: renamed from: a */
        public final AdLoader m2749a() {
            Context context = this.f2943a;
            try {
                return new AdLoader(context, this.f2944b.mo2830a(), zzq.f3248a);
            } catch (RemoteException e) {
                zzo.m3071d("Failed to build AdLoader.", e);
                return new AdLoader(context, new zzff().m2950k4(), zzq.f3248a);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2750b(AdListener adListener) {
            try {
                this.f2944b.mo2832u2(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzo.m3074g("Failed to set AdListener.", e);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m2751c(NativeAdOptions nativeAdOptions) {
            try {
                zzbq zzbqVar = this.f2944b;
                boolean z = nativeAdOptions.f3758a;
                VideoOptions videoOptions = nativeAdOptions.f3762e;
                zzbqVar.mo2831t0(new zzbma(4, z, -1, nativeAdOptions.f3760c, nativeAdOptions.f3761d, videoOptions != null ? new zzfw(videoOptions) : null, nativeAdOptions.f3763f, nativeAdOptions.f3759b, nativeAdOptions.f3765h, nativeAdOptions.f3764g, nativeAdOptions.f3766i - 1));
            } catch (RemoteException e) {
                zzo.m3074g("Failed to specify native ad options", e);
            }
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzq zzqVar) {
        this.f2941b = context;
        this.f2942c = zzbnVar;
        this.f2940a = zzqVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m2748a(AdRequest adRequest) {
        final zzeh zzehVar = adRequest.f2945a;
        Context context = this.f2941b;
        zzbix.m5032a(context);
        if (((Boolean) zzbkv.f9041c.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdLoader adLoader = this.f4024s;
                        zzeh zzehVar2 = zzehVar;
                        try {
                            zzbn zzbnVar = adLoader.f2942c;
                            zzq zzqVar = adLoader.f2940a;
                            Context context2 = adLoader.f2941b;
                            zzqVar.getClass();
                            zzbnVar.mo2824Z(zzq.m2979a(context2, zzehVar2));
                        } catch (RemoteException e) {
                            zzo.m3071d("Failed to load ad.", e);
                        }
                    }
                });
                return;
            }
        }
        try {
            zzbn zzbnVar = this.f2942c;
            this.f2940a.getClass();
            zzbnVar.mo2824Z(zzq.m2979a(context, zzehVar));
        } catch (RemoteException e) {
            zzo.m3071d("Failed to load ad.", e);
        }
    }
}
