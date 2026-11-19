package androidx.collection;

import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6378h;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;
import p089x0.AbstractC6565h;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", m12159f = "ScatterMap.kt", m12160l = {1431}, m12161m = "invokeSuspend")
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends AbstractC6378h implements InterfaceC6502p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = mutableScatterMap;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.this$0, interfaceC6348c);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:22:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:19:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p066i0.AbstractC6371a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 != r5) goto L24
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            x0.h r12 = (p089x0.AbstractC6565h) r12
            p011H.AbstractC0243G.m377o(r20)
            goto L88
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            p011H.AbstractC0243G.m377o(r20)
            java.lang.Object r2 = r0.L$0
            x0.h r2 = (p089x0.AbstractC6565h) r2
            androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L96
            r8 = r3
        L3d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L91
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r2
            r2 = r3
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L5f:
            if (r2 >= r6) goto L8b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r3 = r9 << 3
            int r3 = r3 + r2
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            r12.mo12215a(r4, r0)
            h0.a r2 = p064h0.EnumC6363a.f24419s
            return r1
        L88:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L5f
        L8b:
            if (r6 != r4) goto L96
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L91:
            if (r8 == r7) goto L96
            int r8 = r8 + 1
            goto L3d
        L96:
            d0.k r1 = p057d0.C6289k.f24318a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(AbstractC6565h abstractC6565h, InterfaceC6348c interfaceC6348c) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(abstractC6565h, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }
}
