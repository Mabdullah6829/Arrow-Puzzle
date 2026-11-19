package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6378h;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;
import p080q0.InterfaceC6520a;
import p089x0.AbstractC6565h;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC6520a {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 */
    @InterfaceC6375e(m12158c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", m12159f = "ScatterMap.kt", m12160l = {1328}, m12161m = "invokeSuspend")
    public static final class C10921 extends AbstractC6378h implements InterfaceC6502p {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutableScatterMap<K, V> this$0;
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10921(MutableScatterMap mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C10921 c10921 = new C10921(this.this$0, this.this$1, interfaceC6348c);
            c10921.L$0 = obj;
            return c10921;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0058  */
        /* JADX WARN: Code duplicated, block: B:20:0x00a8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0056 -> B:22:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:14:0x006c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0075 -> B:19:0x00a5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p066i0.AbstractC6371a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                h0.a r1 = p064h0.EnumC6363a.f24419s
                int r2 = r0.label
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L35
                if (r2 != r5) goto L2d
                int r2 = r0.I$3
                int r6 = r0.I$2
                long r7 = r0.J$0
                int r9 = r0.I$1
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$3
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.L$2
                androidx.collection.MutableScatterMap r12 = (androidx.collection.MutableScatterMap) r12
                java.lang.Object r13 = r0.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r13 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r13
                java.lang.Object r14 = r0.L$0
                x0.h r14 = (p089x0.AbstractC6565h) r14
                p011H.AbstractC0243G.m377o(r22)
                goto La5
            L2d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L35:
                p011H.AbstractC0243G.m377o(r22)
                java.lang.Object r2 = r0.L$0
                x0.h r2 = (p089x0.AbstractC6565h) r2
                androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r7 = r0.this$1
                long[] r8 = r6.metadata
                int r9 = r8.length
                int r9 = r9 + (-2)
                if (r9 < 0) goto Lb6
                r10 = r3
            L48:
                r11 = r8[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto Lb1
                int r13 = r10 - r9
                int r13 = ~r13
                int r13 = r13 >>> 31
                int r13 = 8 - r13
                r14 = r10
                r10 = r9
                r9 = r14
                r14 = r2
                r2 = r3
                r19 = r11
                r12 = r6
                r11 = r8
                r6 = r13
                r13 = r7
                r7 = r19
            L6c:
                if (r2 >= r6) goto La8
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto La5
                int r3 = r9 << 3
                int r3 = r3 + r2
                r13.setCurrent(r3)
                androidx.collection.MutableMapEntry r3 = new androidx.collection.MutableMapEntry
                java.lang.Object[] r4 = r12.keys
                java.lang.Object[] r15 = r12.values
                int r5 = r13.getCurrent()
                r3.<init>(r4, r15, r5)
                r0.L$0 = r14
                r0.L$1 = r13
                r0.L$2 = r12
                r0.L$3 = r11
                r0.I$0 = r10
                r0.I$1 = r9
                r0.J$0 = r7
                r0.I$2 = r6
                r0.I$3 = r2
                r5 = 1
                r0.label = r5
                r14.mo12215a(r3, r0)
                h0.a r2 = p064h0.EnumC6363a.f24419s
                return r1
            La5:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6c
            La8:
                if (r6 != r4) goto Lb6
                r2 = r10
                r10 = r9
                r9 = r2
                r8 = r11
                r6 = r12
                r7 = r13
                r2 = r14
            Lb1:
                if (r10 == r9) goto Lb6
                int r10 = r10 + 1
                goto L48
            Lb6:
                d0.k r1 = p057d0.C6289k.f24318a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.C10921.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(AbstractC6565h abstractC6565h, InterfaceC6348c interfaceC6348c) {
            return ((C10921) create(abstractC6565h, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }
    }

    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = AbstractC0878a.m1803n(new C10921(mutableScatterMap, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i2 = this.current;
        if (i2 != -1) {
            this.this$0.removeValueAt(i2);
            this.current = -1;
        }
    }

    public final void setCurrent(int i2) {
        this.current = i2;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        AbstractC6452k.m12181e(it, "<set-?>");
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }
}
