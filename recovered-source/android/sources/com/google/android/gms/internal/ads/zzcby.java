package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcby extends zzbem implements zzcbz {
    public zzcby() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        com.google.android.gms.ads.internal.client.zzby zzbwVar;
        Bundle bundle;
        zzclb zzclbVar;
        zzdvu zzdvuVar;
        if (i2 == 1) {
            zzccd zzccdVar = (zzccd) zzben.m4814b(parcel, zzccd.CREATOR);
            zzben.m4818f(parcel);
            ((zzfkk) this).m6475k4(zzccdVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 2) {
            ((zzfkk) this).zzc();
            parcel2.writeNoException();
            return true;
        }
        IInterface zzccaVar = null;
        if (i2 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                zzccaVar = iInterfaceQueryLocalInterface instanceof zzccc ? (zzccc) iInterfaceQueryLocalInterface : new zzcca(strongBinder);
            }
            zzben.m4818f(parcel);
            Preconditions.m3540d("setRewardedVideoAdListener can only be called from the UI thread.");
            ((zzfkk) this).f15869t.f15813w.set(zzccaVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 34) {
            boolean zM4813a = zzben.m4813a(parcel);
            zzben.m4818f(parcel);
            zzfkk zzfkkVar = (zzfkk) this;
            synchronized (zzfkkVar) {
                Preconditions.m3540d("setImmersiveMode must be called on the main UI thread.");
                zzfkkVar.f15872w = zM4813a;
            }
            parcel2.writeNoException();
            return true;
        }
        int i3 = 0;
        switch (i2) {
            case 5:
                Preconditions.m3540d("isLoaded must be called on the main UI thread.");
                boolean zM6477m4 = ((zzfkk) this).m6477m4();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zM6477m4 ? 1 : 0);
                return true;
            case 6:
                ((zzfkk) this).m6472R2(null);
                parcel2.writeNoException();
                return true;
            case 7:
                ((zzfkk) this).m6473d3(null);
                parcel2.writeNoException();
                return true;
            case 8:
                ((zzfkk) this).m6476l4(null);
                parcel2.writeNoException();
                return true;
            case 9:
                ((zzfkk) this).m6472R2(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 10:
                ((zzfkk) this).m6473d3(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                ((zzfkk) this).m6476l4(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 12:
                String strZzl = ((zzfkk) this).zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 13:
                String string = parcel.readString();
                zzben.m4818f(parcel);
                zzfkk zzfkkVar2 = (zzfkk) this;
                synchronized (zzfkkVar2) {
                    Preconditions.m3540d("setUserId must be called on the main UI thread.");
                    zzfkkVar2.f15870u.f16007a = string;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) iInterfaceQueryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzbw(strongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
                }
                zzben.m4818f(parcel);
                zzfkk zzfkkVar3 = (zzfkk) this;
                zzfjr zzfjrVar = zzfkkVar3.f15869t;
                Preconditions.m3540d("setAdMetadataListener can only be called from the UI thread.");
                if (zzbwVar == null) {
                    zzfjrVar.f15810t.set(null);
                } else {
                    zzfjrVar.f15810t.set(new zzfkj(zzfkkVar3, zzbwVar));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Preconditions.m3540d("getAdMetadata can only be called from the UI thread.");
                zzdvu zzdvuVar2 = ((zzfkk) this).f15871v;
                if (zzdvuVar2 != null) {
                    zzdet zzdetVar = zzdvuVar2.f13131q;
                    synchronized (zzdetVar) {
                        bundle = new Bundle(zzdetVar.f12104t);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundle);
                return true;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzccaVar = iInterfaceQueryLocalInterface3 instanceof zzcbx ? (zzcbx) iInterfaceQueryLocalInterface3 : new zzcbx(strongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                }
                zzben.m4818f(parcel);
                Preconditions.m3540d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                ((zzfkk) this).f15869t.f15815y.set(zzccaVar);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                ((zzfkk) this).m6474g2(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                zzfkk zzfkkVar4 = (zzfkk) this;
                synchronized (zzfkkVar4) {
                    Preconditions.m3540d("#008 Must be called on the main UI thread.: setCustomData");
                    zzfkkVar4.f15870u.f16008b = string2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                zzdvu zzdvuVar3 = ((zzfkk) this).f15871v;
                if (zzdvuVar3 != null && (zzclbVar = (zzclb) zzdvuVar3.f13127m.get()) != null && !zzclbVar.mo5621y0()) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(i3);
                return true;
            case 21:
                zzfkk zzfkkVar5 = (zzfkk) this;
                synchronized (zzfkkVar5) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8095F7)).booleanValue() && (zzdvuVar = zzfkkVar5.f15871v) != null) {
                        zzccaVar = zzdvuVar.f11764f;
                    }
                    break;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzccaVar);
                return true;
            default:
                return false;
        }
    }
}
