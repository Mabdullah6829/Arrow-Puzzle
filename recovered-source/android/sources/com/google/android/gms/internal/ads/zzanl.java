package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanl implements zzanq {
    @Override // com.google.android.gms.internal.ads.zzanq
    /* JADX INFO: renamed from: a */
    public final boolean mo4240a(zzv zzvVar) {
        String str = zzvVar.f21061o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzanq
    /* JADX INFO: renamed from: b */
    public final int mo4241b(zzv zzvVar) {
        String str = zzvVar.f21061o;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/vobsub":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzanq
    /* JADX INFO: renamed from: c */
    public final zzans mo4242c(zzv zzvVar) {
        String str = zzvVar.f21061o;
        List list = zzvVar.f21064r;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzaoi(list);
                case "text/vtt":
                    return new zzapk();
                case "application/x-mp4-vtt":
                    return new zzapa();
                case "application/x-subrip":
                    return new zzaom();
                case "application/x-quicktime-tx3g":
                    return new zzaox(list);
                case "application/pgs":
                    return new zzaog();
                case "application/vobsub":
                    return new zzaoz(list);
                case "application/dvbsubs":
                    return new zzaoe(list);
                case "application/ttml+xml":
                    return new zzaos();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
