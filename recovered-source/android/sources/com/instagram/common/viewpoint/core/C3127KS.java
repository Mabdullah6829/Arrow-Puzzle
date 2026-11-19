package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3127KS implements InterfaceC4135au {
    public static String[] A01 = {"Kf9IFIGkXS68FEluY8iO", "HZKyOot4e1aVyegaf8lIb0bgnGZodGvN", "MGWXSz8iondoAx3vwHSWPDz", "1vF28DvouTYuJpgxZbcCtj3BonOpfXf0", "hNMoe3gYfV5QWpuVljUPjUuKx8toPdic", "kDVCOfKU1nzjkl2JPkHRjE9k6FSheaPB", "SHeKxuODcoO7wzXqEy6VB5XREjq4nAxo", "ViwjD0ocXU7cRIhjEHnYvFil28fnYSUL"};
    public final /* synthetic */ C3113KE A00;

    public C3127KS(C3113KE c3113ke) {
        this.A00 = c3113ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4135au
    public final void ADO() {
        this.A00.A0i(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4135au
    public final void AF0() {
        if (C3763Up.A15(this.A00.getAdContextWrapper())) {
            C3113KE c3113ke = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "KrFGzHoXsfsafO9ToSguPoB5cWeuxqIV";
            strArr2[4] = "kqOpGw0ynU1zwk9LjTPYr4TgjSNfVfpA";
            c3113ke.A0K();
        }
    }
}
