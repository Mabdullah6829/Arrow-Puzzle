package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfex f15568a;

    public zzffd(zzfex zzfexVar) {
        this.f15568a = zzfexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        Bundle bundle = this.f15568a.f15561a.f9682s.getBundle("extras");
        int i2 = -1;
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
                case "requester_type_0":
                    i2 = 0;
                    break;
                case "requester_type_1":
                    i2 = 1;
                    break;
                case "requester_type_2":
                    i2 = 2;
                    break;
                case "requester_type_3":
                    i2 = 3;
                    break;
                case "requester_type_4":
                    i2 = 4;
                    break;
                case "requester_type_5":
                    i2 = 5;
                    break;
                case "requester_type_6":
                    i2 = 6;
                    break;
                case "requester_type_7":
                    i2 = 7;
                    break;
                case "requester_type_8":
                    i2 = 8;
                    break;
            }
        }
        return Integer.valueOf(i2);
    }
}
