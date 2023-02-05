package com.swervedrivespecialties.swervelib.rev;

import com.swervedrivespecialties.swervelib.CANDeviceID;
import java.util.Objects;

public class NeoSteerConfiguration<EncoderConfiguration> {
    private final CANDeviceID motorPort;
    private final EncoderConfiguration encoderConfiguration;

    public NeoSteerConfiguration(CANDeviceID motorPort, EncoderConfiguration encoderConfiguration) {
        this.motorPort = motorPort;
        this.encoderConfiguration = encoderConfiguration;
    }

    public CANDeviceID getMotorPort() {
        return motorPort;
    }

    public EncoderConfiguration getEncoderConfiguration() {
        return encoderConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NeoSteerConfiguration<?> that = (NeoSteerConfiguration<?>) o;
        return getMotorPort().equals(that.getMotorPort()) && getEncoderConfiguration().equals(that.getEncoderConfiguration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMotorPort(), getEncoderConfiguration());
    }

    @Override
    public String toString() {
        return "NeoSteerConfiguration{" +
                "motorPort=" + motorPort +
                ", encoderConfiguration=" + encoderConfiguration +
                '}';
    }
}
