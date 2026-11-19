package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
final class zzue {

    /* JADX INFO: renamed from: a */
    public static final zzgwt f20996a = zzgwt.m7216n(12);

    /* JADX INFO: renamed from: a */
    public static zzgwt m8903a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new Function() { // from class: com.google.android.gms.internal.ads.zzud
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
            }
        }).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileM3874f = AbstractC5160n.m3874f(it.next());
            if (audioProfileM3874f.getEncapsulationType() != 1 && zzfm.m6502d(audioProfileM3874f.getFormat())) {
                for (int i2 : audioProfileM3874f.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i2));
                }
            }
        }
        return zzgwt.m7220t(treeSet);
    }
}
