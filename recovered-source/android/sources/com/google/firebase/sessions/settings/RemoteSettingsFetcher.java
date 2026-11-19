package com.google.firebase.sessions.settings;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    public static final Companion Companion = new Companion(null);
    private static final String FIREBASE_PLATFORM = "android";
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    private final ApplicationInfo appInfo;
    private final InterfaceC6353h blockingDispatcher;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m12159f = "RemoteSettingsFetcher.kt", m12160l = {73, 75, 78}, m12161m = "invokeSuspend")
    public static final class C60512 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ Map<String, String> $headerOptions;
        final /* synthetic */ InterfaceC6502p $onFailure;
        final /* synthetic */ InterfaceC6502p $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60512(Map<String, String> map, InterfaceC6502p interfaceC6502p, InterfaceC6502p interfaceC6502p2, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$headerOptions = map;
            this.$onSuccess = interfaceC6502p;
            this.$onFailure = interfaceC6502p2;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return RemoteSettingsFetcher.this.new C60512(this.$headerOptions, this.$onSuccess, this.$onFailure, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60512) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
        
            if (r1.invoke(r3, r7) == r0) goto L36;
         */
        @Override // p066i0.AbstractC6371a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettingsFetcher.C60512.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public RemoteSettingsFetcher(ApplicationInfo appInfo, @Blocking InterfaceC6353h blockingDispatcher) {
        AbstractC6452k.m12181e(appInfo, "appInfo");
        AbstractC6452k.m12181e(blockingDispatcher, "blockingDispatcher");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority(FIREBASE_SESSIONS_BASE_URL_STRING).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(FIREBASE_PLATFORM).appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public Object doConfigFetch(Map<String, String> map, InterfaceC6502p interfaceC6502p, InterfaceC6502p interfaceC6502p2, InterfaceC6348c interfaceC6348c) throws Throwable {
        Object objM119r = AbstractC0069y.m119r(new C60512(map, interfaceC6502p, interfaceC6502p2, null), this.blockingDispatcher, interfaceC6348c);
        return objM119r == EnumC6363a.f24419s ? objM119r : C6289k.f24318a;
    }
}
