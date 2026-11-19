package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmh extends zzbem implements zzbmi {
    public zzbmh() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        float f2;
        zzcnl zzcnlVarMo5609p;
        int i3;
        int i4;
        zzbnq zzbnqVar;
        float fMo2922e = 0.0f;
        switch (i2) {
            case 2:
                zzdpj zzdpjVar = (zzdpj) this;
                zzdqb zzdqbVar = zzdpjVar.f12534s;
                synchronized (zzdqbVar) {
                    f2 = zzdqbVar.f12633x;
                }
                if (f2 != 0.0f) {
                    synchronized (zzdqbVar) {
                        fMo2922e = zzdqbVar.f12633x;
                    }
                } else if (zzdqbVar.m6012r() != null) {
                    try {
                        fMo2922e = zzdqbVar.m6012r().mo2922e();
                    } catch (RemoteException e) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Remote exception getting video controller aspect ratio.", e);
                    }
                    break;
                } else {
                    IObjectWrapper iObjectWrapper = zzdpjVar.f12535t;
                    if (iObjectWrapper != null) {
                        fMo2922e = zzdpj.m5976k4(iObjectWrapper);
                    } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8254Od)).booleanValue() || zzdqbVar.m6006i() == null || (zzcnlVarMo5609p = zzdqbVar.m6006i().mo5609p()) == null || (i3 = zzcnlVarMo5609p.f10603c) < 0 || (i4 = zzcnlVarMo5609p.f10602b) <= 0) {
                        zzbml zzbmlVarM5999b = zzdqbVar.m5999b();
                        if (zzbmlVarM5999b != null) {
                            float fMo5058a = (zzbmlVarM5999b.mo5058a() == -1 || zzbmlVarM5999b.mo5059b() == -1) ? 0.0f : zzbmlVarM5999b.mo5058a() / zzbmlVarM5999b.mo5059b();
                            fMo2922e = fMo5058a == 0.0f ? zzdpj.m5976k4(zzbmlVarM5999b.zzb()) : fMo5058a;
                        }
                    } else {
                        fMo2922e = i3 / i4;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fMo2922e);
                return true;
            case 3:
                ((zzdpj) this).f12535t = AbstractC1456a.m2440g(parcel, parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperMo5065c = ((zzdpj) this).mo5065c();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5065c);
                return true;
            case 5:
                zzdqb zzdqbVar2 = ((zzdpj) this).f12534s;
                fMo2922e = zzdqbVar2.m6012r() != null ? zzdqbVar2.m6012r().zzj() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fMo2922e);
                return true;
            case 6:
                zzdqb zzdqbVar3 = ((zzdpj) this).f12534s;
                fMo2922e = zzdqbVar3.m6012r() != null ? zzdqbVar3.m6012r().zzk() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fMo2922e);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = ((zzdpj) this).f12534s.m6012r();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarM6012r);
                return true;
            case 8:
                boolean zZzk = ((zzdpj) this).zzk();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbnqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbnqVar = iInterfaceQueryLocalInterface instanceof zzbnq ? (zzbnq) iInterfaceQueryLocalInterface : new zzbnq(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                }
                zzben.m4818f(parcel);
                zzdqb zzdqbVar4 = ((zzdpj) this).f12534s;
                if (zzdqbVar4.m6012r() instanceof zzcmh) {
                    zzcmh zzcmhVar = (zzcmh) zzdqbVar4.m6012r();
                    synchronized (zzcmhVar.f10565t) {
                        zzcmhVar.f10563F = zzbnqVar;
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzl = ((zzdpj) this).zzl();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
