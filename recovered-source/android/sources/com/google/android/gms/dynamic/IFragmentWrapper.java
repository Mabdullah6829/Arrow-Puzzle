package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* JADX INFO: renamed from: u */
        public final boolean mo3533u(int i2, Parcel parcel, Parcel parcel2) {
            boolean z;
            switch (i2) {
                case 2:
                    ObjectWrapper objectWrapperZzb = zzb();
                    parcel2.writeNoException();
                    zzc.m9104b(parcel2, objectWrapperZzb);
                    return true;
                case 3:
                    Bundle bundleZzc = zzc();
                    parcel2.writeNoException();
                    int i3 = zzc.f21582a;
                    if (bundleZzc == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        bundleZzc.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 4:
                    int iMo3687d = mo3687d();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo3687d);
                    return true;
                case 5:
                    IFragmentWrapper iFragmentWrapperMo3683a = mo3683a();
                    parcel2.writeNoException();
                    zzc.m9104b(parcel2, iFragmentWrapperMo3683a);
                    return true;
                case 6:
                    ObjectWrapper objectWrapperMo3685b = mo3685b();
                    parcel2.writeNoException();
                    zzc.m9104b(parcel2, objectWrapperMo3685b);
                    return true;
                case 7:
                    boolean zMo3686c = mo3686c();
                    parcel2.writeNoException();
                    int i4 = zzc.f21582a;
                    parcel2.writeInt(zMo3686c ? 1 : 0);
                    return true;
                case 8:
                    String strZzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzh);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperZzi = zzi();
                    parcel2.writeNoException();
                    zzc.m9104b(parcel2, iFragmentWrapperZzi);
                    return true;
                case 10:
                    int iZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzj);
                    return true;
                case 11:
                    boolean zZzk = zzk();
                    parcel2.writeNoException();
                    int i5 = zzc.f21582a;
                    parcel2.writeInt(zZzk ? 1 : 0);
                    return true;
                case 12:
                    ObjectWrapper objectWrapperZzl = zzl();
                    parcel2.writeNoException();
                    zzc.m9104b(parcel2, objectWrapperZzl);
                    return true;
                case 13:
                    boolean zMo3688e = mo3688e();
                    parcel2.writeNoException();
                    int i6 = zzc.f21582a;
                    parcel2.writeInt(zMo3688e ? 1 : 0);
                    return true;
                case 14:
                    boolean zMo3690g = mo3690g();
                    parcel2.writeNoException();
                    int i7 = zzc.f21582a;
                    parcel2.writeInt(zMo3690g ? 1 : 0);
                    return true;
                case 15:
                    boolean zMo3693j = mo3693j();
                    parcel2.writeNoException();
                    int i8 = zzc.f21582a;
                    parcel2.writeInt(zMo3693j ? 1 : 0);
                    return true;
                case 16:
                    boolean zMo3692i = mo3692i();
                    parcel2.writeNoException();
                    int i9 = zzc.f21582a;
                    parcel2.writeInt(zMo3692i ? 1 : 0);
                    return true;
                case 17:
                    boolean zMo3689f = mo3689f();
                    parcel2.writeNoException();
                    int i10 = zzc.f21582a;
                    parcel2.writeInt(zMo3689f ? 1 : 0);
                    return true;
                case 18:
                    boolean zMo3695n = mo3695n();
                    parcel2.writeNoException();
                    int i11 = zzc.f21582a;
                    parcel2.writeInt(zMo3695n ? 1 : 0);
                    return true;
                case 19:
                    boolean zMo3691h = mo3691h();
                    parcel2.writeNoException();
                    int i12 = zzc.f21582a;
                    parcel2.writeInt(zMo3691h ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                    zzc.m9105c(parcel);
                    mo3679T(iObjectWrapperM3696k0);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    int i13 = zzc.f21582a;
                    z = parcel.readInt() != 0;
                    zzc.m9105c(parcel);
                    mo3681V(z);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    int i14 = zzc.f21582a;
                    z = parcel.readInt() != 0;
                    zzc.m9105c(parcel);
                    mo3684a1(z);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    int i15 = zzc.f21582a;
                    z = parcel.readInt() != 0;
                    zzc.m9105c(parcel);
                    mo3678S(z);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int i16 = zzc.f21582a;
                    z = parcel.readInt() != 0;
                    zzc.m9105c(parcel);
                    mo3680T3(z);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.m9103a(parcel, Intent.CREATOR);
                    zzc.m9105c(parcel);
                    mo3694j3(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.m9103a(parcel, Intent.CREATOR);
                    int i17 = parcel.readInt();
                    zzc.m9105c(parcel);
                    mo3682V1(intent2, i17);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                    zzc.m9105c(parcel);
                    mo3677L3(iObjectWrapperM3696k1);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    void mo3677L3(IObjectWrapper iObjectWrapper);

    /* JADX INFO: renamed from: S */
    void mo3678S(boolean z);

    /* JADX INFO: renamed from: T */
    void mo3679T(IObjectWrapper iObjectWrapper);

    /* JADX INFO: renamed from: T3 */
    void mo3680T3(boolean z);

    /* JADX INFO: renamed from: V */
    void mo3681V(boolean z);

    /* JADX INFO: renamed from: V1 */
    void mo3682V1(Intent intent, int i2);

    /* JADX INFO: renamed from: a */
    IFragmentWrapper mo3683a();

    /* JADX INFO: renamed from: a1 */
    void mo3684a1(boolean z);

    /* JADX INFO: renamed from: b */
    ObjectWrapper mo3685b();

    /* JADX INFO: renamed from: c */
    boolean mo3686c();

    /* JADX INFO: renamed from: d */
    int mo3687d();

    /* JADX INFO: renamed from: e */
    boolean mo3688e();

    /* JADX INFO: renamed from: f */
    boolean mo3689f();

    /* JADX INFO: renamed from: g */
    boolean mo3690g();

    /* JADX INFO: renamed from: h */
    boolean mo3691h();

    /* JADX INFO: renamed from: i */
    boolean mo3692i();

    /* JADX INFO: renamed from: j */
    boolean mo3693j();

    /* JADX INFO: renamed from: j3 */
    void mo3694j3(Intent intent);

    /* JADX INFO: renamed from: n */
    boolean mo3695n();

    ObjectWrapper zzb();

    Bundle zzc();

    String zzh();

    IFragmentWrapper zzi();

    int zzj();

    boolean zzk();

    ObjectWrapper zzl();
}
