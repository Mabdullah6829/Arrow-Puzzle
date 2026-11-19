package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9H */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24489H {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C5064qI A07;
    public final boolean A08;
    public final InterfaceC21133k[] A09;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, 39, 32, 52, 45, 53, 0, 52, 37, 40, 46, 18, 40, 47, 42, 40, 63, 35, 38, 46, 11, 63, 46, 35, 37, 30, 56, 43, 41, 33, 112, 106, 57, 62, 43, 62, 47, 119, 111, 46, 102, 106, 43, 63, 46, 35, 37, 30, 56, 43, 41, 33, 11, 38, 38, 37, 41, 43, 62, 47, 46, 100, 45, 47, 62, 98, 99, 119, 111, 46};
    }

    static {
        A07();
    }

    public C24489H(C5064qI c5064qI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, InterfaceC21133k[] interfaceC21133kArr, boolean z) {
        this.A07 = c5064qI;
        this.A01 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A06 = i5;
        this.A02 = i6;
        this.A03 = i7;
        this.A00 = i8;
        this.A09 = interfaceC21133kArr;
        this.A08 = z;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C5070qQ c5070qQ, boolean z) {
        if (z) {
            return A00();
        }
        return c5070qQ.A01().A00;
    }

    private AudioTrack A02(C5070qQ c5070qQ, int i2) {
        int iA04 = AbstractC22035C.A04(c5070qQ.A05);
        if (i2 != 0) {
            return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1, i2);
        }
        return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z, C5070qQ c5070qQ, int i2) {
        if (AbstractC22035C.A02 >= 29) {
            return A05(z, c5070qQ, i2);
        }
        if (AbstractC22035C.A02 >= 21) {
            return A04(z, c5070qQ, i2);
        }
        AudioTrack audioTrackA02 = A02(c5070qQ, i2);
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return audioTrackA02;
    }

    private AudioTrack A04(boolean z, C5070qQ c5070qQ, int i2) {
        return new AudioTrack(A01(c5070qQ, z), C4945oM.A0D(this.A06, this.A02, this.A03), this.A00, 1, i2);
    }

    private AudioTrack A05(boolean z, C5070qQ c5070qQ, int i2) {
        AudioFormat audioFormatA0D = C4945oM.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c5070qQ, z);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(audioFormatA0D);
        boolean z2 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i2);
        if (this.A04 != 1) {
            z2 = false;
        }
        AudioTrack audioTrackBuild = sessionId.setOffloadedPlayback(z2).build();
        String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return audioTrackBuild;
    }

    public final long A08(long j2) {
        return (1000000 * j2) / ((long) this.A06);
    }

    public final long A09(long j2) {
        return (1000000 * j2) / ((long) this.A07.A0G);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z, C5070qQ c5070qQ, int i2) throws C24308t {
        try {
            AudioTrack audioTrackA03 = A03(z, c5070qQ, i2);
            C4945oM.A0M().incrementAndGet();
            int state = audioTrackA03.getState();
            if (state == 1) {
                return audioTrackA03;
            }
            try {
                audioTrackA03.release();
                C4945oM.A0M().decrementAndGet();
            } catch (Exception e) {
                AbstractC21714g.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C4945oM.A0M().get())), e);
            }
            throw new C24308t(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C4945oM.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new C24308t(0, this.A06, this.A02, this.A00, this.A07, A0D(), e2, C4945oM.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8r] */
    public final C24288r A0B() {
        final int i2 = this.A03;
        final int i3 = this.A06;
        final int i4 = this.A02;
        final boolean z = this.A08;
        final boolean z2 = this.A04 == 1;
        final int i5 = this.A00;
        return new Object(i2, i3, i4, z, z2, i5) { // from class: com.facebook.ads.redexgen.X.8r
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i2;
                this.A03 = i3;
                this.A01 = i4;
                this.A05 = z;
                this.A04 = z2;
                this.A00 = i5;
            }
        };
    }

    public final C24489H A0C(int i2) {
        return new C24489H(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i2, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C24489H c24489h) {
        return c24489h.A04 == this.A04 && c24489h.A03 == this.A03 && c24489h.A06 == this.A06 && c24489h.A02 == this.A02 && c24489h.A05 == this.A05;
    }
}
