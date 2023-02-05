package com.swervedrivespecialties.swervelib.ctre;

import com.swervedrivespecialties.swervelib.CANDeviceID;

public class CanCoderAbsoluteConfiguration {
    private final CANDeviceID id;
    private final double offset;

    public CanCoderAbsoluteConfiguration(CANDeviceID id, double offset) {
        this.id = id;
        this.offset = offset;
    }

    public CANDeviceID getId() {
        return id;
    }

    public double getOffset() {
        return offset;
    }
}
