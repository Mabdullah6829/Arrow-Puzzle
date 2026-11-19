package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzco extends zzbm implements zzcp {
    public zzco() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcn(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z;
        zzcs zzcqVar = null;
        zzcv zzctVar = null;
        zzcs zzcqVar2 = null;
        zzcs zzcqVar3 = null;
        zzcs zzcqVar4 = null;
        zzcs zzcqVar5 = null;
        zzcy zzcwVar = null;
        zzcy zzcwVar2 = null;
        zzcy zzcwVar3 = null;
        zzcs zzcqVar6 = null;
        zzcs zzcqVar7 = null;
        zzcs zzcqVar8 = null;
        zzcs zzcqVar9 = null;
        zzcs zzcqVar10 = null;
        zzcs zzcqVar11 = null;
        zzda zzczVar = null;
        zzcs zzcqVar12 = null;
        zzcs zzcqVar13 = null;
        zzcs zzcqVar14 = null;
        zzcs zzcqVar15 = null;
        zzcs zzcqVar16 = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzdb zzdbVar = (zzdb) zzbn.m9818a(parcel, zzdb.CREATOR);
                long j2 = parcel.readLong();
                zzbn.m9821d(parcel);
                initialize(iObjectWrapperM3696k0, zzdbVar, j2);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j3 = parcel.readLong();
                zzbn.m9821d(parcel);
                logEvent(string, string2, bundle, z2, z3, j3);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar = iInterfaceQueryLocalInterface instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface : new zzcq(strongBinder);
                }
                zzcs zzcsVar = zzcqVar;
                long j4 = parcel.readLong();
                zzbn.m9821d(parcel);
                logEventAndBundle(string3, string4, bundle2, zzcsVar, j4);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                ClassLoader classLoader = zzbn.f22329a;
                z = parcel.readInt() != 0;
                long j5 = parcel.readLong();
                zzbn.m9821d(parcel);
                setUserProperty(string5, string6, iObjectWrapperM3696k1, z, j5);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = zzbn.f22329a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar16 = iInterfaceQueryLocalInterface2 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface2 : new zzcq(strongBinder2);
                }
                zzbn.m9821d(parcel);
                getUserProperties(string7, string8, z, zzcqVar16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar15 = iInterfaceQueryLocalInterface3 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface3 : new zzcq(strongBinder3);
                }
                zzbn.m9821d(parcel);
                getMaxUserProperties(string9, zzcqVar15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j6 = parcel.readLong();
                zzbn.m9821d(parcel);
                setUserId(string10, j6);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                long j7 = parcel.readLong();
                zzbn.m9821d(parcel);
                setConditionalUserProperty(bundle3, j7);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                zzbn.m9821d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar14 = iInterfaceQueryLocalInterface4 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface4 : new zzcq(strongBinder4);
                }
                zzbn.m9821d(parcel);
                getConditionalUserProperties(string13, string14, zzcqVar14);
                break;
            case 11:
                ClassLoader classLoader3 = zzbn.f22329a;
                z = parcel.readInt() != 0;
                long j8 = parcel.readLong();
                zzbn.m9821d(parcel);
                setMeasurementEnabled(z, j8);
                break;
            case 12:
                long j9 = parcel.readLong();
                zzbn.m9821d(parcel);
                resetAnalyticsData(j9);
                break;
            case 13:
                long j10 = parcel.readLong();
                zzbn.m9821d(parcel);
                setMinimumSessionDuration(j10);
                break;
            case 14:
                long j11 = parcel.readLong();
                zzbn.m9821d(parcel);
                setSessionTimeoutDuration(j11);
                break;
            case 15:
                IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j12 = parcel.readLong();
                zzbn.m9821d(parcel);
                setCurrentScreen(iObjectWrapperM3696k2, string15, string16, j12);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar13 = iInterfaceQueryLocalInterface5 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface5 : new zzcq(strongBinder5);
                }
                zzbn.m9821d(parcel);
                getCurrentScreenName(zzcqVar13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar12 = iInterfaceQueryLocalInterface6 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface6 : new zzcq(strongBinder6);
                }
                zzbn.m9821d(parcel);
                getCurrentScreenClass(zzcqVar12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzczVar = iInterfaceQueryLocalInterface7 instanceof zzda ? (zzda) iInterfaceQueryLocalInterface7 : new zzcz(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                zzbn.m9821d(parcel);
                setInstanceIdProvider(zzczVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar11 = iInterfaceQueryLocalInterface8 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface8 : new zzcq(strongBinder8);
                }
                zzbn.m9821d(parcel);
                getCachedAppInstanceId(zzcqVar11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar10 = iInterfaceQueryLocalInterface9 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface9 : new zzcq(strongBinder9);
                }
                zzbn.m9821d(parcel);
                getAppInstanceId(zzcqVar10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar9 = iInterfaceQueryLocalInterface10 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface10 : new zzcq(strongBinder10);
                }
                zzbn.m9821d(parcel);
                getGmpAppId(zzcqVar9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar8 = iInterfaceQueryLocalInterface11 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface11 : new zzcq(strongBinder11);
                }
                zzbn.m9821d(parcel);
                generateEventId(zzcqVar8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j13 = parcel.readLong();
                zzbn.m9821d(parcel);
                beginAdUnitExposure(string17, j13);
                break;
            case 24:
                String string18 = parcel.readString();
                long j14 = parcel.readLong();
                zzbn.m9821d(parcel);
                endAdUnitExposure(string18, j14);
                break;
            case 25:
                IObjectWrapper iObjectWrapperM3696k3 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityStarted(iObjectWrapperM3696k3, j15);
                break;
            case 26:
                IObjectWrapper iObjectWrapperM3696k4 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                long j16 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityStopped(iObjectWrapperM3696k4, j16);
                break;
            case 27:
                IObjectWrapper iObjectWrapperM3696k5 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                long j17 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityCreated(iObjectWrapperM3696k5, bundle5, j17);
                break;
            case 28:
                IObjectWrapper iObjectWrapperM3696k6 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityDestroyed(iObjectWrapperM3696k6, j18);
                break;
            case 29:
                IObjectWrapper iObjectWrapperM3696k7 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityPaused(iObjectWrapperM3696k7, j19);
                break;
            case 30:
                IObjectWrapper iObjectWrapperM3696k8 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                long j20 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityResumed(iObjectWrapperM3696k8, j20);
                break;
            case 31:
                IObjectWrapper iObjectWrapperM3696k9 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar7 = iInterfaceQueryLocalInterface12 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface12 : new zzcq(strongBinder12);
                }
                long j21 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivitySaveInstanceState(iObjectWrapperM3696k9, zzcqVar7, j21);
                break;
            case 32:
                Bundle bundle6 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar6 = iInterfaceQueryLocalInterface13 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface13 : new zzcq(strongBinder13);
                }
                long j22 = parcel.readLong();
                zzbn.m9821d(parcel);
                performAction(bundle6, zzcqVar6, j22);
                break;
            case 33:
                int i4 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperM3696k10 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperM3696k11 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperM3696k12 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzbn.m9821d(parcel);
                logHealthData(i4, string19, iObjectWrapperM3696k10, iObjectWrapperM3696k11, iObjectWrapperM3696k12);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcwVar3 = iInterfaceQueryLocalInterface14 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface14 : new zzcw(strongBinder14);
                }
                zzbn.m9821d(parcel);
                setEventInterceptor(zzcwVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcwVar2 = iInterfaceQueryLocalInterface15 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface15 : new zzcw(strongBinder15);
                }
                zzbn.m9821d(parcel);
                registerOnMeasurementEventListener(zzcwVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcwVar = iInterfaceQueryLocalInterface16 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface16 : new zzcw(strongBinder16);
                }
                zzbn.m9821d(parcel);
                unregisterOnMeasurementEventListener(zzcwVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(zzbn.f22329a);
                zzbn.m9821d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar5 = iInterfaceQueryLocalInterface17 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface17 : new zzcq(strongBinder17);
                }
                int i5 = parcel.readInt();
                zzbn.m9821d(parcel);
                getTestFlag(zzcqVar5, i5);
                break;
            case 39:
                ClassLoader classLoader4 = zzbn.f22329a;
                z = parcel.readInt() != 0;
                zzbn.m9821d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar4 = iInterfaceQueryLocalInterface18 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface18 : new zzcq(strongBinder18);
                }
                zzbn.m9821d(parcel);
                isDataCollectionEnabled(zzcqVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                zzbn.m9821d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j23 = parcel.readLong();
                zzbn.m9821d(parcel);
                clearMeasurementEnabled(j23);
                break;
            case 44:
                Bundle bundle8 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                zzbn.m9821d(parcel);
                setConsent(bundle8, j24);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                zzbn.m9821d(parcel);
                setConsentThirdParty(bundle9, j25);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar3 = iInterfaceQueryLocalInterface19 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface19 : new zzcq(strongBinder19);
                }
                zzbn.m9821d(parcel);
                getSessionId(zzcqVar3);
                break;
            case 48:
                Intent intent = (Intent) zzbn.m9818a(parcel, Intent.CREATOR);
                zzbn.m9821d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdd zzddVar = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j26 = parcel.readLong();
                zzbn.m9821d(parcel);
                setCurrentScreenByScionActivityInfo(zzddVar, string20, string21, j26);
                break;
            case 51:
                zzdd zzddVar2 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                long j27 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityStartedByScionActivityInfo(zzddVar2, j27);
                break;
            case 52:
                zzdd zzddVar3 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                long j28 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityStoppedByScionActivityInfo(zzddVar3, j28);
                break;
            case 53:
                zzdd zzddVar4 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                Bundle bundle10 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                long j29 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityCreatedByScionActivityInfo(zzddVar4, bundle10, j29);
                break;
            case 54:
                zzdd zzddVar5 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                long j30 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityDestroyedByScionActivityInfo(zzddVar5, j30);
                break;
            case 55:
                zzdd zzddVar6 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                long j31 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityPausedByScionActivityInfo(zzddVar6, j31);
                break;
            case 56:
                zzdd zzddVar7 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                long j32 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivityResumedByScionActivityInfo(zzddVar7, j32);
                break;
            case 57:
                zzdd zzddVar8 = (zzdd) zzbn.m9818a(parcel, zzdd.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar2 = iInterfaceQueryLocalInterface20 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface20 : new zzcq(strongBinder20);
                }
                long j33 = parcel.readLong();
                zzbn.m9821d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzddVar8, zzcqVar2, j33);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    zzctVar = iInterfaceQueryLocalInterface21 instanceof zzcv ? (zzcv) iInterfaceQueryLocalInterface21 : new zzct(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                }
                zzbn.m9821d(parcel);
                retrieveAndUploadBatches(zzctVar);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                long j34 = parcel.readLong();
                long j35 = parcel.readLong();
                zzbn.m9821d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z4, z5, j34, j35);
                break;
            case 60:
                IObjectWrapper iObjectWrapperM3696k13 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzdb zzdbVar2 = (zzdb) zzbn.m9818a(parcel, zzdb.CREATOR);
                long j36 = parcel.readLong();
                long j37 = parcel.readLong();
                zzbn.m9821d(parcel);
                initializeWithElapsedTime(iObjectWrapperM3696k13, zzdbVar2, j36, j37);
                break;
            case 61:
                long j38 = parcel.readLong();
                long j39 = parcel.readLong();
                zzbn.m9821d(parcel);
                resetAnalyticsDataWithElapsedTime(j38, j39);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
