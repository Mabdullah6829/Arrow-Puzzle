package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.TimeProvider;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6442a;
import kotlin.jvm.internal.InterfaceC6448g;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p006D0.InterfaceC0170e;
import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p057d0.InterfaceC6279a;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsCacheImpl implements SettingsCache {
    private final InterfaceC6353h backgroundDispatcher;
    private final AtomicReference<SessionConfigs> sessionConfigsAtomicReference;
    private final DataStore<SessionConfigs> sessionConfigsDataStore;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", m12159f = "SettingsCache.kt", m12160l = {73}, m12161m = "invokeSuspend")
    public static final class C60531 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 implements InterfaceC0171f, InterfaceC6448g {
            final /* synthetic */ AtomicReference<SessionConfigs> $tmp0;

            public AnonymousClass1(AtomicReference<SessionConfigs> atomicReference) {
                this.$tmp0 = atomicReference;
            }

            @Override // p006D0.InterfaceC0171f
            public final Object emit(SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c) {
                Object objInvokeSuspend$set = C60531.invokeSuspend$set(this.$tmp0, sessionConfigs, interfaceC6348c);
                return objInvokeSuspend$set == EnumC6363a.f24419s ? objInvokeSuspend$set : C6289k.f24318a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC0171f) && (obj instanceof InterfaceC6448g)) {
                    return AbstractC6452k.m12177a(getFunctionDelegate(), ((InterfaceC6448g) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC6448g
            public final InterfaceC6279a getFunctionDelegate() {
                return new C6442a(this.$tmp0, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public C60531(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$set(AtomicReference atomicReference, SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c) {
            atomicReference.set(sessionConfigs);
            return C6289k.f24318a;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return SettingsCacheImpl.this.new C60531(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60531) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0170e data = SettingsCacheImpl.this.sessionConfigsDataStore.getData();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SettingsCacheImpl.this.sessionConfigsAtomicReference);
                this.label = 1;
                if (data.collect(anonymousClass1, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m12159f = "SettingsCache.kt", m12160l = {98}, m12161m = "updateConfigs")
    public static final class C60541 extends AbstractC6373c {
        int label;
        /* synthetic */ Object result;

        public C60541(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCacheImpl.this.updateConfigs(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", m12159f = "SettingsCache.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C60552 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ SessionConfigs $sessionConfigs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60552(SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$sessionConfigs = sessionConfigs;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C60552(this.$sessionConfigs, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c) {
            return ((C60552) create(sessionConfigs, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return this.$sessionConfigs;
        }
    }

    public SettingsCacheImpl(@Background InterfaceC6353h backgroundDispatcher, TimeProvider timeProvider, DataStore<SessionConfigs> sessionConfigsDataStore) {
        AbstractC6452k.m12181e(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6452k.m12181e(timeProvider, "timeProvider");
        AbstractC6452k.m12181e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = sessionConfigsDataStore;
        this.sessionConfigsAtomicReference = new AtomicReference<>();
        AbstractC0069y.m111j(AbstractC0069y.m102a(backgroundDispatcher), null, new C60531(null), 3);
    }

    private final SessionConfigs getSessionConfigs() throws Throwable {
        if (this.sessionConfigsAtomicReference.get() == null) {
            AtomicReference<SessionConfigs> atomicReference = this.sessionConfigsAtomicReference;
            Object objM115n = AbstractC0069y.m115n(new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, (SessionConfigs) objM115n) && atomicReference.get() == null) {
            }
        }
        SessionConfigs sessionConfigs = this.sessionConfigsAtomicReference.get();
        AbstractC6452k.m12180d(sessionConfigs, "get(...)");
        return sessionConfigs;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = getSessionConfigs().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = getSessionConfigs().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.timeProvider.currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @VisibleForTesting
    public final Object removeConfigs$com_google_firebase_firebase_sessions(InterfaceC6348c interfaceC6348c) throws Throwable {
        SettingsCacheImpl$removeConfigs$1 settingsCacheImpl$removeConfigs$1;
        if (interfaceC6348c instanceof SettingsCacheImpl$removeConfigs$1) {
            settingsCacheImpl$removeConfigs$1 = (SettingsCacheImpl$removeConfigs$1) interfaceC6348c;
            int i2 = settingsCacheImpl$removeConfigs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$removeConfigs$1.label = i2 - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, interfaceC6348c);
            }
        } else {
            settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, interfaceC6348c);
        }
        Object obj = settingsCacheImpl$removeConfigs$1.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = settingsCacheImpl$removeConfigs$1.label;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return obj;
            }
            AbstractC0243G.m377o(obj);
            DataStore<SessionConfigs> dataStore = this.sessionConfigsDataStore;
            SettingsCacheImpl$removeConfigs$2 settingsCacheImpl$removeConfigs$2 = new SettingsCacheImpl$removeConfigs$2(null);
            settingsCacheImpl$removeConfigs$1.label = 1;
            Object objUpdateData = dataStore.updateData(settingsCacheImpl$removeConfigs$2, settingsCacheImpl$removeConfigs$1);
            return objUpdateData == enumC6363a ? enumC6363a : objUpdateData;
        } catch (IOException e) {
            return new Integer(Log.w(FirebaseSessions.TAG, "Failed to remove config values: " + e));
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Integer sessionRestartTimeout() {
        return getSessionConfigs().getSessionTimeoutSeconds();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Double sessionSamplingRate() {
        return getSessionConfigs().getSessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Boolean sessionsEnabled() {
        return getSessionConfigs().getSessionsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Object updateConfigs(SessionConfigs sessionConfigs, InterfaceC6348c interfaceC6348c) throws Throwable {
        C60541 c60541;
        if (interfaceC6348c instanceof C60541) {
            c60541 = (C60541) interfaceC6348c;
            int i2 = c60541.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c60541.label = i2 - Integer.MIN_VALUE;
            } else {
                c60541 = new C60541(interfaceC6348c);
            }
        } else {
            c60541 = new C60541(interfaceC6348c);
        }
        Object obj = c60541.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c60541.label;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                DataStore<SessionConfigs> dataStore = this.sessionConfigsDataStore;
                C60552 c60552 = new C60552(sessionConfigs, null);
                c60541.label = 1;
                if (dataStore.updateData(c60552, c60541) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
        } catch (IOException e) {
            Log.w(FirebaseSessions.TAG, "Failed to update config values: " + e);
        }
        return C6289k.f24318a;
    }
}
