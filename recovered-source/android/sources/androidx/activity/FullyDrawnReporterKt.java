package androidx.activity;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 */
    @InterfaceC6375e(m12158c = "androidx.activity.FullyDrawnReporterKt", m12159f = "FullyDrawnReporter.kt", m12160l = {ModuleDescriptor.MODULE_VERSION}, m12161m = "reportWhenComplete")
    public static final class C09311 extends AbstractC6373c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09311(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object reportWhenComplete(FullyDrawnReporter fullyDrawnReporter, InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) throws Throwable {
        C09311 c09311;
        if (interfaceC6348c instanceof C09311) {
            c09311 = (C09311) interfaceC6348c;
            int i2 = c09311.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09311.label = i2 - Integer.MIN_VALUE;
            } else {
                c09311 = new C09311(interfaceC6348c);
            }
        } else {
            c09311 = new C09311(interfaceC6348c);
        }
        Object obj = c09311.result;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = c09311.label;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                fullyDrawnReporter.addReporter();
                if (fullyDrawnReporter.isFullyDrawnReported()) {
                    return c6289k;
                }
                c09311.L$0 = fullyDrawnReporter;
                c09311.label = 1;
                if (interfaceC6498l.invoke(c09311) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullyDrawnReporter = (FullyDrawnReporter) c09311.L$0;
                AbstractC0243G.m377o(obj);
            }
            fullyDrawnReporter.removeReporter();
            return c6289k;
        } catch (Throwable th) {
            fullyDrawnReporter.removeReporter();
            throw th;
        }
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
        fullyDrawnReporter.addReporter();
        boolean zIsFullyDrawnReported = fullyDrawnReporter.isFullyDrawnReported();
        C6289k c6289k = C6289k.f24318a;
        if (zIsFullyDrawnReported) {
            return c6289k;
        }
        try {
            interfaceC6498l.invoke(interfaceC6348c);
            return c6289k;
        } finally {
            fullyDrawnReporter.removeReporter();
        }
    }
}
