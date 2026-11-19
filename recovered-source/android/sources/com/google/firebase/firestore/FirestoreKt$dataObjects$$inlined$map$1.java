package com.google.firebase.firestore;

import kotlin.jvm.internal.AbstractC6452k;
import p006D0.InterfaceC0170e;
import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes2.dex */
public final class FirestoreKt$dataObjects$$inlined$map$1 implements InterfaceC0170e {
    final /* synthetic */ InterfaceC0170e $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1$2 */
    public static final class C57232<T> implements InterfaceC0171f {
        final /* synthetic */ InterfaceC0171f $this_unsafeFlow;

        /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1$2$1, reason: invalid class name */
        @InterfaceC6375e(m12158c = "com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1$2", m12159f = "Firestore.kt", m12160l = {50}, m12161m = "emit")
        public static final class AnonymousClass1 extends AbstractC6373c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC6348c interfaceC6348c) {
                super(interfaceC6348c);
            }

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C57232.this.emit(null, this);
            }
        }

        public C57232(InterfaceC0171f interfaceC0171f) {
            this.$this_unsafeFlow = interfaceC0171f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p006D0.InterfaceC0171f
        public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (interfaceC6348c instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC6348c;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC6348c);
            }
            Object obj2 = anonymousClass1.result;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i3 = anonymousClass1.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj2);
                return C6289k.f24318a;
            }
            AbstractC0243G.m377o(obj2);
            AbstractC6452k.m12184h();
            throw null;
        }

        public final Object emit$$forInline(Object obj, InterfaceC6348c interfaceC6348c) {
            new AnonymousClass1(interfaceC6348c);
            AbstractC6452k.m12184h();
            throw null;
        }
    }

    public FirestoreKt$dataObjects$$inlined$map$1(InterfaceC0170e interfaceC0170e) {
        this.$this_unsafeTransform$inlined = interfaceC0170e;
    }

    @Override // p006D0.InterfaceC0170e
    public Object collect(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        AbstractC6452k.m12184h();
        throw null;
    }

    public Object collect$$forInline(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        new AbstractC6373c(interfaceC6348c) { // from class: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$1.1
            int label;
            /* synthetic */ Object result;

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FirestoreKt$dataObjects$$inlined$map$1.this.collect(null, this);
            }
        };
        AbstractC6452k.m12184h();
        throw null;
    }
}
