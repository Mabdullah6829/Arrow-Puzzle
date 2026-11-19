package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4889nR implements InterfaceC2777Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final InterfaceC213445 A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final InterfaceC2797F6 A09;
    public final int A0A;

    public C4889nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C4889nR(int i2, int i3, int i4, float f2) {
        this(null, -1, i2, i3, i4, 1279, 719, f2, 0.75f, 2000L, InterfaceC213445.A00);
    }

    public C4889nR(InterfaceC2797F6 interfaceC2797F6) {
        this(interfaceC2797F6, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, InterfaceC213445.A00);
    }

    public C4889nR(@MetaExoPlayerCustomization("No longer set through factory") InterfaceC2797F6 interfaceC2797F6, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i2, @MetaExoPlayerCustomization("Removed from upstream") int i3, int i4, int i5, int i6, int i7, float f2, float f3, long j2, InterfaceC213445 interfaceC213445) {
        this.A09 = interfaceC2797F6;
        this.A0A = i2;
        this.A05 = i3;
        this.A02 = i4;
        this.A06 = i5;
        this.A04 = i6;
        this.A03 = i7;
        this.A00 = f2;
        this.A01 = f3;
        this.A07 = j2;
        this.A08 = interfaceC213445;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C19841a A00(C5027pg c5027pg, int[] iArr, int i2, InterfaceC2797F6 interfaceC2797F6, AbstractC2570BP<C2759EU> abstractC2570BP) {
        return new C19841a(c5027pg, iArr, i2, interfaceC2797F6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, abstractC2570BP, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2777Em
    public final InterfaceC4876nE[] A5b(C2776El[] c2776ElArr, InterfaceC2797F6 interfaceC2797F6, C4912no c4912no, Timeline timeline) {
        InterfaceC4876nE interfaceC4876nEA00;
        AbstractC2570BP abstractC2570BPA00 = C19841a.A00(c2776ElArr);
        InterfaceC4876nE[] interfaceC4876nEArr = new InterfaceC4876nE[c2776ElArr.length];
        for (int i2 = 0; i2 < c2776ElArr.length; i2++) {
            C2776El c2776El = c2776ElArr[i2];
            if (c2776El != null && c2776El.A02.length != 0) {
                int length = c2776El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    interfaceC4876nEA00 = new C19831Z(c2776El.A01, c2776El.A02[0], c2776El.A00);
                } else {
                    interfaceC4876nEA00 = A00(c2776El.A01, c2776El.A02, c2776El.A00, interfaceC2797F6, (AbstractC2570BP) abstractC2570BPA00.get(i2));
                }
                interfaceC4876nEArr[i2] = interfaceC4876nEA00;
            }
        }
        return interfaceC4876nEArr;
    }
}
