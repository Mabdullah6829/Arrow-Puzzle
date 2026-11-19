package com.google.firebase.sessions;

import kotlin.jvm.internal.AbstractC6447f;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallationId {
    public static final Companion Companion = new Companion(null);
    private final String authToken;
    private final String fid;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object create(com.google.firebase.installations.FirebaseInstallationsApi r9, p062g0.InterfaceC6348c r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r10
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.result
                h0.a r1 = p064h0.EnumC6363a.f24419s
                int r2 = r0.label
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L46
                if (r2 == r5) goto L3c
                if (r2 != r4) goto L34
                java.lang.Object r9 = r0.L$0
                java.lang.String r9 = (java.lang.String) r9
                p011H.AbstractC0243G.m377o(r10)     // Catch: java.lang.Exception -> L32
                goto L86
            L32:
                r10 = move-exception
                goto L8d
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3c:
                java.lang.Object r9 = r0.L$0
                com.google.firebase.installations.FirebaseInstallationsApi r9 = (com.google.firebase.installations.FirebaseInstallationsApi) r9
                p011H.AbstractC0243G.m377o(r10)     // Catch: java.lang.Exception -> L44
                goto L5e
            L44:
                r10 = move-exception
                goto L6b
            L46:
                p011H.AbstractC0243G.m377o(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.getToken(r10)     // Catch: java.lang.Exception -> L44
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.AbstractC6452k.m12180d(r10, r2)     // Catch: java.lang.Exception -> L44
                r0.L$0 = r9     // Catch: java.lang.Exception -> L44
                r0.label = r5     // Catch: java.lang.Exception -> L44
                java.lang.Object r10 = p022N.AbstractC0355G.m551c(r10, r0)     // Catch: java.lang.Exception -> L44
                if (r10 != r1) goto L5e
                goto L85
            L5e:
                com.google.firebase.installations.InstallationTokenResult r10 = (com.google.firebase.installations.InstallationTokenResult) r10     // Catch: java.lang.Exception -> L44
                java.lang.String r10 = r10.getToken()     // Catch: java.lang.Exception -> L44
                kotlin.jvm.internal.AbstractC6452k.m12178b(r10)     // Catch: java.lang.Exception -> L44
                r7 = r10
                r10 = r9
                r9 = r7
                goto L72
            L6b:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L72:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L32
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.AbstractC6452k.m12180d(r10, r2)     // Catch: java.lang.Exception -> L32
                r0.L$0 = r9     // Catch: java.lang.Exception -> L32
                r0.label = r4     // Catch: java.lang.Exception -> L32
                java.lang.Object r10 = p022N.AbstractC0355G.m551c(r10, r0)     // Catch: java.lang.Exception -> L32
                if (r10 != r1) goto L86
            L85:
                return r1
            L86:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
                if (r10 != 0) goto L8b
                goto L92
            L8b:
                r6 = r10
                goto L92
            L8d:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L92:
                com.google.firebase.sessions.InstallationId r10 = new com.google.firebase.sessions.InstallationId
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.create(com.google.firebase.installations.FirebaseInstallationsApi, g0.c):java.lang.Object");
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, AbstractC6447f abstractC6447f) {
        this(str, str2);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
