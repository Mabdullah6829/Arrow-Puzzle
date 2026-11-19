package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6378h;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;
import p089x0.AbstractC6565h;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", m12159f = "ScatterMap.kt", m12160l = {TypedValues.TransitionType.TYPE_FROM}, m12161m = "invokeSuspend")
public final class ScatterMap$MapWrapper$entries$1$iterator$1 extends AbstractC6378h implements InterfaceC6502p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = scatterMap;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.this$0, interfaceC6348c);
        scatterMap$MapWrapper$entries$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p066i0.AbstractC6371a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            androidx.collection.ScatterMap r12 = (androidx.collection.ScatterMap) r12
            java.lang.Object r13 = r0.L$0
            x0.h r13 = (p089x0.AbstractC6565h) r13
            p011H.AbstractC0243G.m377o(r21)
            goto L97
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            p011H.AbstractC0243G.m377o(r21)
            java.lang.Object r2 = r0.L$0
            x0.h r2 = (p089x0.AbstractC6565h) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.this$0
            long[] r7 = r6.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La5
            r9 = r3
        L42:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r12
            r12 = r6
            r6 = r13
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r7
            r10 = r8
            r7 = r18
        L64:
            if (r2 >= r6) goto L9a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L97
            int r3 = r9 << 3
            int r3 = r3 + r2
            androidx.collection.MapEntry r4 = new androidx.collection.MapEntry
            java.lang.Object[] r14 = r12.keys
            r14 = r14[r3]
            java.lang.Object[] r15 = r12.values
            r3 = r15[r3]
            r4.<init>(r14, r3)
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            r13.mo12215a(r4, r0)
            h0.a r2 = p064h0.EnumC6363a.f24419s
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L64
        L9a:
            if (r6 != r4) goto La5
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r13
        La0:
            if (r9 == r8) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            d0.k r1 = p057d0.C6289k.f24318a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(AbstractC6565h abstractC6565h, InterfaceC6348c interfaceC6348c) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create(abstractC6565h, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }
}
