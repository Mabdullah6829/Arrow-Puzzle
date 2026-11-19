package androidx.work.impl.constraints;

/* JADX INFO: loaded from: classes.dex */
public class NetworkState {
    private boolean mIsConnected;
    private boolean mIsMetered;
    private boolean mIsNotRoaming;
    private boolean mIsValidated;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.mIsConnected = z;
        this.mIsValidated = z2;
        this.mIsMetered = z3;
        this.mIsNotRoaming = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.mIsConnected == networkState.mIsConnected && this.mIsValidated == networkState.mIsValidated && this.mIsMetered == networkState.mIsMetered && this.mIsNotRoaming == networkState.mIsNotRoaming;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.mIsConnected;
        int i2 = r0;
        if (this.mIsValidated) {
            i2 = r0 + 16;
        }
        int i3 = i2;
        if (this.mIsMetered) {
            i3 = i2 + 256;
        }
        return this.mIsNotRoaming ? i3 + 4096 : i3;
    }

    public boolean isConnected() {
        return this.mIsConnected;
    }

    public boolean isMetered() {
        return this.mIsMetered;
    }

    public boolean isNotRoaming() {
        return this.mIsNotRoaming;
    }

    public boolean isValidated() {
        return this.mIsValidated;
    }

    public String toString() {
        return "[ Connected=" + this.mIsConnected + " Validated=" + this.mIsValidated + " Metered=" + this.mIsMetered + " NotRoaming=" + this.mIsNotRoaming + " ]";
    }
}
