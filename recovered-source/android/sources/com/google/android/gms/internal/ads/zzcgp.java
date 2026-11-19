package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgp implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ MediaPlayer f9968s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzcgy f9969t;

    public zzcgp(zzcgy zzcgyVar, MediaPlayer mediaPlayer) {
        this.f9968s = mediaPlayer;
        this.f9969t = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer;
        MediaFormat format;
        zzcgy zzcgyVar = this.f9969t;
        zzchu zzchuVar = zzcgyVar.f9995u;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue() && zzchuVar != null && (mediaPlayer = this.f9968s) != null) {
            try {
                MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                if (trackInfo != null) {
                    HashMap map = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType == 1) {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        zzcgyVar.f9994K = numValueOf;
                                        map.put("bitRate", String.valueOf(numValueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        int integer = format2.getInteger("width");
                                        int integer2 = format2.getInteger("height");
                                        StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(integer, 1) + String.valueOf(integer2).length());
                                        sb.append(integer);
                                        sb.append("x");
                                        sb.append(integer2);
                                        map.put("resolution", sb.toString());
                                    }
                                    if (format2.containsKey("mime")) {
                                        map.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        map.put("videoCodec", format2.getString("codecs-string"));
                                    }
                                }
                            } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                if (format.containsKey("mime")) {
                                    map.put("audioMime", format.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                    map.put("audioCodec", format.getString("codecs-string"));
                                }
                            }
                        }
                    }
                    if (!map.isEmpty()) {
                        zzchuVar.mo5129b("onMetadataEvent", map);
                    }
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdMediaPlayerView.reportMetadata", e);
            }
        }
        zzchi zzchiVar = zzcgyVar.f9992I;
        if (zzchiVar != null) {
            zzchiVar.m5437f();
        }
    }
}
