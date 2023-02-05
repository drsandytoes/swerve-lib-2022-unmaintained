package com.swervedrivespecialties.swervelib;

public class CANDeviceID {
    public static final String kRioBusName = "rio";
    public static final String kCanivoreBusName = "canivoer";

    public String bus;
    public int id;

    public CANDeviceID(int deviceID, String busName) {
        this.id = deviceID;
        this.bus = busName;
    }

    public CANDeviceID(int deviceID) {
        this(deviceID, kRioBusName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CANDeviceID that = (CANDeviceID) o;
        return this.id == that.id  && this.bus.equals(that.bus);
    }

}
