package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8M */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC23998M implements InterfaceC4803lq {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C19791V A02;
    public final ArrayDeque<C19791V> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC24028P> A04;
    public final PriorityQueue<C19791V> A05;

    public abstract C4794lh A0Z();

    public abstract void A0b(C24058S c24058s);

    public abstract boolean A0d();

    public AbstractC23998M() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.A03.add(new C19791V());
        }
        this.A04 = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            ArrayDeque<AbstractC24028P> arrayDeque = this.A04;
            final InterfaceC225764 interfaceC225764 = new InterfaceC225764() { // from class: com.facebook.ads.redexgen.X.li
                @Override // com.instagram.common.viewpoint.core.InterfaceC225764
                public final void AHj(AbstractC4984oz abstractC4984oz) {
                    this.A00.A0c((C19781U) abstractC4984oz);
                }
            };
            arrayDeque.add(new AbstractC24028P(interfaceC225764) { // from class: com.facebook.ads.redexgen.X.1U
                public InterfaceC225764<C19781U> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = interfaceC225764;
                }

                @Override // com.instagram.common.viewpoint.core.AbstractC24028P, com.instagram.common.viewpoint.core.AbstractC4984oz
                public final void A0B() {
                    this.A00.AHj(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C19791V c19791v) {
        c19791v.A0A();
        this.A03.add(c19791v);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    /* JADX INFO: renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C24058S A5r() throws C4796lj {
        AbstractC21273y.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    /* JADX INFO: renamed from: A0X */
    public AbstractC24028P A5t() throws C4796lj {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (true) {
            boolean zIsEmpty = this.A05.isEmpty();
            if (A06[5].charAt(7) != 's') {
                throw new RuntimeException();
            }
            A06[6] = "DOprmnWJZ9SCRw8WSrP7EOY5DTOSvJmV";
            if (!zIsEmpty) {
                C19791V c19791vPeek = this.A05.peek();
                if (A06[7].length() != 10) {
                    throw new RuntimeException();
                }
                A06[2] = "urX0HrInINzEpwrp6LaPdmgGjQDQJQna";
                if (((C19791V) AbstractC22035C.A0f(c19791vPeek)).A01 <= this.A00) {
                    C19791V c19791v = (C19791V) AbstractC22035C.A0f(this.A05.poll());
                    if (c19791v.A05()) {
                        AbstractC24028P abstractC24028P = (AbstractC24028P) AbstractC22035C.A0f(this.A04.pollFirst());
                        abstractC24028P.A00(4);
                        A0U(c19791v);
                        String[] strArr = A06;
                        if (strArr[4].charAt(25) != strArr[3].charAt(25)) {
                            return abstractC24028P;
                        }
                        String[] strArr2 = A06;
                        strArr2[4] = "oxl05cpa7UEpdlHPP7s3uyaLsYMYJfaH";
                        strArr2[3] = "7KvbtL7fQFgbKwZtHueu0Zl9fYEN12Vy";
                        return abstractC24028P;
                    }
                    A0b(c19791v);
                    if (A0d()) {
                        C4794lh c4794lhA0Z = A0Z();
                        AbstractC24028P abstractC24028P2 = (AbstractC24028P) AbstractC22035C.A0f(this.A04.pollFirst());
                        long j2 = c19791v.A01;
                        String[] strArr3 = A06;
                        if (strArr3[4].charAt(25) != strArr3[3].charAt(25)) {
                            throw new RuntimeException();
                        }
                        A06[5] = "oIgvRTusAdocLQHm4RFtRlwv19XF7U3W";
                        abstractC24028P2.A0C(j2, c4794lhA0Z, LocationRequestCompat.PASSIVE_INTERVAL);
                        A0U(c19791v);
                        return abstractC24028P2;
                    }
                    A0U(c19791v);
                }
            }
            return null;
        }
    }

    public final AbstractC24028P A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    /* JADX INFO: renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AHJ(C24058S c24058s) throws C4796lj {
        AbstractC21273y.A07(c24058s == this.A02);
        C19791V c19791v = (C19791V) c24058s;
        if (c19791v.A04()) {
            A0U(c19791v);
        } else {
            long j2 = this.A01;
            this.A01 = 1 + j2;
            c19791v.A00 = j2;
            this.A05.add(c19791v);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(AbstractC24028P abstractC24028P) {
        abstractC24028P.A0A();
        this.A04.add(abstractC24028P);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    public void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4803lq
    public void AJh(long j2) {
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C19791V) AbstractC22035C.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
