package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1492d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2783s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f2784t;

    public /* synthetic */ RunnableC1492d(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i2) {
        this.f2783s = i2;
        this.f2784t = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2783s) {
            case 0:
                this.f2784t.createMetadata();
                break;
            default:
                this.f2784t.loadInternal();
                break;
        }
    }
}
