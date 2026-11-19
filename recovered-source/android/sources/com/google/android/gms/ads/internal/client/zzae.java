package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcaf;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OutOfContextTestingActivity f3036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbvf f3037c;

    public zzae(zzaw zzawVar, OutOfContextTestingActivity outOfContextTestingActivity, zzbvf zzbvfVar) {
        this.f3036b = outOfContextTestingActivity;
        this.f3037c = zzbvfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3036b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f3036b;
        ObjectWrapper objectWrapper = new ObjectWrapper(outOfContextTestingActivity);
        zzbix.m5032a(outOfContextTestingActivity);
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8166Ja)).booleanValue()) {
            try {
                return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.m3079a(outOfContextTestingActivity, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzad
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    /* JADX INFO: renamed from: a */
                    public final Object mo2799a(IBinder iBinder) {
                        IBinder iBinder2 = iBinder;
                        if (iBinder2 == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof zzdu ? (zzdu) iInterfaceQueryLocalInterface : new zzdu(iBinder2, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    }
                })).m2916D0(objectWrapper, this.f3037c);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcaf.m5286c(outOfContextTestingActivity).mo5291a("ClientApiBroker.getOutOfContextTester", e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f3036b;
        ObjectWrapper objectWrapper = new ObjectWrapper(outOfContextTestingActivity);
        zzbix.m5032a(outOfContextTestingActivity);
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8166Ja)).booleanValue()) {
            return zzcoVar.mo2791f3(objectWrapper, this.f3037c, 261710000);
        }
        return null;
    }
}
