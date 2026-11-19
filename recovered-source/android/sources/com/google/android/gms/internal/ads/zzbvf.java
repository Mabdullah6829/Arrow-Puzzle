package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvf extends zzbvi {
    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: D */
    public final boolean mo5152D(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbvf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: G */
    public final boolean mo5153G(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbvf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: m */
    public final zzbvm mo5154m(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbvf.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbwk((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbwk((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new zzbwk(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new zzbwk(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            com.google.android.gms.ads.internal.util.client.zzo.m3074g(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    /* JADX INFO: renamed from: y */
    public final zzbxi mo5155y(String str) throws RemoteException {
        try {
            return new zzbxv((RtbAdapter) Class.forName(str, false, zzbxm.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
