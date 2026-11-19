package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcn extends zzbl implements zzcp {
    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void beginAdUnitExposure(String str, long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j2);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.m9819b(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void endAdUnitExposure(String str, long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j2);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void generateEventId(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getAppInstanceId(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCachedAppInstanceId(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenClass(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenName(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getGmpAppId(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getMaxUserProperties(String str, zzcs zzcsVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getSessionId(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(46, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getTestFlag(zzcs zzcsVar, int i2) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcsVar);
        parcelZza.writeInt(i2);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getUserProperties(String str, String str2, boolean z, zzcs zzcsVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        ClassLoader classLoader = zzbn.f22329a;
        parcelZza.writeInt(z ? 1 : 0);
        zzbn.m9820c(parcelZza, zzcsVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, iObjectWrapper);
        zzbn.m9819b(parcelZza, zzdbVar);
        parcelZza.writeLong(j2);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j2, long j3) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, iObjectWrapper);
        zzbn.m9819b(parcelZza, zzdbVar);
        parcelZza.writeLong(j2);
        parcelZza.writeLong(j3);
        zzc(60, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2, long j3) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.m9819b(parcelZza, bundle);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeInt(z2 ? 1 : 0);
        parcelZza.writeLong(j2);
        parcelZza.writeLong(j3);
        zzc(59, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        zzbn.m9820c(parcelZza, iObjectWrapper);
        zzbn.m9820c(parcelZza, iObjectWrapper2);
        zzbn.m9820c(parcelZza, iObjectWrapper3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        zzbn.m9819b(parcelZza, bundle);
        parcelZza.writeLong(j2);
        zzc(53, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        parcelZza.writeLong(j2);
        zzc(54, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        parcelZza.writeLong(j2);
        zzc(55, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        parcelZza.writeLong(j2);
        zzc(56, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        zzbn.m9820c(parcelZza, zzcsVar);
        parcelZza.writeLong(j2);
        zzc(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        parcelZza.writeLong(j2);
        zzc(51, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        parcelZza.writeLong(j2);
        zzc(52, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void performAction(Bundle bundle, zzcs zzcsVar, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, bundle);
        zzbn.m9820c(parcelZza, zzcsVar);
        parcelZza.writeLong(j2);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void registerOnMeasurementEventListener(zzcy zzcyVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcyVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void resetAnalyticsData(long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j2);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void resetAnalyticsDataWithElapsedTime(long j2, long j3) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j2);
        parcelZza.writeLong(j3);
        zzc(61, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void retrieveAndUploadBatches(zzcv zzcvVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcvVar);
        zzc(58, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, bundle);
        parcelZza.writeLong(j2);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConsentThirdParty(Bundle bundle, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, bundle);
        parcelZza.writeLong(j2);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j2) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, zzddVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j2);
        zzc(50, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = zzbn.f22329a;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setEventInterceptor(zzcy zzcyVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcyVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setMeasurementEnabled(boolean z, long j2) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = zzbn.f22329a;
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j2);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSessionTimeoutDuration(long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j2);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, intent);
        zzc(48, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserId(String str, long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j2);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.m9820c(parcelZza, iObjectWrapper);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j2);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void unregisterOnMeasurementEventListener(zzcy zzcyVar) {
        Parcel parcelZza = zza();
        zzbn.m9820c(parcelZza, zzcyVar);
        zzc(36, parcelZza);
    }
}
