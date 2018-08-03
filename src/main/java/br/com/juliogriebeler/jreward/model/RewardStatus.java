package br.com.juliogriebeler.jreward.model;

public enum RewardStatus {
	ACTIVE(1),
	INACTIVE(2),
	CANCELLED(3);

    private int idStatus;

    RewardStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int idStatus() {
        return idStatus;
    }
	
}
