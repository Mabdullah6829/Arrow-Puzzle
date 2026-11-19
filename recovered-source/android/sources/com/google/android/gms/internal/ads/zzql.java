package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzql extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzqp f20640a;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f20640a.m8839c();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzqp zzqpVar;
        String str = zzfm.f16091a;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            zzqpVar = this.f20640a;
            if (i2 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i2], zzqpVar.f20653i)) {
                zzqpVar.f20653i = null;
                break;
            }
            i2++;
        }
        zzqpVar.m8839c();
    }
}
