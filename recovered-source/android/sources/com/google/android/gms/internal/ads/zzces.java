package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzces extends zzbem implements zzcet {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9849s = 0;

    public zzces() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        ObjectWrapper objectWrapper;
        zzceq zzceoVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzcex zzcexVar = (zzcex) zzben.m4814b(parcel, zzcex.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzceoVar = iInterfaceQueryLocalInterface instanceof zzceq ? (zzceq) iInterfaceQueryLocalInterface : new zzceo(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                zzben.m4818f(parcel);
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzap) this).mo3322E0(iObjectWrapperM3696k0, zzcexVar, zzceoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperM2440g = AbstractC1456a.m2440g(parcel, parcel);
                com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzap) this;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8835x8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) ObjectWrapper.m3697u0(iObjectWrapperM2440g);
                    zzcaa zzcaaVar = zzapVar.f3844A;
                    View view = zzcaaVar != null ? zzcaaVar.f9577s : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    zzapVar.f3845B = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        zzapVar.f3846C = zzapVar.f3845B;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = zzapVar.f3845B;
                    motionEventObtain.setLocation(point.x, point.y);
                    zzapVar.f3871v.f7501b.mo3255b(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbzx zzbzxVarM5281k4 = zzbzw.m5281k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzap) this).m3324k4(arrayListCreateTypedArrayList, iObjectWrapperM3696k1, zzbzxVarM5281k4, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbzx zzbzxVarM5281k5 = zzbzw.m5281k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzap) this).m3325l4(arrayListCreateTypedArrayList2, iObjectWrapperM3696k2, zzbzxVarM5281k5, false);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcaa zzcaaVar2 = (zzcaa) zzben.m4814b(parcel, zzcaa.CREATOR);
                zzben.m4818f(parcel);
                com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzap) this;
                zzapVar2.f3844A = zzcaaVar2;
                zzapVar2.f3873x.m6530a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzap) this).m3323d3(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbzx zzbzxVarM5281k6 = zzbzw.m5281k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzap) this).m3324k4(arrayListCreateTypedArrayList3, iObjectWrapperM3696k3, zzbzxVarM5281k6, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbzx zzbzxVarM5281k7 = zzbzw.m5281k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzap) this).m3325l4(arrayListCreateTypedArrayList4, iObjectWrapperM3696k4, zzbzxVarM5281k7, true);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperM2440g2 = AbstractC1456a.m2440g(parcel, parcel);
                com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar3 = (com.google.android.gms.ads.nonagon.signalgeneration.zzap) this;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8617kb)).booleanValue()) {
                    Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapperM3696k5);
                    CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.m3697u0(iObjectWrapperM3696k6);
                    CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.m3697u0(iObjectWrapperM2440g2);
                    zzbkc zzbkcVar = zzapVar3.f3866W;
                    zzbkcVar.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (customTabsClient == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    zzbkcVar.f8962l = context;
                    zzbkcVar.f8958h = string;
                    zzdzy zzdzyVar = zzbkcVar.f8954d;
                    zzbjz zzbjzVar = new zzbjz(zzbkcVar, customTabsCallback, zzdzyVar);
                    zzbkcVar.f8956f = zzbjzVar;
                    CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(zzbjzVar);
                    zzbkcVar.f8957g = customTabsSessionNewSession;
                    if (customTabsSessionNewSession == null) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3070c("CustomTabsClient failed to create new session.");
                    }
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3348d(zzdzyVar, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) zzblc.f9108e.m5057c()).booleanValue()) {
                        com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar = zzapVar3.f3867X;
                        synchronized (zzjVar) {
                            zzjVar.m3336c(true);
                            zzjVar.m3336c(false);
                        }
                    }
                    if (((Boolean) zzblc.f9106c.m5057c()).booleanValue()) {
                        zzapVar3.f3868Y.m3314a(null);
                    }
                    objectWrapper = new ObjectWrapper(zzbkcVar.f8957g);
                } else {
                    objectWrapper = new ObjectWrapper(null);
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, objectWrapper);
                return true;
            default:
                return false;
        }
    }
}
